import java.util.Scanner;

//Create a function to calculate rate of diesel,petrol and cng.

public class Huzaifsk_Real_Life_Scenario_1 {
    public static void main(String[] args) {
        selectFuel();
    }

    public static void selectFuel() {
        Scanner selectedValue = new Scanner(System.in);
        System.out.println("please enter valid number to calculate the fuel: \n 1. petrol \n 2.Diesel \n 3.CNG");
        int value = selectedValue.nextInt();
        if (value == 1) {
            System.out.println("Petrol is selected and the rate is 106.31");
            chooseOption();
        } else if (value == 2) {
            System.out.println("Diesel is selected the rate is 94.27");
            chooseOption();
        } else if (value == 3) {
            System.out.println("CNG is selected the rate is 83");
            chooseOption();
        } else {
            System.out.println("please enter valid amount");
        }
    }

    public static void calculateLitres() {
        int value;
        Scanner enterValue = new Scanner(System.in);
        System.out.println("please select for calculation : \n 1. petrol \n 2.Diesel \n 3.CNG ");
        value = enterValue.nextInt();
        double result = 0;
        double liters = enterLiters();
        switch (value) {
            case 1:
                result = liters * 106.31;
                System.out.println("the total of petrol is : " + result + " rs for " + liters + " liters");
                break;
            case 2:
                result = liters * 94.27;
                System.out.println("the total of diesel is : " + result + " rs for " + liters + " liters");
                break;
            case 3:
                result = liters * 83.00;
                System.out.println("the total of CNG is : " + result + " rs for " + liters + " kgs");
                break;
        }
    }

    public static int enterLiters() {
        Scanner amountInput = new Scanner(System.in);
        System.out.println("please enter liter");
        int liters = amountInput.nextInt();
        System.out.println("your liter : " + liters);
        return liters;
    }

    public static double enterAmount() {
        Scanner amountInput = new Scanner(System.in);
        System.out.println("please enter amount");
        int amount = amountInput.nextInt();
        System.out.println("your amount : " + amount);
        return amount;
    }

    public static void calculateAmount() {
        int value;
        Scanner enterValue = new Scanner(System.in);
        System.out.println("please select for calculation : \n 1. petrol \n 2.Diesel \n 3.CNG ");
        value = enterValue.nextInt();
        double result = 0;
        double amount = enterAmount();
        switch (value) {
            case 1:
                result = amount / 106.31;
                System.out.println("the total of petrol is : " + result + " liters for " + amount + " amount");
                break;
            case 2:
                result = amount / 94.27;
                System.out.println("the total of diesel is : " + result + " liters for " + amount + " amount");
                break;
            case 3:
                result = amount / 83.00;
                System.out.println("the total of CNG is : " + result + " liters for " + amount + " amount   ");
                break;
        }
    }

    public static int chooseOption() {
        Scanner enterValue = new Scanner(System.in);
        System.out.println("please select the way : \n 1. using liters \n 2. using amount");
        int value = enterValue.nextInt();
        if (value == 1) {
            calculateLitres();
        } else if (value == 2) {
            calculateAmount();
        }
        return value;
    }

}

//    public static void petrolSelected() {
//        Scanner amountInput = new Scanner(System.in);
//        System.out.println("please enter amount");
//        double amount = amountInput.nextDouble();
//        Scanner rateInput = new Scanner(System.in);
//        System.out.println("please enter rate");
//        double rate = rateInput.nextDouble();
//        double totalAmount = amount * rate;
//        double roundOffTotal = Math.round(totalAmount * 100) / 100;
//        System.out.println("the total amount for petrol is : " + roundOffTotal);
//    }
//
//
//
//    public static void dieselSelected() {
//        Scanner amountInput = new Scanner(System.in);
//        System.out.println("please enter amount");
//        double amount = amountInput.nextDouble();
//        Scanner rateInput = new Scanner(System.in);
//        System.out.println("please enter rate");
//        double rate = rateInput.nextDouble();
//        double totalAmount = amount * rate;
//        double roundOffTotal = Math.round(totalAmount * 100) / 100;
//        System.out.println("the total amount for diesel is : " + roundOffTotal);
//    }
//
//    public static void cngSelected() {
//        Scanner amountInput = new Scanner(System.in);
//        System.out.println("please enter amount");
//        double amount = amountInput.nextDouble();
//        Scanner rateInput = new Scanner(System.in);
//        System.out.println("please enter rate");
//        double rate = rateInput.nextDouble();
//        double totalAmount = amount * rate;
//        double roundOffTotal = Math.round(totalAmount * 100) / 100;
//        System.out.println("the total amount for cng is : " + roundOffTotal);
//    }
//}


//=================================================================================================

//    public class Real_Life_Scenario_1 {
//        public static void main(String[] args) {
//            Select_Fuel();
//            amountCalculator();
//        }
//
//        public static void Select_Fuel() {
//            Scanner amountAccepter = new Scanner(System.in);
//            System.out.println("please enter valid number to calculate the fuel: \n 1. petrol \n 2.Diesel \n 3.CNG");
//            int value = amountAccepter.nextInt();
//            switch (value) {
//                case 1:
//                    System.out.println("you have selected petrol i.e: " + value);
//                    break;
//                case 2:
//                    System.out.println("you have selected Diesel i.e: " + value);
//                    break;
//                case 3:
//                    System.out.println("you have selected CNG i.e: " + value);
//                    break;
//                default:
//                    System.out.println("please select value from 1,2 or 3");
//            }
//        }
//
//        public static void amountCalculator(){
//            double value = 0;
//            Scanner enterAmount = new Scanner(System.in);
//            Scanner enterRate = new Scanner(System.in);
//            if (value <= 3){
//                System.out.println("please enter fuel amount : ");
//                double fuelAmount = enterAmount.nextDouble();
//                System.out.println("please enter fuel rate : ");
//                double fuelRate = enterRate.nextDouble();
//                double rateCalculator = fuelRate * fuelAmount;
//                System.out.println(rateCalculator);
//            }else{
//                System.out.println("invalid");
//            }
//        }
//    }
//
//}
