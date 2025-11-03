class Pratik{
    private static int x;
    void fun1(){
        x=5;
        System.out.println(x);
    }
    static void fun2(){
        x=10;
        System.out.println(x);
    }
}

public class object2 {
    public static void main(String[] args) {
        Pratik p = new Pratik();
        p.fun1(); // we create a function and change the variable value in function, and in main function we create an object and then access it by className.function()

        // ----------------- Interview Question -----------------
        // How can we access a private stactic memmer variable without creating an object?

        // we make the funtion static, like how we did to fun2, and then we can call it by className.function()
        // we can access private static member variable with the help of static function, we can call static finction with className
        Pratik.fun2();
    }
}
