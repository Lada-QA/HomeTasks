package HTack_lection4;

import java.util.Random;

/**
 * Создать последовательность случайных чисел,
 * найти и  вывести наибольшее из них (случайные
 * числа можно получить из класса Random).
 */

public class Numbers {
    public static void main(String[] args) {
        int[] numberRand = new int[10]; //Создаем массив с длинной 10
        Random random = new Random(); // Объявляем класс Random
        int MAX = 0; // Инициализируем переменную MAX со значением 0

        for (int i = 0; i < numberRand.length; i++) { // Задаем цикл массива
            int RandNum = random.nextInt(); // Инициализируем переменную с добавлением случайных чисел
            numberRand[i] = RandNum; // Присваиваем массиву значения случайных чисел

            if (i == 0) System.out.print("[ "); // Открываем квадратную скобку перед первым чилом массива,
            // находящимся по индексом 0
            System.out.print(numberRand[i] + " ");
            if (i == 9) System.out.println("]"); //Закрываем скобку после последнего индекса
            if (RandNum > MAX) { // Находим значение максимального элемента массива
                MAX = RandNum;
            }

        }
        System.out.println("Maximum number: " + MAX); // Выводим максимальное число случайного массива
    }
}


