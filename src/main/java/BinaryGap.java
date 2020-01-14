public class BinaryGap {

    public static Integer findBinaryGap(String binaryValue) {

        //longest gap value
        Integer returnValue = 0;

        //table of splitted parts of string
        String splitValue[] = binaryValue.split("1");

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
        Integer val = 32; //2147483; //10092;
        String vals = val.toBinaryString(val);
        Integer gapVal = findBinaryGap(vals);
        System.out.println("Check Binary = " + vals);
        System.out.println("Longest Gap Value = " + gapVal);
    }
}
