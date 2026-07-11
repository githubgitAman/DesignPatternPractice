# 🚀 Java Design Patterns: Quick Reference

A conceptual guide to standard software design patterns for writing clean, scalable, and maintainable object-oriented systems.

---

## 🏛️ 1. The Three Pillars
Design patterns solve recurring problems and are grouped by their core purpose:
* 🛠️ **Creational:** How objects are built *(e.g., Singleton, Factory)*.
* 🏗️ **Structural:** How objects are composed together *(e.g., Adapter, Decorator)*.
* 🧠 **Behavioral:** How objects communicate and operate *(e.g., Strategy, Observer)*.

---

## 🔒 2. Singleton Pattern
*Guarantees a class has only one instance globally (e.g., Database connections).*

* **Basic (Lazy Initialization):** Creates the instance only when first requested. **Warning:** Not thread-safe.
* **Double-Check Locking:** The thread-safe standard. It uses `volatile` and a targeted `synchronized` block to prevent multiple threads from accidentally creating duplicate instances, without slowing down performance.

---

## 🏗️ 3. Builder Pattern
*Constructs complex objects step-by-step to keep code readable.*

* **The Problem:** "Telescoping Constructors" (passing 10 confusing parameters into a single `new` statement).
* **The Solution:** Uses chainable setter methods. You configure the object piece-by-piece, and it is only created when you finally call `build()`.

---

## 🏭 4. Factory Patterns
*Hides the `new` keyword so your main application doesn't care how objects are made.*

* **Simple Factory:** A centralized method that reads a parameter (like "SMS") and returns the correct object implementation.
* **Abstract Factory:** A "Factory of Factories." Used to create families of related objects (e.g., ensuring Mac Buttons only mix with Mac Checkboxes).
* **Practical/Production Factory:** In the real world, factories handle the dirty work—like injecting secure API keys from environment variables—keeping your business logic completely clean.

---

## 🧬 5. Prototype & Registry Patterns
*Efficiently duplicates objects when building them from scratch is too expensive (like heavy database calls).*

* **Prototype:** Instead of using `new`, you use a `clone()` method (or copy constructor) to duplicate an existing base object.
* **Registry:** A centralized cache that holds your base prototype templates. When the app needs a new object, it simply asks the Registry for a clone of a template instead of building it from scratch.
