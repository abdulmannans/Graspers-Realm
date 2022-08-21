public class AbdulMannanSAssignment1 {
    private static String discountEligibility(int[] totalInvoices) {
        if (totalInvoices.length > 4) {
            return eligibleUser(totalInvoices);
        }
        return "Not Eligible For Discount.";
    }

    private static String eligibleUser(int[] totalInvoices) {
        int sumOfAllInvoices = 0;
        for (int totalInvoice : totalInvoices) {
            sumOfAllInvoices += totalInvoice;
        }
        return "Get Upto " + getDiscountAmount(sumOfAllInvoices) + "Rs Off on Next Order.";
    }

    private static void getResults(int[] totalInvoices, String customerName) {
        System.out.println(customerName + "'s Eligibility:");
        System.out.println(discountEligibility(totalInvoices) + "\n");
    }

    private static int getDiscountAmount(int amount) {
        return amount * 10 / 100;
    }

    public static void main(String[] args) {
        int[] abdulInvoices = new int[]{100, 232, 300};
        int[] ibrahimInvoices = new int[]{321, 120, 70, 500, 379};
        getResults(abdulInvoices, "Abdul");
        getResults(ibrahimInvoices, "Ibrahim");
    }

}
