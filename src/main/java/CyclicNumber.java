import java.math.BigInteger;

public class CyclicNumber {

    public boolean isCyclic(String number){

        String[] permutations = new String[number.length()];

        //create number's permutations
        for(int i=0; i<permutations.length; i++){
            permutations[i] = number.substring(i) + number.substring(0, i);
        }

        BigInteger value = new BigInteger(number);
        String formatStr = "%0"+number.length()+"d";

        return true;
    }

    public static void main(String[] args) {
//        String s="hello";
//        System.out.println(s.substring(1)+s.substring(0,1));//he
    }
}
