FROM alpine:latest
WORKDIR /app 
COPY    spring-boot/target/spring-boot-0.0.1-SNAPSHOT.jar /app/app.jar
RUN apk update && apk add openjdk17 
CMD [ "java","-jar","app.jar" ]
