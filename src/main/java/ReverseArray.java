import java.util.Scanner;

public class ReverseArray {

    private static void reverse(int[] arr, int start, int end){
        if((arr == null) || (start < 0) || (start >= arr.length) || (end < 0) || (end >= arr.length)) {
            return ;
        }

        while(start<end){
            swap(arr, start++, end--);
        }

        //Print rotated array
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 2,3,4,5,6,7 };
        for(int elArr : array) {
            System.out.print(elArr + " ");
        }
        System.out.println();

        reverse(array, 0, array.length-1);
    }


}
