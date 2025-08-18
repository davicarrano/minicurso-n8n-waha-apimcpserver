FROM maven:3.9.9-eclipse-temurin-17 AS builder

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo de definição de dependências primeiro para aproveitar o cache
COPY pom.xml .
COPY src ./src

# Faz o build da aplicação e gera o JAR
RUN mvn clean package -DskipTests

# Etapa 2: Runtime da aplicação (imagem menor e mais leve)
FROM eclipse-temurin:17-jdk-jammy

# Define o diretório de trabalho dentro da imagem final
WORKDIR /app

# Copia o JAR gerado na etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Expõe a porta usada pelo Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
