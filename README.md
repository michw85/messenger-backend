# Messenger Backend

Real-time messaging backend built with Spring Boot and WebSocket.

## 🚀 Features

- Real-time messaging with WebSocket (STOMP protocol)
- User authentication with JWT
- Chat rooms support
- Message persistence with MySQL
- Session management with Redis
- REST API for file uploads

## 🛠️ Tech Stack

- **Java 17** - Core language
- **Spring Boot 3.2.4** - Application framework
- **Spring WebSocket** - Real-time communication
- **Spring Security** - Authentication & authorization
- **Spring Data JPA** - Database operations
- **MySQL** - Primary database
- **Redis** - Session storage
- **JWT** - Token-based authentication
- **Gradle** - Build tool

## 📋 Prerequisites

- JDK 17 or later
- MySQL 8.0+
- Redis 7.0+
- Gradle 8.5+ (or use wrapper)

## 🔧 Installation

### 1. Clone the repository

bash
git clone https://github.com/YOUR_USERNAME/messenger-backend.git
cd messenger-backend

## 2. Configure database
Create MySQL database:

sql
CREATE DATABASE messenger;
Update src/main/resources/application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/messenger
spring.datasource.username=your_username
spring.datasource.password=your_password

## 3. Configure Redis
Ensure Redis is running on localhost:6379:

bash
redis-server

## 4. Build and run
bash
# Using Gradle wrapper
./gradlew clean build
./gradlew bootRun

# Or using your local Gradle
gradle clean build
gradle bootRun
The server will start on http://localhost:8080

## 📡 WebSocket Endpoints
Endpoint	Description
/ws	WebSocket connection endpoint
/app/chat.send/{roomId}	Send message to room
/topic/room/{roomId}	Subscribe to room messages

## 🗄️ Database Schema
users - User accounts and profiles

chat_rooms - Chat rooms information

chat_participants - Room participants

messages - Chat messages history

media_files - Uploaded files metadata

## 🔐 API Endpoints
Method	Endpoint	Description
POST	/api/auth/login	User login
POST	/api/auth/register	User registration
POST	/api/media/upload	Upload file
GET	/api/media/download/{id}	Download file

## 🧪 Testing
bash

# Run tests
./gradlew test

# Run with coverage
./gradlew test jacocoTestReport

## 📁 Project Structure
text
src/main/java/org/example/protomessenger/
├── configuration/     # Spring configuration (WebSocket, Security)
├── controller/        # REST and WebSocket controllers
├── dto/              # Data transfer objects
├── entity/           # JPA entities
├── repository/       # Data repositories
├── service/          # Business logic
└── converter/        # Type converters

## 🤝 Contributing
Fork the repository

Create a feature branch

Commit your changes

Push to the branch

Open a Pull Request

## 📄 License
MIT License - feel free to use this project for learning or as a template.

## 🙏 Acknowledgments
Spring Boot team for excellent framework

STOMP protocol for WebSocket messaging
