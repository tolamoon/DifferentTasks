public class BubbleSort {

    private static int swaps = 0;

    private static void bubbleSorting(int[] array){
        if(array == null){
            return;
        }

        int endOff = 0;
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i=1; i<array.length-endOff; i++){
                if(array[i-1]>array[i]) {
                    swap(array, i - 1, i);
                    swapped = true;
                }
            }
            endOff++;
        }
        //System.out.println("EndOff: " + endOff);
    }
    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        swaps++;
    }

    public static void main(String[] args) {
        int[] arr = { 4,6,2,4,2,9,1};
        for(int elem: arr)
            System.out.print(elem + " ");
        System.out.println();

        bubbleSorting(arr);
        for(int eleArr : arr)
            System.out.print(eleArr + " ");
        System.out.println("\nSwaps: " + swaps);

    }
}
