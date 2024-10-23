FROM openjdk:21
WORKDIR /app
COPY ./target/customer.jar /app
EXPOSE 8088
CMD ["java","-jar","customer.jar"]
