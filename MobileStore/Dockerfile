FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN javac -d out src/*.java
CMD ["java","-cp","out","MobileStore.Main"]
