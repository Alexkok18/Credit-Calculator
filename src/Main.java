public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("Вам начислено " + miles + " миль");
    }
}