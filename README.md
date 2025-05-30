# Guidewire Automation Framework

This project is a Selenium + TestNG automation framework for Guidewire's core modules: **PolicyCenter (PC)**, **ClaimCenter (CC)**, and **BillingCenter (BC)**.

## 🔧 Technologies Used

- Java
- Selenium WebDriver
- TestNG
- WebDriverManager
- Maven

---

## 📁 Project Structure

guidewire-automation/
├── src/
│ ├── main/java/pages/ # Page Object classes
│ └── test/java/
│ ├── tests/ # Test classes for PC, CC, and BC
│ └── utils/ # Base test setup
├── pom.xml # Maven configuration
└── testng.xml # TestNG suite definition

| Test Class            | Description                       |
| --------------------- | --------------------------------- |
| `CreateNewPolicyTest` | Login and create a policy quote   |
| `FileFNOLTest`        | Login and file a new claim (FNOL) |
| `ProcessPaymentTest`  | Login and process a payment in BC |

⚙️ Requirements

Java 11 or above
Maven
Chrome browser
Internet connection (for WebDriverManager)
