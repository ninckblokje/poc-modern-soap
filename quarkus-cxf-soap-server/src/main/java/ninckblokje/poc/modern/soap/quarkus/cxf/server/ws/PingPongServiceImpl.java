/*
 * Copyright (c) 2022, ninckblokje
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package ninckblokje.poc.modern.soap.quarkus.cxf.server.ws;

import ninckblokje.pingpong.ApplicationServerInformation;
import ninckblokje.pingpong.ClientInformation;
import ninckblokje.pingpong.PingRequest;
import ninckblokje.pingpong.PongResponse;
import ninckblokje.pingpongservice.PingPongService;
import ninckblokje.poc.modern.soap.quarkus.cxf.server.service.HostService;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.servlet.ServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceContext;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

import static ninckblokje.pingpong.ApplicationServer.QUARKUS;
import static ninckblokje.pingpong.Framework.JAKARTA_EE;

@WebService(
        name = "PingPongService",
        serviceName = "PingPongService",
        targetNamespace = "ninckblokje/PingPongService",
        endpointInterface = "ninckblokje.pingpongservice.PingPongService"
)
public class PingPongServiceImpl implements PingPongService {

    @Inject
    HostService service;
    @Resource
    private WebServiceContext ctx;

    @Override
    public PongResponse ping(PingRequest parameters) {
        var response = new PongResponse();

        response.setDateTime(now());
        response.setClient(getClientInformation());
        response.setHost(service.getHostInformation());
        response.setApplicationServer(getApplicationServerInformation());

        return response;
    }

    ApplicationServerInformation getApplicationServerInformation() {
        var info = new ApplicationServerInformation();

        info.setName(QUARKUS);
        info.setFramework(JAKARTA_EE);

        return info;
    }

    ClientInformation getClientInformation() {
        var info = new ClientInformation();

        var servletRequest = (ServletRequest) ctx.getMessageContext().get("HTTP.REQUEST");
        info.setIPAddress(servletRequest.getRemoteAddr());

        return info;
    }

    XMLGregorianCalendar now() {
        var zdt = ZonedDateTime.now();
        var gc = GregorianCalendar.from(zdt);

        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (DatatypeConfigurationException ex) {
            throw new RuntimeException(ex);
        }
    }
}
