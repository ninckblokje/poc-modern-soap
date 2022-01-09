package ninckblokje.poc.modern.soap.quarkus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.Valid;
import java.util.Objects;



@JsonTypeName("Pong")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-01-09T18:17:43.849250700+01:00[Europe/Berlin]")public class Pong   {
  
  private @Valid String dateTime;
  private @Valid ClientInformation client;
  private @Valid HostInformation host;
  private @Valid ApplicationServerInformation applicationServer;

  /**
   **/
  public Pong dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  

  
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }

  @JsonProperty("dateTime")
  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

/**
   **/
  public Pong client(ClientInformation client) {
    this.client = client;
    return this;
  }

  

  
  @JsonProperty("client")
  public ClientInformation getClient() {
    return client;
  }

  @JsonProperty("client")
  public void setClient(ClientInformation client) {
    this.client = client;
  }

/**
   **/
  public Pong host(HostInformation host) {
    this.host = host;
    return this;
  }

  

  
  @JsonProperty("host")
  public HostInformation getHost() {
    return host;
  }

  @JsonProperty("host")
  public void setHost(HostInformation host) {
    this.host = host;
  }

/**
   **/
  public Pong applicationServer(ApplicationServerInformation applicationServer) {
    this.applicationServer = applicationServer;
    return this;
  }

  

  
  @JsonProperty("applicationServer")
  public ApplicationServerInformation getApplicationServer() {
    return applicationServer;
  }

  @JsonProperty("applicationServer")
  public void setApplicationServer(ApplicationServerInformation applicationServer) {
    this.applicationServer = applicationServer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pong pong = (Pong) o;
    return Objects.equals(this.dateTime, pong.dateTime) &&
        Objects.equals(this.client, pong.client) &&
        Objects.equals(this.host, pong.host) &&
        Objects.equals(this.applicationServer, pong.applicationServer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, client, host, applicationServer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pong {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    applicationServer: ").append(toIndentedString(applicationServer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

