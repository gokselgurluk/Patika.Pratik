import java.util.Scanner;

public class Main {
    static  boolean isFind(int[] array,int value){
            for(int i:array){
                if (i==value){
                    return  true;
                }
            }

            return  false;
    }


    public static void main(String[] args) {
        int[] list = {3,7,4,4,2,9,10,21,2,33,10,1,1};
        int[] duplicate = new int[list.length];
        int startIndex = 0 ;

        for(int i=0; i<list.length ;i++ ){
            for(int j=0 ;j<list.length ; j++){
                if((i!=j) &&(list[i]%2==0) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];

                    }
                    break;
                }


            }


        }for (int value : duplicate){
            if(value !=0){
                System.out.print(value);
                System.out.print(" ");
            }
        }


    }
}
