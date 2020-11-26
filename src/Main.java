public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double firstPic = service.calculate(1000000, 12, 9.99);
        System.out.println("1 year:");
        System.out.println(firstPic);

        double secondPic = service.calculate(1000000, 24, 9.99);
        System.out.println("2 years:");
        System.out.println(secondPic);

        double thirdPic = service.calculate(1000000, 36,9.99);
        System.out.println("3 yeas:");
        System.out.println(thirdPic);


    }
}
