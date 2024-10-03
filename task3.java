import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір матриць n (n <= 15): ");
        int n = scanner.nextInt();

        if (n > 15 || n <= 0) {
            System.out.println("Розмір матриць повинен бути в межах від 1 до 15.");
            return;
        }

        double[][] A = new double[n][n];
        System.out.println("Введіть елементи матриці A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }

        double[][] B = new double[n][n];
        System.out.println("Введіть елементи матриці B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = scanner.nextDouble();
            }
        }

        double[][] X = new double[n][n];
        for (int i = 0; i < n; i++) {
            double maxInRowB = findMaxInRow(B[i]);

            for (int j = 0; j < n; j++) {
                X[i][j] = A[i][j] * maxInRowB;
            }
        }

        System.out.println("Матриця X:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(X[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static double findMaxInRow(double[] row) {
        double max = row[0];
        for (int i = 1; i < row.length; i++) {
            if (row[i] > max) {
                max = row[i];
            }
        }
        return max;
    }
}