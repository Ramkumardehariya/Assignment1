package Assignment1.practice;
public class Program6 {
    public static void main(String[] args) {


        int n = Integer.parseInt(args[0]);
        System.out.println("The table of 2 is: ");

        for(int i = 1; i<=n; i++){
            if((int)Math.pow(2, i) >= Integer.MAX_VALUE){
                break;
            }
            System.out.println("2^"+i +" = "+(int)Math.pow(2, i));
        }
    }
}
