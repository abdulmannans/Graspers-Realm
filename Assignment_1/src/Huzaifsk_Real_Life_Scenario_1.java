import java.util.Scanner;

//Create a function to calculate rate of diesel,petrol and cng.

public class Huzaifsk_Real_Life_Scenario_1 {
    public static void main(String[] args) {
        Select_Fuel();
    }

    public static void Select_Fuel() {
        Scanner selectedValue = new Scanner(System.in);
        System.out.println("please enter valid number to calculate the fuel: \n 1. petrol \n 2.Diesel \n 3.CNG");
        int value = selectedValue.nextInt();
        if (value == 1) {
            System.out.println("Petrol is selected ");
            petrolSelected();
        } else if (value == 2) {
            System.out.println("Diesel is selected ");
            dieselSelected();
        } else if (value == 3) {
            System.out.println("CNG is selected ");
            cngSelected();
        } else {
            System.out.println("please enter valid amount");
        }
    }

    public static void petrolSelected() {
        Scanner amountInput = new Scanner(System.in);
        System.out.println("please enter amount");
        double amount = amountInput.nextDouble();
        Scanner rateInput = new Scanner(System.in);
        System.out.println("please enter rate");
        double rate = rateInput.nextDouble();
        double totalAmount = amount * rate;
        double roundOffTotal = Math.round(totalAmount*100)/100;
        System.out.println("the total amount for petrol is : " + roundOffTotal);
    }

    public static void dieselSelected() {
        Scanner amountInput = new Scanner(System.in);
        System.out.println("please enter amount");
        double amount = amountInput.nextDouble();
        Scanner rateInput = new Scanner(System.in);
        System.out.println("please enter rate");
        double rate = rateInput.nextDouble();
        double totalAmount = amount * rate;
        double roundOffTotal = Math.round(totalAmount*100)/100;
        System.out.println("the total amount for diesel is : " + roundOffTotal);
    }

    public static void cngSelected() {
        Scanner amountInput = new Scanner(System.in);
        System.out.println("please enter amount");
        double amount = amountInput.nextDouble();
        Scanner rateInput = new Scanner(System.in);
        System.out.println("please enter rate");
        double rate = rateInput.nextDouble();
        double totalAmount = amount * rate;
        double roundOffTotal = Math.round(totalAmount*100)/100;
        System.out.println("the total amount for cng is : " + roundOffTotal);
    }
}