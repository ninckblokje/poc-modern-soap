package ninckblokje.poc.modern.soap.quarkus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.Valid;
import java.util.Objects;



@JsonTypeName("ApplicationServerInformation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-01-09T18:17:43.849250700+01:00[Europe/Berlin]")public class ApplicationServerInformation   {
  
  private @Valid ApplicationServer name;
  private @Valid Framework framework;

  /**
   **/
  public ApplicationServerInformation name(ApplicationServer name) {
    this.name = name;
    return this;
  }

  

  
  @JsonProperty("name")
  public ApplicationServer getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(ApplicationServer name) {
    this.name = name;
  }

/**
   **/
  public ApplicationServerInformation framework(Framework framework) {
    this.framework = framework;
    return this;
  }

  

  
  @JsonProperty("framework")
  public Framework getFramework() {
    return framework;
  }

  @JsonProperty("framework")
  public void setFramework(Framework framework) {
    this.framework = framework;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationServerInformation applicationServerInformation = (ApplicationServerInformation) o;
    return Objects.equals(this.name, applicationServerInformation.name) &&
        Objects.equals(this.framework, applicationServerInformation.framework);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, framework);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationServerInformation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
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

