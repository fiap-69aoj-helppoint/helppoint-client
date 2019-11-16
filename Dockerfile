FROM openjdk:8-jdk-alpine

LABEL source="https://github.com/fiap-69aoj-helppoint/helppoint-client" \
      maintainer="flavioso16@gmail.com"

ADD ./target/client-0.0.1-SNAPSHOT.jar client.jar
ADD ./docker-entrypoint.sh /

RUN chmod +x /docker-entrypoint.sh

EXPOSE 8090

ENTRYPOINT ["/docker-entrypoint.sh"]