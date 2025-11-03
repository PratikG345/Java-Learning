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

