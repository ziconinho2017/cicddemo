FROM openjdk:11
EXPOSE 8081
ADD target/springboot-cicd-new.jar springboot-cicd-new.jar
ENTRYPOINT ["java","jar","/springboot-cicd-new.jar"]