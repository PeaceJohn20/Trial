public class Array {
    public static void main(String[] args) {
        int[] numberArray = new int[5];
        numberArray[0] = 17;
        numberArray[1] = 34;
        numberArray[2] = 54;
        numberArray[3] = 77;
        numberArray[4] = 47;

        for (int i = numberArray.length - 1; i >= 0; i--) {
            if (numberArray[i] == 54) {
                System.out.println("found" + numberArray[i]);
                break;
            }
        }
    }
