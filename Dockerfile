FROM openjdk:11-jdk-slim
#FROM openjdk:8-jdk-alpine

WORKDIR /src
COPY . /src

RUN apt-get update
RUN apt-get install -y dos2unix
RUN dos2unix gradlew

RUN bash gradlew fatJar

WORKDIR /run
RUN cp /src/build/libs/*.jar /run/server.jar

EXPOSE 8080

CMD java -jar /run/server.jar