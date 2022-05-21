# poc-modern-soap

I wanted to play around with modern methodes for developing SOAP services. It used to be quite cumbersome job to developer SOAP services (compared to REST services). So I made a list of requirements and started to trial and error different frameworks. For now I just focus on Java development.

## Requirements

- Java 17 support
- Modern standards (Jakarte EE namespaces for example)
- Health status
- Dev loop
- Docker image (x86-64 and arm64)
- Native image (x86-64 and arm64)

## Contestants

- Open Liberty
- Quarkus + CXF extension
- Quarkus + Camel
- Helidon SE
- Helidon MP
- Spring Boot + Spring WS

## Results

| Framework | Java 17 support | Jakarte EE namespaces | Health status | Dev loop | Docker image x86-64 | Docker image arm64 | Native image x86-64 | Native image arm64 | Version |
|---|---|---|---|---|---|---|---|---|---|
| Open Liberty | Yes | Yes | Yes | Yes | Yes | No | No | No | 22.0.0.5 |
| Quarkus + CXF extension | ? | No | ? | Yes | Yes | ? | Yes | ? | 2.7.5 + 0.13.1 |
| Quarkus + Camel | | | | | | | |
| Helidon SE | | | | | | | |
| Helidon MP | | | | | | | |
| Spring Boot + Spring WS | | | | | | | |
