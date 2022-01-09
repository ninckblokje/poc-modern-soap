package ninckblokje.poc.modern.soap.quarkus.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApplicationServer
 */
public enum ApplicationServer {
  
  HELIDON_SE("Helidon SE"),
  
  HELIDON_MP("Helidon MP"),
  
  OPEN_LIBERTY("Open Liberty"),
  
  QUARKUS("Quarkus"),
  
  SPRING_BOOT("Spring Boot");

  private String value;

  ApplicationServer(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApplicationServer fromValue(String value) {
    for (ApplicationServer b : ApplicationServer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


