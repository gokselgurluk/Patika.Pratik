public class Main {

    public static void main (String[] args){

        boolean isPrimeNumber ;

        for (int i =2 ; i<=100 ; i++){
            isPrimeNumber=true;
            for (int k=2 ;k<=Math.sqrt(i);k++){
               if(i % k ==0) {
                   isPrimeNumber = false;

                   break;
               }
            }
                if(isPrimeNumber) {
                    System.out.println("Asal sayılar: " + i);
                }
        }

    }
}
