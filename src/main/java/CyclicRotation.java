public class CyclicRotation {

    public int[] rotateArray(int[] array, int k) {

//        if(array == null)
//            return null;
        int arrayLen = array.length;
        int[] solution = new int[array.length];

        for(int i=0; i<array.length; i++){
            solution[( i + k )% arrayLen] = array[i];
        }

        return solution;
    }

    public static void main(String[] args){
        int[] testArray = { 1, 2, 3, 4 };
        int testK = 3;
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] expectedResult = cyclicRotation.rotateArray(testArray, testK);

        System.out.print("Given array is: ");
        for(int i=0; i<testArray.length; i++){
            System.out.print(testArray[i] + ", ");
        }
        System.out.print("Rotated array is: ");
        for(int i=0; i<expectedResult.length; i++){
            System.out.print(expectedResult[i] + ", ");
        }
    }
}
