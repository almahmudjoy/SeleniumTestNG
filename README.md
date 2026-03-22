🚀 Selenium TestNG Automation Project

A structured Selenium automation framework built using Java + TestNG + Maven, following a clean and scalable test architecture.

👨‍💻 About This Project

This project demonstrates hands-on experience with:

Web automation using Selenium WebDriver
Test execution and lifecycle using TestNG
Clean project structure (Base + Tests separation)
Real-world UI interaction handling

It is designed as a foundation for becoming a professional SQA Engineer.

🧰 Tech Stack
Language: Java
Automation Tool: Selenium WebDriver
Test Framework: TestNG
Build Tool: Maven
IDE: IntelliJ IDEA
📁 Project Structure (Updated)
SeleniumTestNG/
│
├── src/main/java/
│   ├── base/
│   │   └── BaseTest.java
│   │
│   └── tests/
│       ├── AlertTest.java
│       ├── BrowserCommandsTest.java
│       ├── CopyPasteTest.java
│       ├── LocatorsTest.java
│       ├── MouseHoverTest.java
│       ├── NavigationTest.java
│       ├── ScrollTest.java
│       ├── SelectDropdownTest.java
│       ├── TestNGAnnotationsTest.java
│       └── WebElementCommandsTest.java
│
├── testng.xml
├── pom.xml
└── README.md
🧪 Features / Test Coverage
✔️ Browser Commands
open()
close()
maximize()
✔️ Navigation
back()
forward()
refresh()
✔️ Locator Strategies
ID
Name
Class
Link Text
XPath
CSS Selector
✔️ WebElement Actions
click()
sendKeys()
getText()
✔️ Advanced Handling
Alerts
Dropdown (Select class)
Mouse Hover
Scroll
Copy-Paste actions
✔️ TestNG Concepts
@BeforeSuite / @AfterSuite
@BeforeClass / @AfterClass
@BeforeMethod / @AfterMethod
Test Prioritization
🧱 Framework Design
🔹 Base Layer

BaseTest.java

WebDriver setup & teardown
Common browser configuration
🔹 Test Layer

All test cases:

Extend BaseTest
Contain test logic only

👉 This separation follows real-world automation framework design

▶️ How to Run
1️⃣ Clone the Repository
git clone https://github.com/almahmudjoy/SeleniumTestNG.git
2️⃣ Open in IntelliJ IDEA
File → Open → Select project folder
3️⃣ Install Dependencies
mvn clean install
4️⃣ Run Tests

👉 Option 1: Run testng.xml
👉 Option 2: Run individual test classes

⚠️ Important Notes
Chrome browser is used
ChromeDriver is not stored in GitHub (good practice ✅)
Avoid using Thread.sleep() → use WebDriverWait (Explicit Wait)
🔥 Sample Code (Locator Example)
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("test@gmail.com");
🚀 Future Improvements
Page Object Model (POM)
Data-driven testing (Excel / JSON)
Reporting (Allure / Extent Reports)
CI/CD integration (GitHub Actions)
Parallel execution
📊 Project Status

🟢 Active Learning Project
🟢 Structured Framework Ready
🟢 Continuously Improving

👤 Author

Abdullah Al Mahmud Joy
🎓 CSE Student
💻 Aspiring SQA Engineer & Future Lecturer

🌐 Connect With Me
LinkedIn: https://www.linkedin.com/in/abdullah-al-mahmud-joy-359112202/
Email: abdullahalmahmudjoy39@gmail.com
⭐ Support

If you find this project helpful:

👉 Give it a star ⭐ on GitHub
👉 Fork and practice

💡 Final Note

This project reflects my journey toward becoming a professional Software Quality Assurance Engineer.

More advanced automation frameworks are coming soon 🚀
