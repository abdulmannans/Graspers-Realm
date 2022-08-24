public class Huzaifsk_Assignment_1 {
    public static void main(String[] args) {
        int[] forArrayOne = new int[]{1, 2, 3, 4, 5};
        int[] forArrayTwo = new int[]{1, 2, 3};
        printResult(forArrayOne, "forArrayOne");
        printResult(forArrayTwo, "forArrayTwo");
    }

    public static String checkArray(int[] arrayInput) {
        int sumOfArrayElements = 0;
        if (arrayInput.length < 4) {
            return "invalid Array";
        }
        for (int i = 0; i < arrayInput.length; i++) {
            sumOfArrayElements = sumOfArrayElements + arrayInput[i];
        }
        return "the sum of array is : " + sumOfArrayElements;
    }

    public static void printResult(int[] array, String ArrayName) {
        System.out.println("the result for array " + ArrayName + " is : ");
        System.out.println(checkArray(array) + "\n");
    }
}
