// Demonstration of Access Specifiers and Instance Members

class Pratik {

    // -------------------- Instance Variables --------------------
    int x = 100;        // default access modifier (package-private) → accessible within the same package
    private int y;      // private access modifier → accessible only within this class
    // Note: If no value is assigned to 'y', the default value (0 for int) is automatically stored.

    // -------------------- Instance Methods --------------------
    void fun1() { // default access → can be accessed within the same package
        System.out.println("Fun1 Called");
    }

    void fun2() { // default access → can be accessed within the same package
        System.out.println("Fun2 Called");
    }
}

public class object1 {
    public static void main(String[] args) {

        // -------------------- Object Creation --------------------
        Pratik o1 = new Pratik(); // creating an object of class Pratik

        // -------------------- Accessing Methods --------------------
        o1.fun1(); // Allowed: fun1() has default access

        // -------------------- Accessing Variables --------------------
        // System.out.println(o1.y);
        // ❌ Error: 'y' has private access in Pratik
        // Explanation: Private members can only be accessed within their own class.

        System.out.println(o1.x); // ✅ Allowed: x has default access and can be accessed from the same package
    }
}

/*

🔒 1. private

The most restrictive access level.

Accessible only inside the same class.

Not visible to subclasses or other classes, even in the same package.

🔹 Used for data hiding and encapsulation (a key OOP concept).

🧠 Interview tip:

“Private members are used to protect internal data and can be accessed only through getters/setters.”

🏠 2. default (no keyword)

When no access specifier is written, it’s default (package-private).

Accessible within the same package only.

Not accessible outside the package.

🧠 Interview tip:

“Default access is package-level — good for classes or methods that are meant to be used only by related classes in the same package.”

🛡️ 3. protected

Accessible within the same package and also in subclasses (even if they’re in different packages).

Used when you want to share with child classes but still limit external access.

🧠 Interview tip:

“Protected is mainly used in inheritance — subclasses can access parent class members using protected.”

🌍 4. public

Accessible from anywhere — inside the same class, same package, or even outside the package.

Least restrictive access modifier.

🧠 Interview tip:

“Public members are accessible globally — ideal for APIs or utility methods.”

 */