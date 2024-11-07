# Recruitment Automation Project

This project is designed to automate the recruitment process in the OrangeHRM application using Serenity BDD with Screenplay and Cucumber, built with Java 17 and Gradle.

## Overview
This automation suite covers the login process and recruitment functionalities, including adding new candidates and verifying that the candidates match the provided information (including status as "Hired").

## Project Structure

```bash
src
├── main
│   ├── java
│   │   └── com.nespon
│   │       ├── interactions
│   │       ├── models
│   │       ├── questions
│   │       ├── tasks
│   │       └── ui
├── test
│   ├── java
│   │   └── com.nespon
│   │       ├── runners
│   │       └── stepdefinitions
│   └── resources
│       ├── features
│       ├── files
│       └── serenity.conf
```

### Key Folders and Files:

- **interactions**: Contains custom actions or browser interactions.
- **models**: Data models used within the tests.
- **questions**: Contains questions used to retrieve data from the UI.
- **tasks**: Contains tasks that encapsulate high-level actions for Screenplay actors.
- **ui**: Contains locators for interacting with the UI.
- **runners**: Test runners configured for Cucumber.
- **stepdefinitions**: Cucumber step definitions for linking Gherkin steps to Screenplay actions.
- **features**: Contains Gherkin feature files that define test scenarios.
- **files**: Contains any external data files or configurations used during the tests.
- **serenity.conf**: The configuration file for Serenity BDD.