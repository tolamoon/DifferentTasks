public class MergeStrings {
    public static String merge(String str1, String str2){
        StringBuilder out = new StringBuilder();

        for(int i=0; i<str1.length() || i<str2.length(); i++){
            if(i<str1.length()){
                out.append(str1.charAt(i));
            }
            if(i<str2.length()){
                out.append(str2.charAt(i));
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        String str1 = "Monika";
        String str2 = "Marcin";
        System.out.println(merge(str1, str2));
    }
}
