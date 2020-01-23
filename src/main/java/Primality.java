import java.util.Scanner;

public class Primality {

    public static void main(String[] args) {

        int[] list = { 1,2,3,4,5,6,7,8,9,10,11 };
        for(int i=0; i<list.length; i++){
            System.out.println("Is given number prime ? "+i+" is "+ isPrime(i));
        }
    }

    private static boolean isPrime(int number){
        if(number<2)
            return false;
        else if(number==2)
            return true;
        else if(number % 2 ==0)
            return false;

        int sqrt = (int)Math.sqrt(number);
        for(int i=3; i<=sqrt; i+=2){ //skips even numbers
            if(number % i == 0)
                return false;
        }

        return true;
    }
}
