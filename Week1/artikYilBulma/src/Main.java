import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        year = userInput.nextInt();
        //yıl bilgisini aldık
        if (year >= 0) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Bu yıl artık bir yıldır");
                    }
                    else {
                        System.out.println("Bu yıl artık bir yıl değildir");
                    }
                }else {
                    System.out.println("Bu yıl artık bir yıldır");
                }
            }
            else {
                System.out.println("Bu yıl artık bir yıl değildir");
            }
        }
    }
}