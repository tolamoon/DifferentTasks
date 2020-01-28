import java.util.Scanner;

public class MinMaxSum {

    private static void findMinMaxSum(int[] arr){

        long min = Long.MAX_VALUE;
        long max = 0;
        long sum = 0;

        for(int i=0; i<5; i++)
        {
            long curr = arr[i];
            if(max < curr) {
                max = curr;
            }
            if(min > curr) {
                min = curr;
            }
            sum += curr;
        }

        long minSum = sum - max;//Removes the largest of the 5 numbers to get the min sum
        long maxSum = sum - min;//Removes the smallest of the 5 numbers to get the max sum
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = in.nextInt();
        }
        findMinMaxSum(arr);
    }
}
