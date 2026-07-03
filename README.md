# Selenium BDD Automation Framework

A comprehensive test automation framework built with Selenium WebDriver, Cucumber, and JUnit for end-to-end testing of web applications using Behavior-Driven Development (BDD) principles.

## 📋 Overview

This project demonstrates a professional-grade automation testing framework with clean code architecture, robust test organization, and CI/CD integration. It showcases best practices in test automation including the Page Object Model (POM), comprehensive test coverage, and detailed reporting.

## 🛠️ Technology Stack

- **Language:** Java 17
- **Automation Tool:** Selenium WebDriver 4.40.0
- **Testing Framework:** JUnit 5 (Jupiter)
- **BDD Framework:** Cucumber 7.18.0
- **Build Tool:** Maven
- **CI/CD:** Jenkins (Planned)
- **Reporting:** Cucumber HTML Reports
- **Dependencies Management:** Maven

## ✨ Features

- ✅ **Page Object Model (POM)** - Maintainable and scalable test structure
- ✅ **Cucumber Integration** - Readable feature files with Gherkin syntax
- ✅ **BDD Approach** - Tests written in plain English for better collaboration
- ✅ **Comprehensive Hooks** - Before/After test execution setup and teardown
- ✅ **Configuration Management** - External configuration using properties files
- ✅ **WebDriver Management** - Centralized driver initialization and cleanup
- ✅ **Utility Classes** - Reusable helper methods for common operations
- ✅ **HTML Reporting** - Detailed test reports with screenshots
- ✅ **Parallel Test Execution** - Support for running tests concurrently
- ✅ **Tag-based Filtering** - Run specific test scenarios using tags (@smoke, @regression, etc.)

## 📁 Project Structure

```
Cucumber-BDD-Junit/
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   └── com/yahya/
│   │   │       ├── pages/              # Page Object Model classes
│   │   │       │   ├── GoogleHomePage.java
│   │   │       │   └── LibraryPage.java
│   │   │       ├── runners/            # Cucumber test runners
│   │   │       │   └── CukesRunner.java
│   │   │       ├── step_definitions/   # Cucumber step implementations
│   │   │       │   ├── Google_StepDef.java
│   │   │       │   ├── Library_StepDef.java
│   │   │       │   └── Hooks.java
│   │   │       └── utils/              # Utility classes
│   │   │           ├── Driver.java
│   │   │           ├── ConfigReader.java
│   │   │           └── BrowserUtil.java
│   │   └── resources/
│   │       ├── features/               # Cucumber feature files
│   │       │   ├── GoogleSearch.feature
│   │       │   └── Login.feature
│   │       └── config.properties       # Configuration file
├── target/
│   └── cucumber-report.html           # Generated test reports
├── pom.xml                            # Maven configuration
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- Chrome/Firefox browser
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/Cucumber-BDD-Junit.git
   cd Cucumber-BDD-Junit
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Configure test properties**
    - Update `src/test/resources/config.properties` with your test URLs and credentials:
   ```properties
   google_url=https://google.com
   weborder_url=http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx
   weborder_username=Tester
   weborder_password=test
   browser=chrome
   ```

## 📝 Running Tests

### Run All Tests
```bash
mvn clean test
```

### Run Specific Test Runner
```bash
mvn clean test -Dtest=CukesRunner
```

### Run Tests with Specific Tags
```bash
mvn clean test -Dgroups="@smoke"
```

### Run Tests with Specific Tag Expression
```bash
mvn clean test -Dgroups="@smoke and not @wip"
```

### Run from IDE
- Right-click on `CukesRunner.java` → Run

## 🧪 Test Organization

### Cucumber Features
Features are written in Gherkin syntax for readability:
```gherkin
Feature: Google Search Functionality
  Scenario: User can search on Google
    Given user is on Google homepage
    When user enters "Selenium" in search box
    Then user should see search results
```

### Step Definitions
Each feature file has corresponding step implementations in the `step_definitions` package, organized by feature domain.

### Page Object Model
Each page is represented as a class with:
- Element locators using `@FindBy` annotations
- Methods representing page actions
- Centralized element management

## 📊 Test Reports

After test execution, an HTML report is generated:
```
target/cucumber-report.html
```

Reports include:
- Test execution summary
- Scenario-by-scenario breakdown
- Step details
- Failure diagnostics
- Screenshots (when integrated)

## 🔧 Configuration Management

The framework uses an external configuration file (`config.properties`) for:
- Application URLs
- Test credentials
- Browser selection
- Timeout values

Accessed via `ConfigReader.read("key")` throughout the framework.

## 🪝 Hooks

Pre and post-test setup/teardown operations are managed in `Hooks.java`:
- Browser initialization (@Before)
- Browser cleanup (@After)
- Screenshot capture on failure
- Scenario-specific setup

## 🔌 Driver Management

WebDriver is centralized in `Driver.java`:
- Single instance management
- WebDriverManager for automatic driver downloads
- Singleton pattern for thread safety
- Easy driver switching between browsers

## 📈 Best Practices Implemented

- ✅ DRY (Don't Repeat Yourself) - Reusable utility methods
- ✅ SOLID Principles - Clean code architecture
- ✅ Page Object Model - Maintainable element management
- ✅ Explicit Waits - Reliable element interaction
- ✅ Meaningful Assertions - Clear test validation
- ✅ Descriptive Test Names - Self-documenting code
- ✅ Configuration Externalization - Environment flexibility
- ✅ Error Handling - Graceful failure management

## 🚦 CI/CD Integration (Planned)

### Jenkins Integration
- Automated test execution on code push
- Scheduled test runs
- Test result reporting
- Email notifications
- Pipeline configuration included

## 💡 How to Extend

### Add a New Feature
1. Create feature file in `src/test/resources/features/`
2. Create page class in `com.yahya.pages/`
3. Create step definitions in `com.yahya.step_definitions/`
4. Add configuration to `config.properties` if needed
5. Add @Before/@After hooks if required

### Add a New Page
1. Create class in `pages/` package
2. Use `@FindBy` annotations for elements
3. Implement page methods
4. Use in step definitions

## 📚 Key Classes

| Class | Purpose |
|-------|---------|
| `Driver.java` | WebDriver instance management |
| `ConfigReader.java` | Configuration file reading |
| `BrowserUtil.java` | Browser utility methods |
| `CukesRunner.java` | Cucumber test runner |
| `Hooks.java` | Before/After test hooks |

## 🐛 Troubleshooting

**Tests not found:**
- Ensure feature files are in `src/test/resources/features/`
- Check step definitions are in correct package: `com.yahya.step_definitions`
- Verify `CukesRunner` configuration matches your package structure

**WebDriver issues:**
- Clear browser cache
- Ensure Chrome/Firefox is installed
- Check WebDriverManager dependency

**Assertion failures:**
- Review explicit waits in `BrowserUtil.java`
- Check element locators in page classes
- Verify test data in `config.properties`

## 📝 Example Test Case

```java
@Test
public void googleSearchTest() {
    GoogleHomePage page = new GoogleHomePage();
    page.goTo();
    page.searchKeyword("Selenium");
    assertTrue(page.resultsDisplayed());
}
```

## 🔐 Security Notes

- Never commit credentials to repository
- Use environment variables for sensitive data
- Keep `config.properties` in `.gitignore` for production credentials

## 📄 License

This project is open source and available under the MIT License.

## 👤 Author

**Your Name**
- GitHub: [@yourusername](https://github.com/yourusername)
- Email: your.email@example.com

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📞 Contact

For questions or suggestions, please open an issue or contact me directly.

---

**Last Updated:** 2024
**Framework Version:** 1.0