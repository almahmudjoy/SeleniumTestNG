# 🚀 Selenium TestNG Automation Project

A structured Selenium automation framework built using **Java + TestNG + Maven**, covering core web automation concepts and real-world test scenarios.

---

## 👨‍💻 About This Project

This project demonstrates hands-on experience with:

* Web automation using Selenium WebDriver
* Test execution and lifecycle using TestNG
* Different locator strategies
* Handling real-world UI interactions

It is designed as a **foundation for becoming a professional SQA Engineer**.

---

## 🧰 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **IDE:** IntelliJ IDEA

---

## 📁 Project Structure

```
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

---

## 🧪 Features / Test Coverage

✔️ Browser Commands (open, close, maximize)
✔️ Navigation (back, forward, refresh)
✔️ Locator Strategies

* ID
* Name
* Class
* Link Text
* XPath
* CSS Selector

✔️ WebElement Actions

* click()
* sendKeys()
* getText()

✔️ Advanced Handling

* Alerts
* Dropdown (Select)
* Mouse Hover
* Scroll
* Copy-Paste actions

✔️ TestNG Concepts

* @BeforeSuite / @AfterSuite
* @BeforeClass / @AfterClass
* @BeforeMethod / @AfterMethod
* Test Prioritization

---

## ▶️ How to Run

### 1️⃣ Clone the Repository

```
git clone https://github.com/almahmudjoy/SeleniumTestNG.git
```

### 2️⃣ Open in IntelliJ IDEA

* File → Open → Select project folder

### 3️⃣ Install Dependencies

Maven will auto-download dependencies
(or run manually):

```
mvn clean install
```

### 4️⃣ Run Tests

👉 Option 1: Run `testng.xml.`
👉 Option 2: Run individual test classes

---

## ⚠️ Important Notes

* Chrome browser is used
* ChromeDriver is managed locally (not pushed to GitHub)
* Avoid using `Thread.sleep()` in real projects → use **Explicit Wait** instead

---

## 🔥 Sample Code (Locator Example)

```java
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("test@gmail.com");
```

---

## 🚀 Future Improvements

* Page Object Model (POM) structure
* Data-driven testing (Excel / JSON)
* Reporting (Allure / Extent Report)
* CI/CD integration (GitHub Actions)
* Parallel execution

---


## 📊 Project Status

🟢 Active Learning Project
🟢 Continuously Improving

---

## 👤 Author

**Abdullah Al Mahmud Joy**
🎓 CSE Student
💻 Aspiring SQA Engineer and Future Lecturer

---

## 🌐 Connect With Me

* LinkedIn: https://www.linkedin.com/in/abdullah-al-mahmud-joy-359112202/
* Email: [abdullahalmahmudjoy39@gmail.com](mailto:abdullahalmahmudjoy39@gmail.com)

---

## ⭐ Support

If you find this project helpful:

👉 Give it a **star ⭐ on GitHub**
👉 Fork and practice

---

## 💡 Final Note

This project is part of my journey to becoming a **professional Software Quality Assurance Engineer**.
More advanced automation frameworks coming soon 🚀


Now change readme file, give me the full update file
