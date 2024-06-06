FROM openjdk:17-jdk-slim
ARG JAR_FILE=target1/HouseKeeper-1.jar
COPY ${JAR_FILE} app_house_keeper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_house_keeper.jar"]