# Spring Boot Boilerplate Setup Guide

This guide will help you set up and run the [Spring Boot Boilerplate](https://github.com/Prem-Dharshan/springboot_boilerplate) application locally.

---

## Prerequisites

Before you start, ensure you have the following installed on your machine:

- **Java Development Kit (JDK)**: Ensure you have JDK 21 (or the required version installed for your setup).
    - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
    - Verify installation:
      ```bash
      java -version
      ```
- **Gradle**: (Optional) The project includes the Gradle Wrapper, so you don't need a system-wide Gradle installation.
    - [Download Gradle](https://gradle.org/install/)
    - Verify installation:
      ```bash
      gradle -v
      ```
- **Resources**: Go through the Resources mentioned in the file below. Learn the stack by doing the Udemy Course
    - [Resources](./RESOURCES.md)

---

## Setup Instructions

### Step 1: Clone or Fork the Repository
Clone the repository using the following command:
```bash
git clone https://github.com/Prem-Dharshan/springboot_boilerplate.git
```
Navigate to the project directory:
```bash
cd springboot_boilerplate
```

Alternatively, fork the repository and clone it from your fork.

---

### Step 2: Update the Java Version in `build.gradle`
Open the `build.gradle` file and ensure the Java version matches the version installed on your machine. Modify the `java.toolchain` block as follows:

```gradle
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21) // Replace 21 with your desired Java version
    }
}
```

Save the file after making the changes.

---

### Step 3: Update Gradle Wrapper Version (if necessary)
If your Gradle version is outdated, update it in the `gradle-wrapper.properties` file:

1. Open the file located at `gradle/wrapper/gradle-wrapper.properties`.
2. Update the `distributionUrl` to the desired Gradle version. For example:
   ```properties
   distributionUrl=https\://services.gradle.org/distributions/gradle-8.3-bin.zip
   ```

You can check the [Gradle Releases Page](https://gradle.org/releases/) to find the latest version.

---

### Step 4: Build the Project
Run the Gradle build command to compile the application:
```bash
./gradlew build
```
> On Unix-based systems, if you encounter permission issues, use:
> ```bash
> chmod +x gradlew
> ./gradlew build
> ```

---

### Step 5: Run the Application
Start the application with the following command:
```bash
./gradlew bootRun
```

---

### Step 6: Access the Application
Once the application starts, it will be accessible at:
- **URL**: [http://localhost:8080](http://localhost:8080)

---

## Troubleshooting

### Common Issues and Fixes:
1. **Build Fails**:
    - Ensure the correct Java version is installed and matches the `build.gradle` configuration.
    - Clean the project if you encounter issues:
      ```bash
      ./gradlew clean
      ```

2. **Port Already in Use**:
    - Stop the existing process running on port 8080 or modify the `server.port` property in `src/main/resources/application.properties`:
      ```properties
      server.port=8081
      ```

3. **Gradle Version Compatibility**:
    - If you encounter issues due to an outdated Gradle version, ensure the `distributionUrl` in `gradle-wrapper.properties` points to a compatible version of Gradle for your Java version.

---

## Contributing
If you make improvements or fixes, consider contributing by opening a pull request to the original repository.

---

## Additional Commands
- To run tests:
  ```bash
  ./gradlew test
  ```

- To clean the project:
  ```bash
  ./gradlew clean
  ```

- To generate a JAR file:
  ```bash
  ./gradlew bootJar
  ```

---

Enjoy coding with the Spring Boot Boilerplate! 🚀
