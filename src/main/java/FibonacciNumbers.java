import java.util.Scanner;

public class FibonacciNumbers {

    static int[] generateFibonacci(int n){

        if(n == 1) { return new int[] { 1 }; }
        if(n == 2) { return new int[] { 1, 1 }; }

        int[] fibonacciArray = new int[n];
        fibonacciArray[0]=1;
        fibonacciArray[1]=1;

        for(int i=2; i<fibonacciArray.length; i++){
            fibonacciArray[i]=fibonacciArray[i-1]+fibonacciArray[i-2];
        }
        return fibonacciArray;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int exn = scanner.nextInt();

        int [] expFib = generateFibonacci(exn);

        for (int anExpFib : expFib) {
            System.out.print(anExpFib + " ");
        }

    }
}
