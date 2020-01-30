import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class PermutationMissingElement {
    int solution(int[] A){
        //index of last element in A[]
        int max = A.length+1;
        Set<Integer> incompleteSet = new HashSet<Integer>();

        //add each element to hash set
        for (int aA : A) {
            incompleteSet.add(aA);
        }

        //because range is 1...(N+1)
        for(int i=1; i<max+1; i++){
            if(!incompleteSet.contains(i)) {
                return i;
            }
        }
        throw new RuntimeException("It shouldn't reach here");
    }

    public static void main(String[] args){
        int[] exA = new int[] { 1, 2, 3, 5 };
        PermutationMissingElement pme = new PermutationMissingElement();
        System.out.println(pme.solution(exA));
    }
}
