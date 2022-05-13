FROM openjdk:11
EXPOSE 8080
ADD target/springboot-cicd-new.jar springboot-cicd-new.jar
ENTRYPOINT ["java","jar","/springboot-cicd-new.jar"]