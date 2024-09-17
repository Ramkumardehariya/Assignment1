package Assignment1.practice;
// import java.util.Random;
// import java.util.Scanner;
// import java.lang.*;


public class Program4 {
    int head = 0;
    int tail = 0;

    void check(double num){
        if(num < 0.5){
            tail++;
        }
        else{
            head++;
        }
    }
    void print(int n){
        double hper =  (head/(double) n)*100;
        System.out.printf("The percentage of head is: %.2f%%\n", hper);
        double tper = (tail / (double)n)*100;
        System.out.printf("The percentage of tail is: %.2f%%\n",tper);
    }
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("How many times flip a coin : ");
        // int a = sc.nextInt();

        // Program4 p1 = new Program4();

        // for(int i = 0; i<a; i++){
        //     double r = Math.random();
        //     p1.check(r);
        // }
        

        // p1.print(a);
    
    }
}
