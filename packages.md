# ✅ Packages in Java – Interview Notes

## ✅ What is a Package?
A **package** in Java is a group of related classes and interfaces.  
It works like a **folder** that keeps similar files together.

---

## ✅ Why Do We Use Packages?

| Reason | Explanation |
|--------|-------------|
| ✅ Avoids Name Conflicts | Two classes with the same name can exist in different packages |
| ✅ Better Code Organization | Makes large projects structured and readable |
| ✅ Access Protection | Provides access levels using `public`, `protected`, etc. |
| ✅ Reusability | Classes in packages can be reused across projects |

---

## ✅ Types of Packages

| Type | Meaning | Example |
|------|---------|---------|
| **Built-in Packages** | Provided by Java | `java.util`, `java.io`, `java.sql`, `java.lang` |
| **User-defined Packages** | Created by programmer | `package student;`, `package bank;` |

---

## ✅ How to Create a Package
```java
package myPackage;

public class Test {
    void show() {
        System.out.println("Inside my package");
    }
}
```
---
## ✅ Default Package

If no package is declared, Java places the class in an unnamed (default) package.

---

## ✅ Common Built-in Packages

| Package | Used For |
|---------|----------|
| `java.util` | Collections, Scanner |
| `java.io` | File handling |
| `java.lang` | Strings, Math, Object class, Wrapper classes (auto-imported) |
| `java.sql` | Database connectivity |
| `java.awt` / `javax.swing` | GUI programming |

---

## ✅ Interview Questions

### ✅ Q1: Why are packages used?
To avoid naming conflicts, organize code, provide access control, and improve reusability.

---

### ✅ Q2: Difference between built-in and user-defined packages?

- **Built-in** → Provided by Java (`java.util`)
- **User-defined** → Created by programmer (`package bank;`)

---

### ✅ Q3: Which package is automatically imported?
`java.lang`

---

### ✅ Q4: What is Default Package?
The package where a class goes when no package name is written.

---

           ┌──────────────────────┐
           │      package1        │
           │   ┌──────────────┐   │
           │   │  amit.java   │   │
           │   │ (class amit) │
           │   └──────────────┘   │
           └─────────▲────────────┘
                     │ imported
                     │
           ┌──────────────────────┐
           │      package2        │
           │   ┌──────────────┐   │
           │   │  sumit.java  │   │
           │   │ (class sumit │
           │   └──────────────┘   │
           └──────────────────────┘
