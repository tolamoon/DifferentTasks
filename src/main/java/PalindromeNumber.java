import java.util.Scanner;

public class PalindromeNumber {

    private static boolean isPalindrome(int number) {
        int temp = number; // copied number into variable
        int reverse = 0;

        while (temp != 0) {
            int remainder = temp % 10; //1
            reverse = reverse * 10 + remainder; //2
            temp = temp / 10; //3
        }
        // if original and reversed number is equal means
        // number is palindrome
        return number == reverse;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        int number = new Scanner(System.in).nextInt();

        if(isPalindrome(number)){
            System.out.println("Number : " + number + " is a palindrome");
        } else {
            System.out.println("Number : " + number + " is NOT a palindrome");
        }
    }
}
