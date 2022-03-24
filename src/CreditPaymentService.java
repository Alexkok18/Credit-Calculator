public class CreditPaymentService {
    public double calculate(double sum, double percent, double month) {
        double procenti = percent / 12 / 100;
        double procent = 1 + procenti;
        double x = Math.pow(procent, month);

        double payment = sum * (procenti * x / (x - 1));
        return payment;

    }
}