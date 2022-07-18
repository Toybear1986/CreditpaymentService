public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println(service.calculate(1_000_000,1));
        System.out.println();
        System.out.println(service.calculate(1_000_000,2));
        System.out.println();
        System.out.println(service.calculate(1_000_000,3));
    }
}