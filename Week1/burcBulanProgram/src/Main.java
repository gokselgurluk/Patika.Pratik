import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mounth, day;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Dogdugunuz ayi yazınız");
        mounth = inputUser.nextInt();
        System.out.print("Dogdugunuz günü yazınız");
        day = inputUser.nextInt();

//1 ay içerisin de 2 farklı burç var girilen
// ay bilgisine göre hangi
// gün ise o aralıkta bulunan
// burcun kontrolunu sagladık

        if (mounth >= 1 && mounth <= 12) {
            //girilen ay bilgisinin kontrolü
            if (day >= 1 && day <= 31) {
                // girilen gün bilgisinin kontrolü
                if (mounth == 1) {                          //Oglak Burcu: 1 - 21 Ocak
                    if (day >= 1 && day <= 21){             //Kova Burcu : 22 - 31 Ocak
                        System.out.println("Oglak Burcu");
                        //ocak ayı girdisi icin girilen gün 1-21 arasın da ise oglak yazacağız
                    }
                    else{
                        System.out.println("Kova Burcu");
                        //ocak ayı girdisi icin girilen gün 22-30 arasın da ise kova yazacağız
                    }
                }
                else if (mounth == 2){
                    if (day >= 1 && day <= 19){              //Kova Burcu :1 - 19 Şubat
                         System.out.println("Kova Burcu");  //Balık Burcu :20 - 30 Şubat
                    }
                    else{
                        System.out.println("Balık Burcu");
                    }
                }
                else if (mounth == 3){                      //Balık Burcu:1 - 20 Mart
                    if (day >= 1 && day <= 20){             //Koç Burcu  :21 - 31 Mart
                        System.out.println("Balık Burcu");
                    }
                    else{
                        System.out.println("Koç Burcu");
                    }
                }
                else if (mounth == 4){                       //Koç  Burcu:1 - 20 Nisan
                    if (day >= 1 && day <= 20){             //Boğa Burcu :21 - 30 Nisan
                        System.out.println("Koç Burcu");
                    }
                    else{
                        System.out.println("Boğa Burcu");
                    }
                }
                else if (mounth == 5){                      //Boğa Burcu  :1 - 21 Mayıs
                    if (day >= 1 && day <= 21){            //İkizler Burcu:22 - 31 Mayıs
                        System.out.println("Boğa Burcu");
                    }
                    else{
                        System.out.println("İkizler Burcu");
                    }
                }
                else if (mounth == 6){
                    if (day >= 1 && day <= 22){               //İkizler Burcu :1 - 22 Haziran
                        System.out.println("İkizler Burcu");   //Yengeç Burcu :23 - 30 Haziran
                    }
                    else{
                        System.out.println("Yengeç Burcu");
                    }
                }
                else if (mounth == 7){
                    if (day >= 1 && day <= 22){              //Yengeç Burcu:1 - 22 Temmuz
                        System.out.println("Yengeç Burcu");  //Aslan Burcu :23 - 31 Temmuz
                    }
                    else{
                        System.out.println("Aslan Burcu");
                    }
                }
                else if (mounth == 8){
                    if (day >= 1 && day <= 22){             //Aslan Burcu :1 - 22 Ağustos
                        System.out.println("Aslan Burcu");  //Başak Burcu :23 -31 Ağustos
                    }
                    else{
                        System.out.println("Başak Burcu");
                    }
                }
                else if (mounth == 9){                      //Başak Burcu :1 - 22 Eylül
                    if (day >= 1 && day <= 22){             //Terazi Burcu:23 - 30 Eylül
                        System.out.println("Başak Burcu");
                    }
                    else{
                        System.out.println("Terazi Burcu");
                    }
                }
                else if (mounth == 10){                 //Terazi Burcu : 1 - 22 Ekim
                    if (day >= 1 && day <= 22){         //Akrep Burcu  : 23 - 31 Ekim
                        System.out.println("Terazi Burcu");
                    }
                    else{
                        System.out.println("Akrep Burcu");
                    }
                }
                else if (mounth == 11){                 //Akrep Burcu :1 - 22 Kasım
                    if (day >= 1 && day <= 22){         //Yay Burcu   :22 - 30 Kasım
                        System.out.println("Akrep Burcu");
                    }
                    else{
                        System.out.println("Yay Burcu");
                    }
                }
                else if (mounth == 12){             //Yay  Burcu  :1 - 22 Aralık
                    if (day >= 1 && day <= 22){    //Oğlak  Burcu :22 - 31 Aralık
                        System.out.println("Yay Burcu");
                    }
                    else{
                        System.out.println("Oğlak Burcu");
                    }
                }
            }
            else {
                System.out.println("Gün bilgisi 1-31 araligin da olmalı");
                // girilen gün bilgisinin kontrolün de şart saglanmıyorsa
            }
        }
        else {
                System.out.println("Ay bilgisi 1-12 araligin da olmalı");
            // girilen ay bilgisinin kontrolün de şart saglanmıyorsa
        }
    }
}