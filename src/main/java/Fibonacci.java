import java.util.Scanner;

public class Fibonacci {
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

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(fibonacci(n));
    }
}
