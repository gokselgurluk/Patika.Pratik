import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int number;

        Scanner input = new Scanner(System.in);
            System.out.print("Sınırı giriniz");
        number =input.nextInt();                //kullanıcıcdan sayı alıyoruz

        for(int i = 1 ; i<=number;i*=4){        //i sayısını 4ün katlarını alıyoruz
            System.out.print(i+",");
        }
            System.out.println("\n4'ün kuvvetleri\n");

        for(int k=1; k<number;k*=5){            //5in katlarını alıyorz
            System.out.print(k+",");
        }
            System.out.println("\n5'in kuvvetleri");
    }
}