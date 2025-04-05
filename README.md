# Spring Boot 3 REST API Sample

This is a sample REST API implementation built with Spring Boot 3. It demonstrates basic REST API concepts including endpoint creation, request handling, and response formatting.

## Overview

This project serves as a demonstration sample for converting Spring Boot REST APIs to Model Context Protocol (MCP) using [spring-rest-to-mcp](https://github.com/addozhang/spring-rest-to-mcp).

## Technologies

- Java 17
- Spring Boot 3.4.2
- Spring Web

## API Endpoints

The application exposes the following REST endpoints:

### Hello Controller

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/hi` | GET | Returns a simple "Hello, world" message |
| `/hi/{name}` | GET | Returns a personalized greeting message for the specified name |

### User Controller

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/users` | GET | Returns a list of all users |
| `/users` | POST | Adds a new user to the system |

## Running the Application

The application runs on port 8080 by default. To start the application:

```bash
mvn spring-boot:run
```

## Project Structure

- `SpringMainApp.java` - Application entry point
- Controllers:
  - `HelloController.java` - Basic greeting endpoints
  - `UserController.java` - User management endpoints

## Purpose

This sample Spring Boot REST API is designed to demonstrate how to convert traditional REST APIs to MCP (Model Context Protocol) using the [spring-rest-to-mcp](https://github.com/addozhang/spring-rest-to-mcp) tool.