public class Main {
    public static void main(String[] args) {
        double balance = 10.15;
        double payment = 1001.0;
        double bonus = 0.01;

        if (payment > 1_000){
            System.out.println("Вам зачислено " + (payment * bonus + payment) + " из них бонусных рублей: " + (payment * bonus) + ". Ваш баланс " + (payment * bonus + balance + payment));
        } else{
        System.out.println("Вам зачислено " + payment + ". Ваш баланс " + (balance + payment));
        }
    }
}