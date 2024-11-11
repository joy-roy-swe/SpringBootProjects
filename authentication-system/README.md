# Authentication System

A robust authentication system built with Spring Boot that provides secure user authentication and authorization capabilities.

## Features

- User registration and login
- JWT (JSON Web Token) based authentication
- Role-based access control (RBAC)
- Password encryption using BCrypt
- Session management
- Secure password reset functionality
- API endpoints protection

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Security
- Spring Data JPA
- JSON Web Tokens (JWT)
- MySQL/PostgreSQL (Database)
- Maven (Build Tool)

## Project Structure

    authentication-system/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/codebind/authentication_system/
    │   │   │       ├── config/
    │   │   │       ├── controller/
    │   │   │       ├── model/
    │   │   │       ├── repository/
    │   │   │       ├── service/
    │   │   │       └── AuthenticationSystemApplication.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    └── pom.xml

## Getting Started

### Prerequisites

- JDK 17 or later
- Maven 3.6+
- Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)
- MySQL/PostgreSQL database

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/authentication-system.git
   ```

2. Navigate to the project directory:
   ```bash
   cd authentication-system
   ```

3. Configure the database connection in `src/main/resources/application.properties`

4. Build the project:
   ```bash
   mvn clean install
   ```

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/login` - Login user
- `POST /api/auth/refresh` - Refresh access token
- `POST /api/auth/logout` - Logout user

### User Management
- `GET /api/users` - Get all users (Admin only)
- `GET /api/users/{id}` - Get user by ID
- `PUT /api/users/{id}` - Update user
- `DELETE /api/users/{id}` - Delete user

## Security Features

- Password Encryption: All passwords are encrypted using BCrypt before storing in the database
- JWT Authentication: Secure token-based authentication system
- Role-Based Access: Different access levels for different user roles
- API Security: Protected endpoints with proper authorization

## Future Scope

- OAuth2 integration for social login
- Two-factor authentication (2FA)
- Email verification
- Password strength validation
- Account lockout after failed attempts
- Activity logging and monitoring
- API rate limiting
- Enhanced security features

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
