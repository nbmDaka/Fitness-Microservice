# Fitness Microservices

This project consists of two microservices:

- **UserService** (Port 8080): Handles user registration, authentication, and profile management using PostgreSQL
- **ActivityService** (Port 8081): Manages fitness activities and tracking using MongoDB

## Prerequisites

- Java 21
- Maven 3.6+
- Docker (for databases)

## Getting Started

### 1. Start the databases
```bash
docker-compose up -d
```

### 2. Build all services
```bash
mvn clean install
```

### 3. Run UserService (Terminal 1)
```bash
cd userservice
mvn spring-boot:run
```

### 4. Run ActivityService (Terminal 2)
```bash
cd activityservice
mvn spring-boot:run
```

## Service Endpoints

### UserService (http://localhost:8080)
- Health: `GET /actuator/health`
- User endpoints: `/api/users/...`

### ActivityService (http://localhost:8081)
- Health: `GET /actuator/health`
- Activity endpoints: `/api/activities/...`

## Database Access

- **PostgreSQL**: localhost:5432 (username: postgres, password: password)
- **MongoDB**: localhost:27017

## Development

Each service can be developed and deployed independently. The parent POM manages common dependencies and configurations.

## Build Commands

- Build all: `mvn clean install`
- Build specific service: `mvn clean install -pl userservice`
- Run tests: `mvn test`
- Package: `mvn package`
