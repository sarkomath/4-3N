public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double FirstPic = service.calculate(1000000, 12, 9.99);
        System.out.println("1 year:");
        System.out.println(FirstPic);

        double SecondPic = service.calculate(1000000, 24, 9.99);
        System.out.println("2 years:");
        System.out.println(SecondPic);

        double ThirdPic = service.calculate(1000000, 36,9.99);
        System.out.println("3 yeas:");
        System.out.println(ThirdPic);


    }
}
