import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        int temp = number; // copied number into variable
        int reverse = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            System.out.println("remainder:" + remainder);
            reverse = reverse * 10 + remainder;
            System.out.println("reverse:" + reverse);
            temp = temp / 10;
            System.out.println("temp:" + temp);
        }
        // if original and reversed number is equal means
        // number is palindrome
        if (number == reverse) {
            return true;
        }
        return false;
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
