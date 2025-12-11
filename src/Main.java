import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        System.out.println("Задача 1: Операции над целыми числами");
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        // Операции сравнения
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + (a / (double) b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        System.out.println();
        scanner.nextLine();


        // Задача 2
        System.out.println("Задача 2: Сравнение строк");
        System.out.print("Введите первую строку: ");
        String strA = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String strB = scanner.nextLine();

        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        System.out.println();
        scanner.close();

        // Задача 3
        System.out.println("Задача 3: Чётные числа из массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

    }
}