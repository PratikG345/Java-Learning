// Demonstration of Wrapper Classes in Java

public class Wrapper {
    public static void main(String[] args) {

        // -------------------- Interview Question --------------------
        // ❓ Why do we use Wrapper Classes?
        // ✅ To make Java a 100% Object-Oriented Programming Language.
        // Primitive data types are not objects, but wrapper classes allow us
        // to use them as objects.

        // -------------------- Primitive Types vs Wrapper Classes --------------------
        // int      → Integer
        // float    → Float
        // char     → Character
        // double   → Double
        // boolean  → Boolean
        // long     → Long
        // byte     → Byte
        // short    → Short

        // -------------------- Example: Wrapper Class Methods --------------------
        // 1. parseInt() → static method → converts String to primitive int
        int x = Integer.parseInt("123"); // returns int primitive
        System.out.println("Primitive value (x): " + x); // Output: 123

        // 2. valueOf() → static method → converts String or primitive to Wrapper object
        Integer i1 = Integer.valueOf("123"); // returns Integer object
        System.out.println("Wrapper object (i1): " + i1); // Output: 123

        // 3. intValue() → instance method → converts Wrapper object back to primitive
        int y = i1.intValue();
        System.out.println("Primitive from object (y): " + y); // Output: 123
    }
}
