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
package ninckblokje.poc.modern.soap.jakarta.client.mapping;

import ninckblokje.pingpong.PongResponse;
import ninckblokje.poc.modern.soap.jakarta.client.dto.ApplicationServer;
import ninckblokje.poc.modern.soap.jakarta.client.dto.Framework;
import ninckblokje.poc.modern.soap.jakarta.client.dto.Pong;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ValueMapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface PongResponseToPongMapping {

    PongResponseToPongMapping INSTANCE = Mappers.getMapper(PongResponseToPongMapping.class);

    @Mapping(source = "client.IPAddress", target = "client.ipAddress")
    @Mapping(source = "applicationServer.name", target = "applicationServer.name", qualifiedByName = "mapToApplicationServer")
    @Mapping(source = "applicationServer.framework", target = "applicationServer.framework", qualifiedByName = "mapToFramework")
    Pong map(PongResponse source);

    @Named("mapToApplicationServer")
    default ApplicationServer mapToApplicationServer(String input) {
        return ApplicationServer.fromValue(input);
    }

    @Named("mapToFramework")
    default Framework mapToFramework(String input) {
        return Framework.fromValue(input);
    }
}
