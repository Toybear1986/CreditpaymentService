public class CreditPaymentService {

    public String calculate(int amount, int years) {
        double percent = 0.0999;
        double percentPerMonth = percent / 12;
        double constant = 1 + percentPerMonth;
        int totalPayments = years * 12;
        double constantInDegree = Math.pow(constant, totalPayments);
        double rate = (percentPerMonth * constantInDegree) / (constantInDegree - 1);
        double monthlyPayment = amount * rate;
        return String.format("%.0f", monthlyPayment);
    }
}
