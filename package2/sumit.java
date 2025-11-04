package package2;  
// ✅ This class belongs to a different package named "package2"

import package1.amit;  
// ✅ Importing class "amit" from package1
// Without import, Java won't know where `amit` class is located

public class sumit {
    public static void main(String[] args) {

        // ✅ Creating object of class amit (from another package)
        amit a1 = new amit();

        // ✅ Calling public methods — allowed even though variables are private
        a1.setValue(10, 20);
        a1.setDisplay();  // Output: 10  and  20
    }
}
