public class BinaryGap {

    public static Integer findBinaryGap(Integer intValue) {

        //convert Integer to binary value
        String binaryValue = intValue.toBinaryString(intValue);

        //longest gap value
        Integer returnValue = 0;

        //array of splitted up by '1' parts of string
        String[] splitValue = binaryValue.split("1");

        int endValue = splitValue.length;

        //checking if 0 is at the end of string
        if (binaryValue.endsWith("0")) {
            endValue = endValue - 1;
        }

        for (int i = 0; i < endValue; i++) {
            if (returnValue < splitValue[i].length()) {
                returnValue = splitValue[i].length();
            }
        }
        return returnValue;
    }

    public static void main(String[] args) {

        Integer val = 42; //2147483; //10092;
        BinaryGap binaryGap = new BinaryGap();
        Integer gapVal = binaryGap.findBinaryGap(val);
        System.out.println("Check Binary = " + val);
        System.out.println("Longest Gap Value = " + gapVal);
    }
}
