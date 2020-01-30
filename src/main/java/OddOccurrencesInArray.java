import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    static int findOddNumbers(int[] A){

        //checking how many numbers appear odd times
        int result = 0;
        for (int aA : A) {
            //xor each element of array
            result = result ^ aA;
        }
        return result;

        //checking how many odd numbers in array -> unit tests
//        int oddCount = 0;
//        for (int element: A) {
//            if(element % 2 != 0)
//                oddCount++;
//        }
//        return oddCount;
    }
    private static Map<Integer, Integer> countOccurences(int[] array){
        Map<Integer,Integer> newMap = new HashMap<Integer, Integer>();

        for (int anArray : array) {
            if (newMap.containsKey(anArray)) {
                int val = newMap.get(anArray);
                newMap.put(anArray, val + 1);
            } else {
                newMap.put(anArray, 1);
            }
        }
        return newMap;
    }


    public static void main(String[] args){
        int exA[] = new int[]{1, 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        System.out.println(findOddNumbers(exA) + " odd occurences in array.");
        System.out.println("Duplicates in array: " + countOccurences(exA));
    }
}
