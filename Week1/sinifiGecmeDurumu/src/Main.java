import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //gerekli degiskenleri tanimladik
        double mat, fzk, turkce, kimya, muzik,sonuc;


        Scanner dersNotu = new Scanner(System.in);
        //kullanicidan girdi almak icin scanner ensnesini tanimladik
        System.out.print("Matematik notunuzu giriniz!: ");
        mat = dersNotu.nextDouble();
        //girilen notun araligini kontrol ettik
        if ((mat >= 0) && (mat<=100)) {
            System.out.print("fizik notunuzu giriniz!: ");
            fzk = dersNotu.nextDouble();
        }
        //gecersiz aralikta ise programi durdurduk
        else {
            System.out.print("Girdiğiniz not 0-100 aralıgında degil");
            return;
        }
            if ((fzk >= 0) && (fzk<=100))  {
                System.out.print("Turkce notunuzu giriniz!: ");
                turkce = dersNotu.nextDouble();
            }
            else {
                System.out.print("Girdiğiniz not 0-100 aralıgında degil");
                return;
            }
                if ((turkce >= 0) && (turkce<=100)) {
                    System.out.print("Kimya notunuzu giriniz!: ");
                    kimya = dersNotu.nextInt();
                }
                else {
                    System.out.print("Girdiğiniz not 0-100 aralıgında degil");
                    return;
                }
                    if ((kimya >= 0) && (kimya<=100)) {
                        System.out.print("Muzik notunuzu giriniz!: ");
                        muzik = dersNotu.nextInt();
                    }
                    else {
                        System.out.print("Girdiğiniz not 0-100 aralıgında degil");
                        return;
                    }
                        if ((muzik >= 0) && (muzik<=100)) {
                              //sonuc degiskenine gecerli aralikta bulunan notları topalyip ders sayisina böldük
                              sonuc=(mat+fzk+turkce+kimya+muzik)/5;
                              //ortalmanin gecer not ile karsilastirmasini yaptık
                            if(sonuc>=55){
                                //Dogru ise ekrana bilgiyi bastirdik
                                System.out.println("Tebrikler sınıfı geçtiniz");
                              }
                            else{
                                //Yanlis ise ekrana bilgiyi bastirdik
                                System.out.print("Üzgünüm sınıfta kaldiniz");
                            }
                                //Not ortalma bilgisini ekrana bastirdik
                                System.out.println("Not ortlamaniz: "+sonuc);
                            }
                        else {
                                System.out.print("Girdiğiniz not 0-100 aralıgında degil");
                               return;
                         }






        }
    }
