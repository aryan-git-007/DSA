# ☕ Java OOP — Complete Guide with Real-Life Examples

---

## 📌 Table of Contents

1. [What is Procedural Programming?](#1-what-is-procedural-programming)
2. [What is Object-Oriented Programming (OOP)?](#2-what-is-object-oriented-programming-oop)
3. [Why Do We Need OOP?](#3-why-do-we-need-oop)
4. [OOP vs Procedural Programming](#4-oop-vs-procedural-programming)
5. [The 4 Pillars of OOP](#5-the-4-pillars-of-oop)
   - [Encapsulation](#-pillar-1-encapsulation)
   - [Abstraction](#-pillar-2-abstraction)
   - [Inheritance](#-pillar-3-inheritance)
   - [Polymorphism](#-pillar-4-polymorphism)

---

## 1. What is Procedural Programming?

Procedural Programming is a programming paradigm where you write a **sequence of instructions** (procedures/functions) that execute step-by-step from top to bottom.

Think of it like a **recipe card** — you follow each step one after the other.

### Real-Life Analogy 🍕 — Making a Pizza

```
Step 1: Take dough
Step 2: Roll it flat
Step 3: Add sauce
Step 4: Add cheese
Step 5: Add toppings
Step 6: Bake at 200°C for 15 minutes
Step 7: Serve
```

Everything is written as a sequence of steps. There is no concept of "who" is doing it — just "what" is being done.

### In Code (Procedural Style — C-like pseudocode)

```java
// Procedural approach — everything in functions, no objects
public class PizzaApp {

    static void rollDough() {
        System.out.println("Rolling dough...");
    }

    static void addSauce() {
        System.out.println("Adding tomato sauce...");
    }

    static void addCheese() {
        System.out.println("Adding mozzarella...");
    }

    static void bake() {
        System.out.println("Baking at 200°C for 15 min...");
    }

    public static void main(String[] args) {
        rollDough();
        addSauce();
        addCheese();
        bake();
    }
}
```

### Problems with Procedural Programming

- **Global data is shared** — any function can change it, causing bugs.
- **Hard to scale** — adding new features breaks existing code.
- **No reusability** — same logic repeated across functions.
- **Poor real-world modeling** — the real world has *objects*, not just procedures.

---

## 2. What is Object-Oriented Programming (OOP)?

OOP is a programming paradigm based on the concept of **"objects"** — entities that have:
- **State** → properties/attributes (what it *has*)
- **Behaviour** → methods/functions (what it *does*)

> 💡 **Core Idea:** Instead of writing a list of instructions, you model your program as a **collection of interacting real-world objects**.

### Real-Life Analogy 🚗 — A Car

| Concept     | Real Life         | In Code          |
|-------------|-------------------|------------------|
| **Class**   | Car Blueprint     | `class Car {}`   |
| **Object**  | Your actual car   | `Car myCar = new Car();` |
| **Attribute**| Color, Brand, Speed | `String color;` |
| **Method**  | Drive, Brake, Honk | `void drive(){}` |

### In Java

```java
// Class = Blueprint of a Car
class Car {
    // Attributes (State)
    String brand;
    String color;
    int speed;

    // Methods (Behaviour)
    void accelerate() {
        speed += 10;
        System.out.println(brand + " is now going at " + speed + " km/h");
    }

    void brake() {
        speed -= 10;
        System.out.println(brand + " slowed down to " + speed + " km/h");
    }

    void honk() {
        System.out.println(brand + " goes: Beep Beep! 📯");
    }
}

public class Main {
    public static void main(String[] args) {
        // Object = Actual Car created from blueprint
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.speed = 0;

        myCar.accelerate(); // Toyota is now going at 10 km/h
        myCar.accelerate(); // Toyota is now going at 20 km/h
        myCar.honk();       // Toyota goes: Beep Beep! 📯
    }
}
```

---

## 3. Why Do We Need OOP?

### Real-Life Problem 🏦 — Bank System

Imagine building a banking app in procedural style:

```java
// Procedural — messy, insecure, hard to manage
static String accountHolder = "Rahul";
static double balance = 50000;

static void withdraw(double amount) {
    balance -= amount; // Anyone can call this with ANY amount!
}
```

**Problems:**
- `balance` is exposed to everyone — insecure.
- Anyone can withdraw any amount — no validation.
- 1000 customers? You need 1000 separate variables — nightmare!

### OOP Solution

```java
class BankAccount {
    private String holder;
    private double balance;

    BankAccount(String holder, double initialBalance) {
        this.holder = holder;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawn ₹" + amount);
        } else {
            System.out.println("❌ Insufficient funds!");
        }
    }

    void checkBalance() {
        System.out.println(holder + "'s Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount rahul = new BankAccount("Rahul", 50000);
        BankAccount priya = new BankAccount("Priya", 30000);

        rahul.deposit(5000);
        rahul.withdraw(100000); // ❌ Insufficient funds!
        priya.checkBalance();   // Priya's Balance: ₹30000
    }
}
```

### Why OOP Wins — Summary

| Reason              | Explanation                                                     |
|---------------------|-----------------------------------------------------------------|
| **Modularity**      | Each object handles its own data and logic                      |
| **Reusability**     | Write a class once, create 1000 objects from it                 |
| **Security**        | Data hidden inside objects (Encapsulation)                      |
| **Maintainability** | Change one class without breaking everything else               |
| **Real-world mapping** | Code reflects how the real world actually works             |
| **Scalability**     | Easy to add new features by adding new classes                  |

---

## 4. OOP vs Procedural Programming

| Feature                | Procedural Programming            | Object-Oriented Programming (OOP)     |
|------------------------|-----------------------------------|---------------------------------------|
| **Basic Unit**         | Function / Procedure              | Object (Class + Data + Methods)       |
| **Data**               | Shared globally, exposed          | Hidden inside objects (private)       |
| **Approach**           | Top-down                          | Bottom-up                             |
| **Code Reuse**         | Function calls                    | Inheritance & Composition             |
| **Real-world modeling**| Poor                              | Excellent                             |
| **Security**           | Low (data openly accessible)      | High (encapsulation protects data)    |
| **Scalability**        | Difficult                         | Easy to extend                        |
| **Examples**           | C, Pascal, BASIC                  | Java, Python, C++, Kotlin             |

### Real-Life Analogy — Restaurant 🍽️

| Scenario               | Procedural                        | OOP                                   |
|------------------------|-----------------------------------|---------------------------------------|
| **Approach**           | Chef does everything step by step | Separate objects: Chef, Waiter, Cashier |
| **Adding a new dish**  | Rewrite the entire recipe list    | Just add a new method to `Chef` class |
| **Two restaurants**    | Duplicate all the code            | Create two `Restaurant` objects       |

---

## 5. The 4 Pillars of OOP

```
          ┌─────────────────────────────────────┐
          │          4 PILLARS OF OOP            │
          │                                     │
          │  🔒 Encapsulation  🎭 Abstraction   │
          │  🧬 Inheritance    🔀 Polymorphism   │
          └─────────────────────────────────────┘
```

---

## 🔒 Pillar 1: Encapsulation

### What is it?

Encapsulation means **bundling data (attributes) and methods together inside a class, and restricting direct access** to the internal data using access modifiers (`private`, `public`, `protected`).

> 💡 **Simple Definition:** Hide your data, expose only what's necessary.

### Real-Life Analogy — ATM Machine 🏧

You interact with an ATM through buttons (public methods). You **cannot** directly touch the cash inside or the internal computer. The internal mechanism is **hidden (encapsulated)**.

- **You can do:** Insert card → Enter PIN → Withdraw cash
- **You cannot do:** Open the machine, touch internal wires

### In Java

```java
class ATM {
    // Private — hidden from outside world
    private double cashAvailable = 500000;
    private String bankName = "State Bank";

    // Public methods — the "buttons" users can press
    public void withdrawCash(double amount, String pin) {
        if (!pin.equals("1234")) {
            System.out.println("❌ Wrong PIN!");
            return;
        }
        if (amount > cashAvailable) {
            System.out.println("❌ ATM has insufficient cash!");
            return;
        }
        cashAvailable -= amount;
        System.out.println("✅ Please collect ₹" + amount);
    }

    // Getter — controlled access to read data
    public double getCashAvailable() {
        return cashAvailable;
    }

    // No setter for cashAvailable — only bank engineers can refill!
}

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        // atm.cashAvailable = 999999; ❌ ERROR — private, can't access directly!

        atm.withdrawCash(5000, "0000"); // ❌ Wrong PIN!
        atm.withdrawCash(5000, "1234"); // ✅ Please collect ₹5000.0

        System.out.println("Cash left: ₹" + atm.getCashAvailable()); // ✅ Allowed
    }
}
```

### Key Points

- Use `private` for fields.
- Use `public` getter/setter methods to access them.
- This gives you **controlled access** — you can add validation in setters.

```java
class Student {
    private int age;

    // Setter with validation
    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("❌ Invalid age!");
        }
    }

    public int getAge() {
        return age;
    }
}
```

---

## 🎭 Pillar 2: Abstraction

### What is it?

Abstraction means **showing only the essential details and hiding the complex implementation** from the user.

> 💡 **Simple Definition:** Show WHAT something does, hide HOW it does it.

### Real-Life Analogy — Driving a Car 🚗

When you press the accelerator:
- You know it **speeds up the car** (What)
- You don't know about fuel injection, combustion, gear systems (How)

The complex engine mechanics are **abstracted** away from you.

### In Java — Using `abstract` class and `interface`

```java
// Abstract class — defines "what" a vehicle should do
abstract class Vehicle {
    String brand;

    // Abstract method — no body, just a contract
    abstract void startEngine();
    abstract void fuelType();

    // Concrete method — shared behaviour
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Concrete class — defines "how" a car starts
class PetrolCar extends Vehicle {
    PetrolCar(String brand) {
        this.brand = brand;
    }

    @Override
    void startEngine() {
        System.out.println(brand + ": Igniting spark plugs... Vroom! 🔥");
    }

    @Override
    void fuelType() {
        System.out.println(brand + " runs on Petrol ⛽");
    }
}

// Concrete class — defines "how" an EV starts
class ElectricCar extends Vehicle {
    ElectricCar(String brand) {
        this.brand = brand;
    }

    @Override
    void startEngine() {
        System.out.println(brand + ": Powering up battery... Whirrrr! ⚡");
    }

    @Override
    void fuelType() {
        System.out.println(brand + " runs on Electricity 🔋");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new PetrolCar("Toyota");
        Vehicle car2 = new ElectricCar("Tesla");

        // User just calls startEngine() — doesn't care HOW it works internally
        car1.startEngine(); // Toyota: Igniting spark plugs... Vroom! 🔥
        car2.startEngine(); // Tesla: Powering up battery... Whirrrr! ⚡

        car1.fuelType(); // Toyota runs on Petrol ⛽
        car2.fuelType(); // Tesla runs on Electricity 🔋
    }
}
```

### Interface — 100% Abstraction

```java
// Interface = Pure contract (all methods are abstract by default)
interface PaymentGateway {
    void processPayment(double amount);
    void refund(double amount);
}

class UPIPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("💸 UPI Payment of ₹" + amount + " processing via BHIM...");
    }

    @Override
    public void refund(double amount) {
        System.out.println("🔄 UPI Refund of ₹" + amount + " initiated...");
    }
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("💳 Credit Card Payment of ₹" + amount + " processing via Visa...");
    }

    @Override
    public void refund(double amount) {
        System.out.println("🔄 Credit Card Refund of ₹" + amount + " initiated...");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentGateway payment = new UPIPayment();
        payment.processPayment(1500); // 💸 UPI Payment of ₹1500.0 processing via BHIM...

        payment = new CreditCardPayment();
        payment.processPayment(3000); // 💳 Credit Card Payment of ₹3000.0 processing via Visa...
    }
}
```

### Encapsulation vs Abstraction — Key Difference

| Aspect             | Encapsulation                         | Abstraction                          |
|--------------------|---------------------------------------|--------------------------------------|
| **Focus**          | Hiding **data** (fields)              | Hiding **implementation** (logic)    |
| **Achieved via**   | `private` fields + getters/setters    | `abstract` classes & `interface`     |
| **Goal**           | Data security & controlled access     | Simplicity & reduced complexity      |
| **Analogy**        | Capsule pill (data inside)            | TV remote (you press, it works)      |

---

## 🧬 Pillar 3: Inheritance

### What is it?

Inheritance allows a **child class to acquire the properties and methods of a parent class**, promoting code reuse.

> 💡 **Simple Definition:** Child class inherits traits from the Parent class — just like children inherit traits from parents.

### Real-Life Analogy — Animal Kingdom 🦁

```
          Animal (Parent)
         /       |        \
       Dog      Cat       Bird
      /   \
  Labrador  Poodle
```

All animals can **breathe** and **eat**. A Dog *also* barks. A Bird *also* flies. No need to rewrite `breathe()` for every animal!

### In Java

```java
// Parent class (Super class)
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void breathe() {
        System.out.println(name + " is breathing... 💨");
    }

    void eat(String food) {
        System.out.println(name + " is eating " + food + " 🍽️");
    }
}

// Child class — inherits from Animal
class Dog extends Animal {

    Dog(String name) {
        super(name); // Call parent constructor
    }

    // Dog-specific method
    void bark() {
        System.out.println(name + " says: Woof! Woof! 🐕");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball! 🎾");
    }
}

// Another child class
class Bird extends Animal {

    Bird(String name) {
        super(name);
    }

    // Bird-specific method
    void fly() {
        System.out.println(name + " is soaring through the sky! 🦅");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog tommy = new Dog("Tommy");
        Bird tweety = new Bird("Tweety");

        // Inherited methods from Animal
        tommy.breathe();      // Tommy is breathing... 💨
        tommy.eat("bones");   // Tommy is eating bones 🍽️

        // Dog-specific methods
        tommy.bark();         // Tommy says: Woof! Woof! 🐕
        tommy.fetch();        // Tommy is fetching the ball! 🎾

        // Inherited + own methods
        tweety.breathe();     // Tweety is breathing... 💨
        tweety.fly();         // Tweety is soaring through the sky! 🦅
    }
}
```

### Types of Inheritance in Java

```java
// 1. SINGLE INHERITANCE — One parent, one child
class A {}
class B extends A {}

// 2. MULTILEVEL INHERITANCE — Chain of inheritance
class Animal {}
class Dog extends Animal {}
class Puppy extends Dog {} // Puppy → Dog → Animal

// 3. HIERARCHICAL INHERITANCE — One parent, multiple children
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
class Bird extends Animal {}

// ⚠️ Java does NOT support Multiple Inheritance with classes
// (to avoid the "Diamond Problem")
// class C extends A, B {}  ← ❌ NOT ALLOWED in Java
// Use interfaces instead for multiple inheritance!

// 4. MULTIPLE INHERITANCE via Interfaces (Java solution)
interface Flyable { void fly(); }
interface Swimmable { void swim(); }

class Duck extends Animal implements Flyable, Swimmable {
    public void fly()  { System.out.println("Duck is flying! 🦆"); }
    public void swim() { System.out.println("Duck is swimming! 🌊"); }
}
```

### `super` keyword

```java
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary); // ← Calls parent constructor
        this.department = department;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // ← Calls parent method
        System.out.println("Department: " + department);
    }
}

// Manager rahul = new Manager("Rahul", 80000, "Engineering");
// rahul.displayInfo();
// Output:
// Name: Rahul, Salary: ₹80000.0
// Department: Engineering
```

---

## 🔀 Pillar 4: Polymorphism

### What is it?

Polymorphism means **"many forms"** — one action behaving differently in different contexts.

> 💡 **Simple Definition:** Same method name, different behaviour depending on the object or arguments.

### Real-Life Analogy — A Person playing different roles 🎭

Rahul is one person, but:
- At home → he is a **Son**
- At office → he is a **Manager**
- At cricket ground → he is a **Player**

Same Rahul, different behaviour in different contexts!

### Two Types of Polymorphism

```
          Polymorphism
         /             \
Compile-time          Runtime
(Method Overloading)  (Method Overriding)
```

---

### A) Compile-Time Polymorphism — Method Overloading

Same method name, **different parameters** in the same class.

```java
class Calculator {

    // Same name "add", different parameters = Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    String add(String a, String b) {
        return a + " " + b; // String concatenation
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 3));            // 8
        System.out.println(calc.add(5.5, 3.2));        // 8.7
        System.out.println(calc.add(1, 2, 3));         // 6
        System.out.println(calc.add("Hello", "Java")); // Hello Java
    }
}
```

**Real-Life Example — print() function in Java itself:**
```java
System.out.println(42);         // prints int
System.out.println(3.14);       // prints double
System.out.println("Hello");    // prints String
System.out.println(true);       // prints boolean
// All the same method name, different types! That's Overloading.
```

---

### B) Runtime Polymorphism — Method Overriding

**Child class redefines** a method from the parent class. The correct method is decided at **runtime** based on the actual object type.

```java
// Real-life example: Notification System 📱
class Notification {
    void send(String message) {
        System.out.println("Sending notification: " + message);
    }
}

class SMSNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("📱 SMS sent to +91-XXXXXXXXXX: " + message);
    }
}

class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("📧 Email sent to user@gmail.com: " + message);
    }
}

class WhatsAppNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("💬 WhatsApp message sent: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Parent reference, child object — Runtime Polymorphism!
        Notification notif;

        notif = new SMSNotification();
        notif.send("Your OTP is 4521");
        // 📱 SMS sent to +91-XXXXXXXXXX: Your OTP is 4521

        notif = new EmailNotification();
        notif.send("Your order has been shipped!");
        // 📧 Email sent to user@gmail.com: Your order has been shipped!

        notif = new WhatsAppNotification();
        notif.send("Flash sale starts in 1 hour!");
        // 💬 WhatsApp message sent: Flash sale starts in 1 hour!
    }
}
```

### Polymorphism with Arrays — Power of OOP

```java
public class Main {
    public static void main(String[] args) {

        // Array of parent type — holds different child objects
        Notification[] notifications = {
            new SMSNotification(),
            new EmailNotification(),
            new WhatsAppNotification()
        };

        String alert = "Server is down! 🚨";

        // One loop — sends via all channels automatically!
        for (Notification n : notifications) {
            n.send(alert);
        }

        // Output:
        // 📱 SMS sent to +91-XXXXXXXXXX: Server is down! 🚨
        // 📧 Email sent to user@gmail.com: Server is down! 🚨
        // 💬 WhatsApp message sent: Server is down! 🚨
    }
}
```

### Overloading vs Overriding — Quick Comparison

| Feature             | Method Overloading                     | Method Overriding                      |
|---------------------|----------------------------------------|----------------------------------------|
| **Where**           | Same class                             | Parent & Child class                   |
| **Parameters**      | Must be different                      | Must be the same                       |
| **Return Type**     | Can differ                             | Must be same (or covariant)            |
| **Resolved at**     | Compile-time                           | Runtime                                |
| **Keyword**         | No special keyword needed              | `@Override` annotation (recommended)  |
| **Inheritance**     | Not required                           | Required                               |

---

## 🧠 Quick Recap — All 4 Pillars

| Pillar              | Keyword                        | Real-World Analogy                    | Main Benefit           |
|---------------------|--------------------------------|---------------------------------------|------------------------|
| **Encapsulation**   | `private` + getters/setters    | ATM Machine 🏧                        | Data Security          |
| **Abstraction**     | `abstract` / `interface`       | Driving a Car 🚗                      | Hides Complexity       |
| **Inheritance**     | `extends` / `implements`       | Animal Kingdom 🦁                     | Code Reusability       |
| **Polymorphism**    | Overloading / Overriding       | Person in different roles 🎭          | Flexibility            |

---

## 🏗️ Putting It All Together — A Real-World System

### Example: Online Food Ordering App 🍔

```java
// Abstraction — Interface defines the contract
interface FoodItem {
    String getName();
    double getPrice();
    void prepare();
}

// Encapsulation — Data hidden, accessed via methods
class Burger implements FoodItem {
    private String name;
    private double price;
    private boolean isVeg;

    Burger(String name, double price, boolean isVeg) {
        this.name = name;
        this.price = price;
        this.isVeg = isVeg;
    }

    // Getters
    public String getName()  { return name; }
    public double getPrice() { return price; }
    public boolean isVeg()   { return isVeg; }

    // Polymorphism — overrides interface method
    @Override
    public void prepare() {
        String type = isVeg ? "🥗 Veg" : "🥩 Non-Veg";
        System.out.println(type + " Burger '" + name + "' is being prepared...");
    }
}

// Inheritance — Pizza extends general concept, adds specifics
class Pizza implements FoodItem {
    private String name;
    private double price;
    private String size; // Small, Medium, Large

    Pizza(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName()  { return name; }
    public double getPrice() { return price; }

    @Override
    public void prepare() {
        System.out.println("🍕 " + size + " Pizza '" + name + "' going into the oven...");
    }
}

// Order class — uses Polymorphism
class Order {
    private FoodItem[] items;
    private int count = 0;

    Order(int capacity) {
        items = new FoodItem[capacity];
    }

    void addItem(FoodItem item) {
        items[count++] = item;
    }

    void placeOrder() {
        System.out.println("\n🧾 ORDER SUMMARY:");
        System.out.println("─────────────────────────");
        double total = 0;
        for (int i = 0; i < count; i++) {
            items[i].prepare(); // Polymorphism in action!
            System.out.printf("   %-20s ₹%.2f%n", items[i].getName(), items[i].getPrice());
            total += items[i].getPrice();
        }
        System.out.println("─────────────────────────");
        System.out.printf("   TOTAL:               ₹%.2f%n", total);
        System.out.println("✅ Order placed successfully!");
    }
}

public class Main {
    public static void main(String[] args) {
        Order myOrder = new Order(5);

        myOrder.addItem(new Burger("Zinger Burger", 199.0, false));
        myOrder.addItem(new Burger("Aloo Tikki Burger", 89.0, true));
        myOrder.addItem(new Pizza("Margherita", 299.0, "Medium"));

        myOrder.placeOrder();
    }
}

// Output:
// 🧾 ORDER SUMMARY:
// ─────────────────────────
// 🥩 Non-Veg Burger 'Zinger Burger' is being prepared...
//    Zinger Burger        ₹199.00
// 🥗 Veg Burger 'Aloo Tikki Burger' is being prepared...
//    Aloo Tikki Burger    ₹89.00
// 🍕 Medium Pizza 'Margherita' going into the oven...
//    Margherita           ₹299.00
// ─────────────────────────
//    TOTAL:               ₹587.00
// ✅ Order placed successfully!
```

---

> **"OOP is not about telling objects what to do. It's about telling them what they are and letting them figure out what to do."**

---

*Made with ☕ Java & ❤️ — Happy Coding!*
