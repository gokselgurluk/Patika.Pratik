import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number1,number2,number3;

        Scanner userInput  = new Scanner(System.in);
        //kullanici girsi icin scanner sinifinitanımladik
        System.out.print("1. sayiyi giriniz: ");
            number1=userInput.nextInt();
            //kullanicidan 3 farkli sayi aldik ve degiskenlere atadik
        System.out.print("2. sayiyi giriniz: ");
            number2=userInput.nextInt();

        System.out.print("3. sayiyi giriniz: ");
            number3=userInput.nextInt();
        //1.sayinin diger 2 sayidan küçük olma durumu
        if((number1<number2) && (number1<number3)){
            //2.sayinin 3. sayidan kucuk/buyuk  olma durumu
            if(number2<number3){
                System.out.println("1<2<3");
            }
            else{
                System.out.println("1<3<2");
            }
        }
        //2.sayinin diger 2 sayidan kucuk olma durumu
        else if ((number2<number3) && (number2<number1)){
            //1.sayinin 3. sayidan kucuk/buyuk  olma durumu
            if(number1<number3){
                System.out.println("2<1<3");
            }
            else{
                System.out.println("2<3<1");
            }
        }
        //3.sayinin diger 2 sayidan kucuk olma durumu
        else{
            if((number3<number2) && (number3<number1)){
                //2.sayinin 1. sayidan kucuk/buyuk  olma durumu
                if(number2<number1)
                System.out.println("3<2<1");
               else{
                   System.out.println("3<1<2");
               }
            }
        }
        System.out.println("Girilen sayilar kucukten buyuge siralanmistir");
    }
}