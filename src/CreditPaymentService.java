public class CreditPaymentService {
    public int calculate(int creditAmount, int creditTerm, double creditRate) {

        int creditTermInMonths = creditTerm * 12;
        double creditRateInMonth = (creditRate / 12) / 100;
        double a = (1 + creditRateInMonth);
        double degree = Math.pow(a, creditTermInMonths);
        double monthlyPayment = creditAmount * ((creditRateInMonth * degree) / (degree - 1));
        int roundedMonthlyPayment = (int) monthlyPayment;
        return roundedMonthlyPayment;

    }
}
