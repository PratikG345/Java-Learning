public class Wrapperprogram {
    public static void main(String[] args) {
        int x = Integer.parseInt("123");
        Integer x1 = Integer.valueOf("101100",2);
        Double x2 = Double.valueOf("44");
        int y = x1.intValue();
        double z = x2.intValue();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
