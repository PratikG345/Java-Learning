class Pratik{
    static void fun1(){
        System.out.println("Class A Called");
    }
    static void fun2(){
        System.out.println("Class B called");
    }
}

class Example{

    static void fun1(){
        System.out.println("A Called");
    }
    static void fun2(){
        System.out.println("B called");
    }
    public static void main(String[] args){
        System.out.println("Hello Pratik");
        fun1();
        fun2();
        Pratik.fun1();
        Pratik.fun2();

    }
}