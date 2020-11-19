public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double first_pic = service.calculate(1000000, 12, 9.99);
        System.out.println("1 year:");
        System.out.println(first_pic);

        double second_pic = service.calculate(1000000, 24, 9.99);
        System.out.println("2 years:");
        System.out.println(second_pic);

        double third_pic = service.calculate(1000000, 36,9.99);
        System.out.println("3 yeas:");
        System.out.println(third_pic);


    }
}
