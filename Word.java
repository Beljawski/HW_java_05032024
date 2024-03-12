package hw_05032024;

import java.util.Scanner;

//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества
//букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa
public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух слов
        System.out.println("Введите первое слово:");
        String word1 = scanner.next();

        System.out.println("Введите второе слово:");
        String word2 = scanner.next();

        // Проверка четности количества букв
        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            int half1 = word1.length() / 2;
            int half2 = word2.length() / 2;

            String combinedWord = word1.substring(0, half1) + word2.substring(half2);
            System.out.println("Результат: " + combinedWord);
        } else {
            System.out.println("Оба слова должны иметь четное количество букв.");
        }
    }
}
