# 🚗 Spring XML Autowiring – Part of My Spring Journey Series

This project is part of my learning series on the **Spring Framework**, where I explore core concepts through practical examples.

In the **previous part**, I worked with **Constructor Injection**.  
In this part, I’m diving into **Autowiring by Name** using XML-based configuration.

---

## 📚 What You'll Learn

- How to configure beans using XML
- What autowiring is and how it simplifies dependency injection
- How `autowire="byName"` works internally
- How Spring maps bean IDs to matching property names in Java classes

---

## ✅ What I Learned

- Autowiring is a way to automatically inject dependencies without explicitly specifying them in the `<property>` tag.
- `autowire="byName"` works by matching the **bean ID** in the XML file with the **property name** in the class.
- If the types of injected and target classes mismatch (like if they’re in different packages), Spring throws a `ConversionNotSupportedException`.
- Proper naming, packaging, and method structure (like `setSpecification(...)`) are critical for Spring to do its job correctly.
- Clear understanding of the **difference between constructor-based injection and setter-based injection** in terms of flexibility and control.

---

## 📁 Project Structure

src/
└── org/
└── autowire/
├── CAR.java
├── Specification.java
└── App.java
resources/
└── AutoWire.xml


---

## 🛠 Tech Stack

- Java 17
- Spring Core (XML Configuration)
- IDE: IntelliJ

---

## ⚙️ How to Run

1. Clone or download the project.
2. Add Spring JARs to your classpath (or set up Maven if preferred).
3. Run the `App.java` class.
4. The console will display the `CAR` object with the injected `Specification`.

---

## 🧩 Sample XML Configuration

```xml
<bean id="specification" class="org.autowire.Specification">
    <property name="make" value="Toyota"/>
    <property name="model" value="Corolla"/>
</bean>

<bean id="myCar" class="org.autowire.CAR" autowire="byName"/>
```
✍️ Author - **Suvro Halder**

Documenting my Spring Framework journey step by step.
Currently exploring Spring Core, Bean Lifecycle, and various Dependency Injection strategies.


