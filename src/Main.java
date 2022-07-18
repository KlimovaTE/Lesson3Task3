public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYear = service.calculate(1_000_000, 1, 9.99);
        System.out.println();
        System.out.println("При сумме кредита 1.000.000 рублей на 1 год при ставке 9,99% годовых ежемесячный платеж составит " + monthlyPaymentOneYear + " рублей.");


        int monthlyPaymentTwoYears = service.calculate(1_000_000, 2, 9.99);
        System.out.println();
        System.out.println("При сумме кредита 1.000.000 рублей на 2 года при ставке 9,99% годовых ежемесячный платеж составит " + monthlyPaymentTwoYears + " рублей.");


        int monthlyPaymentThreeYears = service.calculate(1_000_000, 3, 9.99);
        System.out.println();
        System.out.println("При сумме кредита 1.000.000 рублей на 3 года при ставке 9,99% годовых ежемесячный платеж составит " + monthlyPaymentThreeYears + " рублей.");

    }
}