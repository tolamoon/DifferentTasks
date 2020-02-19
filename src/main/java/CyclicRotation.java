public class CyclicRotation {

    static int[] rotateArray(int[] A, int K) {

        //number of elements in A array
        int N = A.length;

        //rotated array with the same number of elements
        int[] rotatedA = new int[A.length];

        //if K % N == 0, then after K rotations, the array would be exactly the same
        if (N == 0 || N == 1 || K % N == 0) {
            return A;
        }
        else {
            if(K > N){
                //modify K if K greater than N
                K = K % N;
            }
            for(int i=0 ; i<N ; i++){
                //rotate right
                rotatedA[( i + K )% N] = A[i];
                //rotate left
                //rotatedA[(i+N-K)% N] = A[i];
            }
        }
        return rotatedA;
    }

    public static void main(String[] args){
        int[] exA = { 1, 2, 3, 4, 5 }; //N=4
        int exK = 3; //K=3
        int[] expectedResult = rotateArray(exA, exK);

        System.out.print("Given array is: ");
        for (int anExA : exA) {
            System.out.print(anExA + ", ");
        }
        System.out.print("\nRotated array " + exK + " times: ");
        for (int anExpectedResult : expectedResult) {
            System.out.print(anExpectedResult + ", ");
        }
    }
}
