public class task1 {
    public static void main(String[] args) {

        double a = 2.5;
        double b = 3.5;

        double result1 = calculateRealResult(a, b);
        System.out.println("1. Результат для дійсних чисел (double): " + result1);

        int aInt = (int) a;
        int bInt = (int) b;
        double result2 = calculateRealResult(aInt, bInt);
        System.out.println("2. Результат для цілих чисел (int), але типу double: " + result2);

        int result3 = calculateIntegerResult(a, b);
        System.out.println("3. Результат для дійсних чисел (double), але типу int: " + result3);
    }

    public static double calculateRealResult(double a, double b) {
        return a + (a + b - 1) / (Math.pow(a, 2) + 2) - Math.pow(a * b, 3);
    }

    public static int calculateIntegerResult(double a, double b) {
        return (int) (a + (a + b - 1) / (Math.pow(a, 2) + 2) - Math.pow(a * b, 3));
    }
}
