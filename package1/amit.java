package package1;  
// ✅ This class belongs to the user-defined package named "package1"
// Packages help organize code and avoid name conflicts.

public class amit {

    // ✅ Private member variables
    // These cannot be accessed directly outside the class (Encapsulation)
    private int x;
    private int y;

    // ✅ Public method to set values
    // We pass parameters p and q, and assign them to instance variables
    public void setValue(int p, int q) {
        x = p;
        y = q;
    }

    // ✅ Public method to display the values of x and y
    public void setDisplay() {
        System.out.println(x);
        System.out.println(y);
    }
}
