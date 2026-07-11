# Design Patterns in Java 🚀

A comprehensive guide and reference repository demonstrating standard software design patterns. This repository serves as a theoretical and structural guide for writing clean, scalable, and maintainable object-oriented systems.

---

## 1. The Three Pillars of Design Patterns

Design patterns are widely accepted solutions to recurring problems in software design. They are categorized into three main types based on their underlying purpose:

* **Creational Patterns:** Focus on handling object creation mechanisms. They abstract the instantiation process, decoupling the system from how its objects are created, composed, and represented. *(Examples: Singleton, Builder, Factory, Prototype)*
* **Structural Patterns:** Focus on object composition and relationships. They ensure that if one part of a system changes, the entire structure does not need to be rewritten. They help in forming large object structures while keeping them flexible and efficient. *(Examples: Adapter, Decorator, Facade)*
* **Behavioral Patterns:** Focus on communication, interaction, and the assignment of responsibilities between objects. They help define how objects operate and transfer control. *(Examples: Strategy, Observer, Command)*

---

## 2. Singleton Pattern
The Singleton pattern ensures that a class has only **one** instance globally and provides a single point of access to it. It is commonly used for shared resources like database connections or logging services.

* **Without Double-Check Locking (Basic Lazy Initialization):** The instance is created only when it is first requested. However, this approach is **not thread-safe**. If multiple threads request the instance simultaneously before it is created, they might create multiple instances, breaking the pattern.
* **With Double-Check Locking (Thread-Safe & Optimized):** This approach solves the multi-threading issue efficiently. It checks if the instance exists before acquiring a lock, and then checks again inside the synchronized block. By pairing this with the `volatile` keyword, it ensures thread safety without the heavy performance cost of synchronizing the entire method.

---

## 3. Builder Pattern
The Builder pattern separates the construction of a complex object from its final representation. 

It is primarily used to solve the **"Telescoping Constructor"** anti-pattern (where a class has multiple constructors with long lists of parameters). Instead of passing a massive list of arguments, the Builder allows you to construct the object step-by-step using readable, chainable setter methods, finally returning the fully constructed object only when a `build()` method is called.

---

## 4. Factory Patterns
Factory patterns are designed to abstract the `new` keyword, moving the responsibility of object creation out of the core business logic (the client code).

* **A. Simple / Normal Factory:** A centralized method that evaluates a parameter (like an Enum or String) and returns the corresponding concrete implementation. The client only knows about the shared Interface, not the specific classes being created.
* **B. Abstract Factory:** Often called a "Factory of Factories." It is used when you have families of related objects (e.g., Mac UI elements vs. Windows UI elements) and want to guarantee that a client doesn't accidentally mix incompatible components. 
* **C. Practical / Production Factory:** In real-world enterprise applications, factories do more than just return objects. They handle the messy work of complex initialization, injecting secure credentials (like API keys from environment variables), and setting timeouts, ensuring the main application remains clean and completely unaware of infrastructure details.

---

## 5. Prototype and Registry Pattern
These patterns work together to manage object duplication efficiently.

* **The Prototype Pattern:** Used when creating a new object from scratch is computationally expensive (e.g., requires heavy database queries or network calls). Instead of building a new object, you define a base object and use a `clone()` method (often paired with a copy constructor) to duplicate it. 
* **The Registry Pattern:** Acts as a centralized store or cache (usually a Map) to hold pre-built prototype objects. Instead of the client managing the prototypes, the app loads base templates into the Registry on startup. When the client needs an object, it requests a clone of a specific template directly from the Registry.
