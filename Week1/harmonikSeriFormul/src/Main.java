import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number;
        double total = 0.0;
        Scanner  numberInput = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        number=numberInput.nextInt();

        for(int i = 1; i<= number;i++){ //girilen sayı degeri kadar döngüyü dönderieyoruz

            total += (1.0/i);  //Harmonik Seri Formülüne göre 1/i degerini total toplayarak atıyoruz
        }
        System.out.println("Harmonik Seri: "+total);//sonucu kullanıcıya gösteriyoruz
    }
}