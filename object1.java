class Pratik{

    int x = 100; // instance member variable
    int y; // instance member variable
    // is there is no value in variable , default value is 0 stored
    void fun1(){  // instance member function
        System.out.println("Fun1 Called");
    }
    void fun2(){
        System.out.println("Fun2 Called");
    }
}

public class object1 {
    public static void main(String[] args) {
        Pratik o1 = new Pratik();
        o1.fun1();
        System.out.println(o1.y);
        System.out.println(o1.x);
    }
}
