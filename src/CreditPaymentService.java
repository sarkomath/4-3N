public class CreditPaymentService {
    public double calculate(long credit, int time, double percent) {
        // формула рассчета платежа взята из https://temabiz.com/finterminy/ap-formula-i-raschet-annuitetnogo-platezha.html#lp1
        double MonthPercent = percent / 100 / 12;
        // считаем процент в месяц
        double a1 =  1 + MonthPercent;
        double d2 = time;
        double x = Math.pow(a1,d2);
        // возведение в степень
        double z = x - 1;
        double y = MonthPercent + (MonthPercent / z );
        double EveryMonth = credit * y;
        // в задаче есть не совсем понятные переменные, принеобходимости, конечно будут исправлены.

        return EveryMonth;
    }
}