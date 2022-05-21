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

package ninckblokje.poc.modern.soap.jakarta.client.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import ninckblokje.pingpongservice.PingPongService_Service;
import ninckblokje.poc.modern.soap.jakarta.server.ws.HelloWorldService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.net.MalformedURLException;
import java.net.URL;

@ApplicationScoped
public class WsClientConfig {

    @Inject
    @ConfigProperty(name = "helloworld.wsdl.url")
    String helloWorldWsdlUrl;

    @Inject
    @ConfigProperty(name = "pingpong.wsdl.url")
    String pingPongWsdlUrl;

    @Produces
    public HelloWorldService helloWorldService() throws MalformedURLException {
        return new HelloWorldService(new URL(helloWorldWsdlUrl));
    }

    @Produces
    public PingPongService_Service pingPongService() throws MalformedURLException {
        return new PingPongService_Service(new URL(pingPongWsdlUrl));
    }
}
