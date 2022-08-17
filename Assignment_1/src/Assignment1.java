public class Assignment1 {
    public static String addArray(int [] numbersArray){
        if(numbersArray.length < 4){
            return "Invalid Array";
        }else {
            int sumOfArray = 0;
            for (int i = 0; i < numbersArray.length; i++) {
                sumOfArray += numbersArray[i];
            }
            return "Sum Of Array Is " + sumOfArray;
        }
    }
    public static void main(String[] args) {
        int[] firstArray = new int[]{1,2,3};
        int[] secondArray = new int[]{1,2,3,4,5};
        System.out.println("First Array:");
        System.out.println(addArray(firstArray));
        System.out.println("\nSecond Array:");
        System.out.println(addArray(secondArray));
    }
}
