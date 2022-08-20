public class Variable {
    public static void main(String[] args) {
        int x = 5;
        int y = x + 3;
        System.out.println(y);

        int john = 100;
        int nik = john * 5;
        int sum = john + nik;
        System.out.println("Сумма John и Nik " + sum);

        //год месяц день
        int days = 10000;
        int ostYears = days / 365;
        int ostMonths = days % 365 / 31;
        int ostDays = days - (ostYears * 365 + ostMonths * 31);
        System.out.println("В " + days + " днях");
        System.out.println("лет " + ostYears);
        System.out.println("месяцев " + ostMonths);
        System.out.println("дней " + ostDays);

    }
}
