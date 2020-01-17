public class OddOccurrencesInArray {

    public int solution(int[] A){
        //length given array
        int lengthA = A.length;

        int result=0;
        for(int i=0; i<lengthA; i++){
            //xor of 0 and each element of array
            result = result ^ A[i];
        }
        return result;
    }

    public static void main(String[] args){
        OddOccurrencesInArray odd = new OddOccurrencesInArray();
        int exA[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        System.out.println("Odd number in given array is: " + odd.solution(exA));
    }
}
