import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class PermutationMissingElement {
    public int solution(int[] A){
        //index of last element in A[]
        int max = A.length+1;
        Set incompleteSet = new HashSet();

        //add each element to Set to verify each element exists
        for(int i=0; i<A.length; i++){
            incompleteSet.add(A[i]);
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
        int expMiss = 4;
        int[] exA = new int[] { 1, 2, 3, 5 };
        PermutationMissingElement pme = new PermutationMissingElement();
        Assert.assertEquals(pme.solution(exA), expMiss);
    }
}
