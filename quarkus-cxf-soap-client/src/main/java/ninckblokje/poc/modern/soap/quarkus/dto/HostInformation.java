package ninckblokje.poc.modern.soap.quarkus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.Valid;
import java.util.Objects;



@JsonTypeName("HostInformation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-01-09T18:17:43.849250700+01:00[Europe/Berlin]")public class HostInformation   {
  
  private @Valid String hostName;
  private @Valid String architecture;
  private @Valid String operatingSystem;

  /**
   **/
  public HostInformation hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  

  
  @JsonProperty("hostName")
  public String getHostName() {
    return hostName;
  }

  @JsonProperty("hostName")
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

/**
   **/
  public HostInformation architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  

  
  @JsonProperty("architecture")
  public String getArchitecture() {
    return architecture;
  }

  @JsonProperty("architecture")
  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

/**
   **/
  public HostInformation operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  

  
  @JsonProperty("operatingSystem")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  @JsonProperty("operatingSystem")
  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostInformation hostInformation = (HostInformation) o;
    return Objects.equals(this.hostName, hostInformation.hostName) &&
        Objects.equals(this.architecture, hostInformation.architecture) &&
        Objects.equals(this.operatingSystem, hostInformation.operatingSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostName, architecture, operatingSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostInformation {\n");
    
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
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

