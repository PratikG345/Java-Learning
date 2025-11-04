### ✅ Interview-Oriented Notes

- **Command Line Arguments** allow passing input without using Scanner or GUI.
- All values inside `args` are **Strings** by default.
- Must convert to numbers using **`Integer.parseInt()`** for mathematical operations.
- **`args.length`** prevents running on empty input and helps control loops.
---
## ✅ Interview Questions & Answers

### ✅ Q1: Why use command line arguments?
No need for **Scanner** or **GUI**. Inputs can be passed directly while running the program — useful for automation and scripts.

---

### ✅ Q2: In which method are command line arguments stored?
```java
public static void main(String[] args)
```
---
✅ **Q3: Data type of command line arguments?**  
Always **String** by default.

---

✅ **Q4: What happens if no arguments are passed?**  
`args.length = 0`, and accessing `args[0]` causes **ArrayIndexOutOfBoundsException**.

---

✅ **Q5: Difference between Scanner and CLA**

| Feature | Scanner | CLA |
|---------|---------|-----|
| Input time | Takes input at **program runtime** | Passed during **execution before program starts** |
| User interaction | Requires user interaction | Works **without** user interaction |

---

### 🧠 Common Mistake

Trying to perform math without converting:

```java
❌ sum = sum + args[i];  // Error – incompatible types
```
✅ Correct way:
```
sum = sum + Integer.parseInt(args[i]);
```
---


## ✅ Command Line Arguments (CLA) – Quick Interview Notes

### 🔹 What are Command Line Arguments?
Command Line Arguments allow us to pass input values to a Java program **during execution** (without Scanner, GUI, or user interaction).
They are passed after the class name in the terminal.

Example:
```
java CLA 10 20 30
```

---

### 🔹 Where are they stored?
- Stored in the `String[] args` array of `main()` method.
- Each argument becomes one element of the array.
Example:
```
args[0] → "10"
args[1] → "20"
args[2] → "30"
```

---

### 🔹 Important Points
✅ All arguments are **String type** by default  
✅ To perform math operations → convert using wrapper methods like `Integer.parseInt()`  
✅ `args.length` tells how many arguments are passed  
✅ Works only when program is run using terminal/command prompt