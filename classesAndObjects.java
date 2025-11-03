class Mobile{
    private int mic;
    private int cam;
    void setValue(){
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
        
        // there can be only one public class in java, and main should be in that public class only
        // classes cannot be private and protected in java, except inner classes maybe
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.setDisplay();
        m2.setValue();
        m1.setValue();
        System.out.println("M1 display");
        m1.setDisplay();
        System.out.println("M2 display");
        m2.setDisplay();
    }
}
