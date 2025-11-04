public class CLA {
    public static void main(String[] args /*stores the data after we execute the program using java fileName and after that everything written is considered as a array */) {
        int sum = 0;
        for(int i=0;i<args.length;i++){
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum/args.length);
    }
}
