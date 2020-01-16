public class CyclicRotation {

    public int[] rotateArray(int[] A, int K) {

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
                rotatedA[( i + K )% N] = A[i];
            }
        }
        return rotatedA;
    }

    public static void main(String[] args){
        int[] exA = { 1, 2, 3, 4 }; //N=4
        int exK = 3; //K=3
        CyclicRotation cyclicRotation = new CyclicRotation();
        //
        int[] expectedResult = cyclicRotation.rotateArray(exA, exK);

        System.out.print("Given array is: ");
        for(int i=0; i<exA.length; i++){
            System.out.print(exA[i] + ", ");
        }
        System.out.print("Rotated array is: ");
        for(int i=0; i<expectedResult.length; i++){
            System.out.print(expectedResult[i] + ", ");
        }
    }
}
