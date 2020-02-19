import java.util.Scanner;

public class Fibonacci {
    // Nth element of fibonacci series using loop
    private static int fibonacci(int n) {

        int prev = 0;
        int curr = 1;

        for(int i=2; i<=n; i++){
            int next = prev+curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    // Nth element of fibonacci series using recursion
    private static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacci2(number-1) + fibonacci2(number -2); //tail recursion
}

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(fibonacci(n));
        System.out.println(fibonacci2(n));
    }
}
