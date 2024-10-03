import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();
        if (a >= b) {
            System.out.println("Значення a повинно бути менше b.");
            return;
        }
        System.out.print("Введіть кількість елементів масиву n (n <= 200): ");
        int n = scanner.nextInt();

        if (n > 200 || n <= 0) {
            System.out.println("Кількість елементів масиву повинна бути в межах від 1 до 200.");
            return;
        }
        double[] X = new double[n];
        System.out.println("Введіть елементи масиву X:");
        for (int i = 0; i < n; i++) {
            X[i] = scanner.nextDouble();
        }
        double sum = 0;
        double product = 1;
        double maxInRange = Double.NEGATIVE_INFINITY;
        double minInRange = Double.POSITIVE_INFINITY;
        boolean foundInRange = false;
        for (int i = 0; i < n; i++) {
            if (X[i] < a) {
                sum += X[i];
            }
            if (X[i] > b) {
                product *= X[i];
            }
            if (X[i] >= a && X[i] <= b) {
                foundInRange = true;
                if (X[i] > maxInRange) {
                    maxInRange = X[i];
                }
                if (X[i] < minInRange) {
                    minInRange = X[i];
                }
            }
        }
        System.out.println("Сума елементів менших за a: " + sum);
        System.out.println("Добуток елементів більших за b: " + product);
        if (foundInRange) {
            System.out.println("Максимальне значення в межах [a, b]: " + maxInRange);
            System.out.println("Мінімальне значення в межах [a, b]: " + minInRange);
        } else {
            System.out.println("Не знайдено елементів в межах [a, b].");
        }
        scanner.close();
    }
}
