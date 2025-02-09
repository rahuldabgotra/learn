# SpringBoot Project Generator CLI

A command-line tool to easily generate Spring Boot projects using the Spring Initializer  API. This CLI allows users to specify project details such as project name, package name, project description, packaging type, Java version, and dependencies. Then automatically generates a downloadable ZIP file containing the Spring Boot project structure.

## Project Description
**SpringGeneratorCLI** simplifies creating Spring Boot projects by providing an interactive command-line interface. Users can configure their projects easily and generate a complete Spring Boot application setup.

**Core Features:**
- Interactive prompts for project configuration.
- Support for multiple packaging types (JAR/WAR).
- Option to select Java version (17 or 21).
- Choose from various common Spring dependencies (web, JPA, security, etc.).

## Table of Contents
- [Installation and Setup](#installation-and-setup)
- [How to Use](#how-to-use)
- [Features](#features)
- [How to Contribute](#how-to-contribute)
- [Badges](#badges)
- [License](#license)

## Installation and Setup

### Prerequisites
- Java 17 or 21
- Maven

### Clone the Repository
```bash
git clone https://github.com/rahuldabgotra/SpringGeneratorCLI.git
cd SpringGeneratorCLI
```

### Build the Project
```bash
mvn clean install
```

## How to Use
Once the project is built:

- Execute the JAR file with:
```bash
java -jar target/SpringGeneratorCLI-1.0.0.jar
```

- Follow the interactive prompts to specify your project details and generate the Spring Boot project.

## Features

### Core Functionality
- **Interactive Prompts:** Users can specify project configurations easily.
- **Packaging Support:** Generate both JAR and WAR packages.
- **Java Version Selection:** Users can choose between Java 17 or 21.
- **Dependency Selection:** Options for common Spring dependencies such as Spring Web, Spring Data JPA, Spring Security, etc.

## How to Contribute
We welcome contributions to enhance the tool or add new features.

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature
   ```
3. Make your changes and commit them.
4. Submit a pull request.

### Contribution Guidelines
- Follow the code style guidelines of Java.
- Document your code properly.

## Badges
![Java](https://img.shields.io/badge/Java-17%2F21-blue) ![Spring](https://img.shields.io/badge/Spring%20Boot-3.3.4-green) ![Maven](https://img.shields.io/badge/Maven-3.2.0-orange)

## License
This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

---
