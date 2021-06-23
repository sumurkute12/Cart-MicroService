
FROM openjdk:11
EXPOSE 8002
ADD ./target/rpm-cart-microservice.jar rpm-cart-microservice.jar
ENTRYPOINT ["java","-jar","rpm-cart-microservice.jar"]



