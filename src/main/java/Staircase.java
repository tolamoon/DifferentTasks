import java.util.Scanner;

public class Staircase {

    private static void staircase(int n){

        for(int i=0; i<n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j<n-i ? " " : "#");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        staircase(n);
    }
}
