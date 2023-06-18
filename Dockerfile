FROM maven:3.8.1-openjdk-17

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

CMD ["java", "-jar", "target/shop-car-0.0.1-SNAPSHOT.jar"]
