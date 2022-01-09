package ninckblokje.poc.modern.soap.quarkus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.Valid;
import java.util.Objects;



@JsonTypeName("ClientInformation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-01-09T18:17:43.849250700+01:00[Europe/Berlin]")public class ClientInformation   {
  
  private @Valid String ipAddress;

  /**
   **/
  public ClientInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  

  
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }

  @JsonProperty("ipAddress")
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInformation clientInformation = (ClientInformation) o;
    return Objects.equals(this.ipAddress, clientInformation.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInformation {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

