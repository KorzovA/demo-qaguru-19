package demoqa;

public class MathOperation {

    public static void main(String[] args)
    {
        int number1 = 123;
        int number2 = 12;
        int k = 3;
        short number3 = 15;
        long number4 = 100L;
        double number5 = 5.55;
        byte number6 = 100;
        byte number7 = 110;

        System.out.println("Сумма " + (number1 + number2) + ".");
        System.out.println("Вычитание " + (number1 - number2) + ".");
        System.out.println("Умножение " + (number1 * number2) + ".");
        System.out.println("Деление " + (number1 / number2) + ".");
        System.out.println("Остаток " + (number1 % number2) + ".");

        System.out.println("Логические операторы");
        if (number1 >= k * number2 && number1 < 1000) {
            System.out.println("Все четко красавчег");
        }
        else {
            System.out.println("Что-то пошло не так");
        }
        System.out.println("Тернарные операторы");
        boolean result1 = (number2 == number3) ? true : false;
        System.out.println("Равенство: " + result1 + ".");
        boolean result2 = (number5 <= number3) ? true : false;
        System.out.println("Сравнение: " + result2 + ".");

        System.out.println("Примитивные типы данных");
        System.out.println("Сумма Целого и дробного чисел: " + (number2 + number5) + ".");
        System.out.println("Вычитание Целого и дробного чисел: " + (number5 - number2) + ".");
        System.out.println("Умножение Целого и дробного чисел: " + (number3 * number2) + ".");
        System.out.println("деление Целого и дробного чисел: " + (number4 / number5) + ".");


        System.out.println("Целочисленные типа byte с диапазоном допустимых значений -128 to 127.");
        byte sumByte = (byte) (number6 + number7);
        System.out.println("Результат: " + sumByte + ".");

    }
}