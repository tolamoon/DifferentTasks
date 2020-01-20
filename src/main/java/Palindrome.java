public class Palindrome {

    public static String isPalindrome(String str) {

        int begin = 0, end = str.length() - 1;

        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end))
                return "false"; //It is not a palindrome

            begin++;
            end--;
        }
        //It is a palindrome
        return "true";
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "abba";
        Palindrome p = new Palindrome();
        String res = p.isPalindrome(str);

        if (res=="true")
            System.out.print("Yes,it's a palindrome.");
        else
            System.out.print("No,it's not a palindrome.");
    }
}
