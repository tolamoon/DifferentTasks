import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPuzzle {

    private static String solution(String strIn) {
        strIn = strIn.replace(".", "").toLowerCase();
        StringBuilder out = new StringBuilder();
        List<String> list = new ArrayList<String>(Arrays.asList(strIn.split(" ")));

        String current = list.get(0);
        while(!list.isEmpty()){
            current = list.get(0);
            for(int i=1; i<list.size(); i++){
                int elLen = list.get(i).length();
                if(elLen < current.length()){
                    current = list.get(i);
                }
            }
            list.remove(current);
            out.append(current).append(" ");
        }
        return out.toString();
    }

    public static void main(String args[]) {
        String strIn = "Ala ma juz siedem kotow.";
        System.out.print(solution(strIn));
    }
}
