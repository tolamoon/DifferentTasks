public class BinaryGap {

    static Integer findBinaryGap(Integer intValue) {

        //convert Integer to binary value
        String binaryValue = Integer.toBinaryString(intValue);
        System.out.println("Binary Value: " + binaryValue);

        //longest gap value
        int returnValue = 0;

        //array of splitted up by '1' parts of string
        String[] splitValue = binaryValue.split("1");

        int length = splitValue.length;

        //checking if 0 is at the end of string
        if (binaryValue.endsWith("0")) {
            length -= 1;
        }

        for (int i = 0; i < length; i++) {
            if (returnValue < splitValue[i].length()) {
                returnValue = splitValue[i].length();
            }
        }
        return returnValue;
    }

    public static void main(String[] args) {

        int val = 55564; //2147483; //10092;
        Integer gapVal = findBinaryGap(val);
        System.out.println("Checked number: " + val + "\nLongest Gap Value = " + gapVal);
    }
}
