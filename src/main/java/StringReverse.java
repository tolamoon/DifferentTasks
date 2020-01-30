public class StringReverse {
    private static String reverseStr(String str){
        if(str==null || str.length()<=1){
            return str;
        }
        StringBuilder reversed = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "Alibaba";
        System.out.println(reverseStr(str));

    }
}
