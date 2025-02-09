# Task Manager App

A simple task management application built using Flask, designed to help users organize, create, and manage their tasks efficiently.

## Project Description

The **Task Manager App** allows users to create, update, and delete tasks, providing a clean interface for task management.  
- **Core Features**: Task creation, editing, and deletion with user authentication and session management.
- **Technology Stack**: The application is powered by Flask for the backend, with SQLite as the database, and supports user authentication with JWT for secure access.
- **Challenges & Future Enhancements**: Key challenges included secure authentication and implementing efficient task sorting. Planned improvements include adding more task management features such as priorities, due dates, and notifications.

## Table of Contents

- [Installation and Setup](#installation-and-setup)
- [How to Use](#how-to-use)
- [Features](#features)
- [How to Contribute](#how-to-contribute)
- [Badges](#badges)
- [License](#license)

## Installation and Setup

### Prerequisites
- **Python 3.7+**
- **Flask**
- **SQLite**

### Set Up the Virtual Environment

1. **Create a Virtual Environment**:
   ```bash
   py -3 -m venv .venv
   ```

2. **Activate the Virtual Environment**:
   - For Windows:
     ```bash
     .venv\Scripts\activate
     ```
   - For Mac/Linux:
     ```bash
     source .venv/bin/activate
     ```

3. **Install Dependencies**:
   ```bash
   pip install -r requirements.txt
   ```

### Run the Application

To start the Flask application:

```bash
python app.py
```

The app will be available at `http://127.0.0.1:5000`.

### Generate Secret Keys (Optional)

If you need to generate secret keys for session or JWT:

```python
import secrets
secret_key = secrets.token_hex(16)
print(secret_key)

jwt_secret_key = secrets.token_urlsafe(32)
print(jwt_secret_key)
```

### Viewing Logs

Logs are written to the `app.log` file. To view logs in real-time:

```bash
tail -f app.log
```

## How to Use

After starting the app:
- **Home Page**: Access the task manager interface where users can add, edit, or delete tasks.
- **User Authentication**: Register or log in to manage personal tasks, with JWT tokens used to secure the session.
- **Task Management**: Create new tasks, mark tasks as completed, or delete tasks when no longer needed.

## Features

- **Task CRUD**: Create, Read, Update, and Delete tasks.
- **User Authentication**: Secure JWT-based authentication for task management.
- **Logging**: View detailed application logs for debugging and monitoring.

## How to Contribute

We welcome contributions to enhance the Task Manager App.

1. **Fork the repository**.
2. **Create a feature branch**:
   ```bash
   git checkout -b feature/your-feature
   ```
3. **Make your changes** and commit them.
4. **Submit a pull request**.

### Contribution Guidelines
- Follow Flask coding standards.
- Ensure the code is well-documented and tested.

## Badges

![Python](https://img.shields.io/badge/Python-3.7+-blue.svg) ![Flask](https://img.shields.io/badge/Flask-3.0.1-green.svg)

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.
