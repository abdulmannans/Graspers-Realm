public class AbdulMannanSAssignment1 {
    public static String discountEligibility(int [] totalInvoices){
        if(totalInvoices.length > 4){
            int sumOfAllInvoices = 0;
            int discountedAmount;

            for (int totalInvoice : totalInvoices) {
                sumOfAllInvoices += totalInvoice;
            }
            
            discountedAmount = sumOfAllInvoices * 10/100;
            return "Get Flat " + discountedAmount + "Rs Off on Next Order.";
        }
        return "Not Eligible For Discount.";
    }
    public static void main(String[] args) {
        int[] abdulInvoices = new int[]{100,232,300};
        int[] ibrahimInvoices = new int[]{321,120,70,500,379};

        System.out.println("Abdul's Eligibility:");
        System.out.println(discountEligibility(abdulInvoices));

        System.out.println("\nIbrahim Eligibility:");
        System.out.println(discountEligibility(ibrahimInvoices));
    }

}
