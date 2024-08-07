# PatchManagement
The Patch Management System is a robust and efficient web application designed to manage and apply software patches. This system is developed using Java and Spring Boot, providing a straightforward and user-friendly interface for managing patches.
# Patch Management System

## Overview

The Patch Management System is a web application developed using Java and Spring Boot to manage and apply patches. The application provides RESTful API endpoints to list and apply patches.

## Features

- List all available patches
- Apply a specific patch
- Simple and intuitive API
- Integration with Postman for API testing

## Technologies Used

- Java
- Spring Boot
- Maven
- Postman

## Getting Started

### Prerequisites

- Java JDK 18
- Maven
- Postman (for API testing)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/patch-management-system.git
   cd patch-management-system
   
2. Build the project using Maven:
   ```bash
   mvn clean install

4. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   
5. The application should now be running on http://localhost:8080.

**API Endpoints**
1. List All Patches
Endpoint: GET /patches
Response:
   ```bash
[
  {"id": "1", "description": "Patch 1 Deployed"},
  {"id": "2", "description": "Patch 2 Deployed"},

 ]
2. Apply a Patch

Endpoint: POST /patches/{id}/apply
Response:
    ```
       {
  "id": "1",
  "description": "Patch 1 Applied"
}

    
**Project Structure
```bash
src
├── main
│   ├── java
│   │   └── org
│   │       └── example
│   │           ├── PatchManagementApplication.java
│   │           ├── controller
│   │           │   ├── PatchController.java
│   │           │   └── WelcomeController.java
│   │           ├── model
│   │           │   └── Patch.java
│   │           └── service
│   │               └── PatchService.java
│   ├── resources
│       └── templates
│           └── index.html
└── test
    └── java
        └── org
            └── example
                └── PatchManagementApplicationTests.java


