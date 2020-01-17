public class FibonacciNumbers {

    public int[] generateFibonacci(int n){

        if(n == 1) { return new int[] { 0 }; }
        if(n == 2) { return new int[] { 0, 1 }; }

        int[] fibonacciArray = new int[n];
        fibonacciArray[0]=0;
        fibonacciArray[1]=1;

        for(int i=2; i<fibonacciArray.length; i++){
            fibonacciArray[i]=fibonacciArray[i-1]+fibonacciArray[i-2];
        }
        return fibonacciArray;
    }

    public static void main(String[] args){
        int exn=5;
        FibonacciNumbers fibs = new FibonacciNumbers();
        int [] expFib = fibs.generateFibonacci(exn);

        for(int i=0; i<expFib.length; i++){
            System.out.print(expFib[i] + ", ");
        }

    }
}
