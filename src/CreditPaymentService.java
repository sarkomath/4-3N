public class CreditPaymentService {
    public double calculate(long credit, int time, double percent) {
        // формула рассчета платежа взята из https://temabiz.com/finterminy/ap-formula-i-raschet-annuitetnogo-platezha.html#lp1
        double month_percent = percent / 100 / 12;
        // считаем процент в месяц
        double a1 =  1 + month_percent;
        double d2 = time;
        double x = Math.pow(a1,d2);
        // возведение в степень
        double z = x - 1;
        double y = month_percent + (month_percent / z );
        double every_month = credit * y;
        // в задаче есть не совсем понятные переменные, принеобходимости, конечно будут исправлены.

        return every_month;
    }
}