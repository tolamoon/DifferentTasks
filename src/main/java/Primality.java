import java.util.Scanner;

public class Primality {

    public static void main(String[] args) {

        Primality pr = new Primality();
        int[] list = { 1,2,3,4,5,6,7,8,9,10,11 };
        for(int i=0; i<list.length; i++){
            System.out.println("Is given number prime ? "+i+" is "+ isPrime(i));
        }
    }

    public static boolean isPrime(int number){
        if(number<2)
            return false;
        else if(number==2)
            return true;
        else if(number % 2 ==0)
            return false;

        return true;
    }
}
