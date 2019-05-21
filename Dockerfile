FROM maven:3.6.1-jdk-8

WORKDIR /home

ADD src /home/src
ADD pom.xml /home

RUN mvn package

CMD ["java", "-jar", "/home/target/hello-world-0.0.1-SNAPSHOT.jar"]