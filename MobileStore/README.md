# MobileStore

A Java-based mobile store management system built with Object-Oriented Programming principles and containerized using Docker.

---

## Features

- Manage mobile store inventory
- Add and handle phones with battery details
- Object-Oriented design — Classes, Objects, Composition
- Package-based structure (`MobileStore`)
- Dockerized execution — runs anywhere
- Console-based output system

---

## Tech Stack

- **Language:** Java 17
- **Runtime:** Eclipse Temurin JDK 17
- **Containerization:** Docker
- **Environment:** Linux Container

---

## Project Structure

```
MobileStore/
├── src/
│   └── MobileStore/
│       ├── Main.java
│       ├── Store.java
│       ├── Phone.java
│       └── Battery.java
├── out/               ← generated during Docker build
├── Dockerfile
└── README.md
```

---

## How to Run with Docker

**Build the image**
```bash
docker build -t mobilestore-app .
```

**Run the container**
```bash
docker run -it mobilestore-app
```

**Container debbuging**
```
docker run -it mobilestore-app /bin/bash
```
**Manual run (inside container)**
```bash
java -cp out MobileStore.Main
```

---

## Important Notes

> Package name **must** match folder structure — `MobileStore` folder = `MobileStore` package.

Always compile with:
```bash
javac -d out src/MobileStore/*.java
```

Always run with:
```bash
java -cp out MobileStore.Main
```

---

## Key Learnings

- Java package system and classpath (`-cp`) usage
- OOP design — `Phone`, `Battery`, `Store` classes
- Docker image vs container lifecycle
- Compiling and running Java inside Docker
- Real-world debugging of Java applications

---

## Author

**Hanan Qaisar**  
GitHub: [hananqaisar-commits](https://github.com/hananqaisar-commits)  
LinkedIn: [hanan-qaisar](https://www.linkedin.com/in/hanan-qaisar-22b0b6368/)
