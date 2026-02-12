# Étape de runtime : exécution de l'application
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Créer un utilisateur non-root pour la sécurité
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring

# Copier le JAR depuis l'étape de build
COPY /target/*.jar /app/app.jar
# Exposer le port Spring Boot (par défaut 8080)
EXPOSE 8080

# Démarrer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]