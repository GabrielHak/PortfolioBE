FROM amazoncorretto:17

MAINTAINER gabiHak

COPY target/PortfolioBE-0.0.1-SNAPSHOT.jar PortfolioBE-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/PortfolioBE-0.0.1-SNAPSHOT.jar"]


