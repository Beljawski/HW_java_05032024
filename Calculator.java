package hw_05032024;
// Сложения двух чисел
//Вычитания двух чисел
//Умножения двух чисел
//Деления двух чисел
//Каждая из арифметических операций должна быть реализована как отдельный метод.
public class Calculator {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;


        double sumResult = addNumbers(num1, num2);
        double differenceResult = subtractNumbers(num1, num2);
        double productResult = multiplyNumbers(num1, num2);
        double divisionResult = divideNumbers(num1, num2);


        System.out.println("Сложение: " + sumResult);
        System.out.println("Вычитание: " + differenceResult);
        System.out.println("Умножение: " + productResult);
        System.out.println("Деление: " + divisionResult);
    }


    private static double addNumbers(double a, double b) {
        return a + b;
    }


    private static double subtractNumbers(double a, double b) {
        return a - b;
    }


    private static double multiplyNumbers(double a, double b) {
        return a * b;
    }


    private static double divideNumbers(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Деление на ноль недопустимо.");
            return Double.NaN;
        }
    }
}

