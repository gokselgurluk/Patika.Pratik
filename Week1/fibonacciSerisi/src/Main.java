
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int nOfElements,num1=0,num2=1,fib ;

        Scanner input = new Scanner(System.in);

        System.out.println("Eleman Sayisini Girin: ");
            nOfElements = input.nextInt();


            System.out.println("Fibonacci Serisi "+num1);
            System.out.println("Fibonacci Serisi "+num2);
        for (int i = 3; i<nOfElements ;i++ ) {
            fib=num1+num2;
            System.out.println("Fibonacci Serisi "+fib);
            num1 = num2;
            num2 = fib;
        }




    }

}
