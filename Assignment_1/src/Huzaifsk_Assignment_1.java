public class Huzaifsk_Assignment_1 {
    public static void main(String[] args) {
        int[] forArrayOne = new int[]{1, 2, 3};
        int[] forArrayTwo = new int[]{1, 2, 3, 4, 5};
        checkArrayOne(forArrayOne);
        checkArrayTwo(forArrayTwo);
    }

    public static void checkArrayOne(int[] arrayOne) {
        System.out.println("the no of element in Array One : " + arrayOne.length);
        if (arrayOne.length < 4) {
            System.out.println("invalid Array");
        } else {
            sumOfArrayOne(arrayOne);
        }
    }

    public static void sumOfArrayOne(int[] arrayOne) {
        int sumOfArrayOne = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            sumOfArrayOne = sumOfArrayOne + arrayOne[i];
        }
        System.out.println(sumOfArrayOne);
    }

    public static void checkArrayTwo(int[] arrayTwo) {
        System.out.println("the no of element in Array Two : " + arrayTwo.length);
        if (arrayTwo.length < 4) {
            System.out.println("invalid Array");
        } else {
            sumOfArrayTwo(arrayTwo);
        }
    }

    public static void sumOfArrayTwo(int[] arrayTwo) {
        int sumOfArrayTwo = 0;
        for (int i = 0; i < arrayTwo.length; i++) {
            sumOfArrayTwo = sumOfArrayTwo + arrayTwo[i];
        }
        System.out.println(sumOfArrayTwo);
    }
}
