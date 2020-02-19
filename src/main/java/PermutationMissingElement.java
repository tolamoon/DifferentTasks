import java.util.HashSet;
import java.util.Set;

public class PermutationMissingElement {

    static int solution(int[] A){
        //index of last element in A[]
        int max = A.length+1;
        Set<Integer> incompleteSet = new HashSet<>();

        //add each element to hash set
        for (int aA : A) {
            incompleteSet.add(aA);
        }

        //because range is 1...(N+1)
        int missing = 0;
        for(int i=1; i<max+1; i++){
            if(!incompleteSet.contains(i))
                missing = i;
        }
        return missing;
    }

    public static void main(String[] args){
        int[] exA = new int[] { 1, 2, 3, 5 };
        System.out.println(solution(exA));
    }
}
