public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payment = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Ваш ежемесячный платеж " + payment + " рублей");
    }
}