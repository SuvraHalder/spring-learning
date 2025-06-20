# 🔄 Loose Coupling Challenge – Spring Constructor Injection

### 📌 Objective
Demonstrate **Loose Coupling** using Spring Framework's **Constructor Injection** technique, where the `UserManager` depends on an interface (`UserDataProvider`) and is injected with different implementations at runtime.

---

### 🧱 Project Structure

| File                          | Purpose |
|------------------------------|---------|
| `App.java`                   | Main class that loads Spring context and tests all providers |
| `UserManager.java`           | Uses `UserDataProvider` via constructor |
| `UserDataProvider.java`      | Interface for loose coupling |
| `NewDataBaseProvider.java`   | First implementation of provider |
| `UserDatabaseProvider.java`  | Second implementation |
| `WebServiceProvider.java`    | Third implementation |
| `Loose_Coupling.xml`         | Spring XML configuration for all beans |

---

### 🧪 Output (Expected)

DataBase Provided
User Details Provided
WebService Provided


Each `UserManager` bean is initialized with a different `UserDataProvider` implementation, showcasing how easy it is to swap dependencies without modifying the main logic — **classic loose coupling**!

---

### 🧠 Key Concepts Practiced

- ✅ Inversion of Control (IoC)
- ✅ Constructor-based Dependency Injection
- ✅ Loose Coupling using Interfaces
- ✅ XML-based Bean Configuration

---

### 🔧 Technologies Used

- Java 17
- Spring Core Framework (XML-based config)

---

### 💬 Notes

This is a foundational concept in building maintainable and testable applications using Spring. By depending on **interfaces** instead of concrete classes, you make the system more flexible and easier to scale.

---

### 👨‍💻 Author

**Suvra Halder**  
Learning Spring Framework | Core Java | Clean Architecture
