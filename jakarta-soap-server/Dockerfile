FROM icr.io/appcafe/open-liberty:21.0.0.12-kernel-slim-java11-openj9-ubi

COPY --chown=1001:0 /src/main/liberty/config /config

RUN features.sh

COPY --chown=1001:0 target/*.war /config/dropins

RUN configure.sh
