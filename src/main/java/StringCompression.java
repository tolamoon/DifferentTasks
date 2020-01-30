public class StringCompression {
    private static String compressMsg(String msg){
        StringBuilder out = new StringBuilder();

        int count = 1;
        for(int i = 0; i < msg.length(); i++){
            //to avoid StringIndexOutOfBoundsException
            if(i == msg.length()-1){
                out.append(msg.charAt(i));
                if(count > 1){
                    out.append(count);
                }
                break;
            }

            if(msg.charAt(i) == msg.charAt(i+1)){
                count++;
            } else {
                out.append(msg.charAt(i));
                if(count > 1) {
                    out.append(count);
                }
                count = 1;
            }

        }
        System.out.println(out.toString());
        return out.toString();
    }

    public static void main(String[] args) {
        String msg = "aaabbbbcd";
        compressMsg(msg);
    }

}
