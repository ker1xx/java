import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Это калькулятор");
            System.out.println("1. Сложение \n2. Вычитание\n3. Умножение \n4. Деление\n5. Возведение в степень\n" +
                    "6. Вычисление квадратного корня\n7. Вычисление факториала \nВыберите число: ");
            int enter_number = in.nextInt();
            if (enter_number == 1)
                sum();
            else if (enter_number == 2)
                difference();
            else if (enter_number == 3)
                multiplication();
            else if (enter_number == 4)
                division();
            else if (enter_number == 5)
                grade();
            else if (enter_number == 6)
                radical();
            else if (enter_number == 7)
                factorial();
            else
                System.out.println("Вы ввели неверное число");
        }
    }
    private static void sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float operand1 = in.nextFloat();
        System.out.print("\nВведите второе число: ");
        float operand2 = in.nextFloat();
        System.out.println("Сумма " + operand1 + " и " + operand2 + " равна " + (operand1 + operand2));
    }
    private static void difference()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float operand1 = in.nextFloat();
        System.out.print("\nВведите второе число: ");
        float operand2 = in.nextFloat();
        System.out.println("Разность " + operand1 + " и " + operand2 + " равна " + (operand1 - operand2));
    }
    private static void multiplication()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float operand1 = in.nextFloat();
        System.out.print("\nВведите второе число: ");
        float operand2 = in.nextFloat();
        System.out.println("Произведение " + operand1 + " и " + operand2 + " равно " + (operand1 * operand2));
    }
    private static void division()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите делимое: ");
        float operand1 = in.nextFloat();
        System.out.print("\nВведите делитель: ");
        float operand2 = in.nextFloat();
        if (operand2 == 0)
            System.out.println("На ноль делить нельзя");
        else
            System.out.println("Частное " + operand1 + " и " + operand2 + " равно " + (operand1 / operand2));
    }
    private static void grade()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        float operand = in.nextFloat();
        System.out.print("\nВведите степень, в которую необходимо возвести число число: ");
        float grade = in.nextFloat();
        System.out.println("Число " + operand + " в " + grade + " степени равно " +Math.pow(operand,grade));
    }
    private static void radical()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        float operand = in.nextFloat();
        System.out.println("Квадратный корень из " + operand + " равен " +Math.sqrt(operand));
    }
    private static void factorial()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        float operand = in.nextFloat();
        float factorial_of_number=1;
        if (operand == 0)
            System.out.println("Факториал числа " + operand + " равен " + factorial_of_number);
        else {
            for (int i = 1; i != operand; i++)
            {
                factorial_of_number = factorial_of_number * i;
            }
            System.out.println("Факториал числа " + operand + " равен " + factorial_of_number);
        }
    }
}
