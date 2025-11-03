class Mobile{
    private int mic; // private → accessible only within this class
    private int cam; // private → accessible only within this class
    // If no value is assigned, default value (0 for int) is automatically stored.

    void setValue(){ // default access → can be called using an object within the same package
        mic = 2;
        cam = 40;
    }
    void setDisplay(){
        System.out.println(mic);
        System.out.println(cam);
    }
}
public class classesAndObjects {
    public static void main(String[] args) {
        
        // Only one public class is allowed per Java file, and main() must be inside it.
        // Classes in Java cannot be declared as private or protected (only inner classes can).
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        // Display values before setting them
        m1.setDisplay();  // ❌ mic = 0, cam = 0 (default values, as setValue() not called yet)

        // Setting values for m2 only
        m2.setValue();    // ✅ sets mic = 2 and cam = 40 for m2 object

        System.out.println("M1 display:");
        m1.setDisplay();  // ❌ still 0, 0 → m1’s variables are separate and not set

        System.out.println("M2 display:");
        m2.setDisplay();  // ✅ shows 2, 40 → because setValue() was called for m2
    }
}

/*
 
🧠 Concept Notes (Interview-Ready)

1. Each object has its own copy of instance variables.
→ m1 and m2 are different objects, so their variables (mic and cam) are stored separately in memory.

2. Default values:
→ If an instance variable is not initialized, Java automatically assigns:

0 → for numeric types

false → for boolean

null → for reference types

3. Why m1 shows 0, 0:
→ Because m1.setValue() was never called, so mic and cam remain uninitialized (default = 0).

4. Why m2 shows 2, 40:
→ Because m2.setValue() sets mic = 2 and cam = 40, and those values belong to the m2 object only.

 */