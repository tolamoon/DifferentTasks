import java.util.*;

public class CountDuplicates {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> array){
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for(Integer i: array){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        return newList;
    }

    public static Map<Integer, Integer> countDuplicates(ArrayList<Integer> array){
        Map<Integer, Integer> duplicatesNo = new HashMap<Integer, Integer>();

        for(Integer i: array){
            if(duplicatesNo.containsKey(i)){
                duplicatesNo.put(i, duplicatesNo.get(i) + 1);
            }
            else {
                duplicatesNo.put(i, 1);
            }
        }
        return duplicatesNo;
    }

    public static void main(String[] args) {

        ArrayList<Integer> exList = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println("ArrayList with duplicates: " + exList);

        ArrayList<Integer> newList = removeDuplicates(exList);
        System.out.println("Print after removing duplicates: " + newList);

        System.out.println("Counting duplicates: " + newList);
        Map<Integer, Integer> newMap = countDuplicates(exList);
        for(Map.Entry<Integer, Integer> entry: newMap.entrySet()){
            System.out.println(entry.getKey() +  " = " + entry.getValue());
        }

    }
}
