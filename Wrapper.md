# 🧠 Interview Notes (Simple + Powerful)

## 1. Definition
A **Wrapper Class** is a class that “wraps” a primitive data type into an object form.

---

## 2. Purpose
✅ To achieve object-oriented behavior for primitive data types.  
✅ To use primitives in collections (like `ArrayList`, `HashMap`) which only store objects.  
✅ To use utility methods like `parseInt()`, `valueOf()`, etc.

---

## 3. Common Wrapper Classes

| Primitive | Wrapper Class |
|------------|----------------|
| byte       | Byte           |
| short      | Short          |
| int        | Integer        |
| long       | Long           |
| float      | Float          |
| double     | Double         |
| char       | Character      |
| boolean    | Boolean        |

---

## 4. Important Methods

| Method | Type | Description |
|--------|------|-------------|
| `parseInt(String s)` | static | Converts a string to primitive `int` |
| `valueOf(String s)`  | static | Returns wrapper object (like `Integer`) |
| `intValue()`         | non-static | Converts wrapper object back to primitive |

---

## 5. Autoboxing & Unboxing (Extra Interview Point)

```java
Integer a = 10;   // Autoboxing → primitive to object automatically  
int b = a;        // Unboxing → object to primitive automatically
```
---
## 🧠 Interview Tip

“Wrapper classes bridge the gap between primitive data types and objects, enabling features like autoboxing, collections, and OOP design.”