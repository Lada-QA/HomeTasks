package HTack_lection4;

/**
 * Создать массив, заполнить его случайными элементами, распечатать, перевернуть,
 * и снова распечатать (при переворачивании не создавать новый массив)
 */
class InvertedArray {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 16, -1205, 653, 9, 37, 55, 46, 22}; // Инициализируем массив
        for (int i = 0; i < numbers.length; i++) { //Задаем цикл массива, массив читается слева на право
            if (i == 0) System.out.print("[ ");
            System.out.print(numbers[i] + " ");
            if (i == 9) System.out.println("]");
        } // Выводим массив в его оригинальной записи с квадратными скобками и пробелом
        System.out.println("Inverted array: ");

        for (int i = numbers.length - 1; i >= 0; i--) { //Переворачиваем исходный массив, теперь массив читается с право на лево
            if (i == 9) System.out.print("[ ");
            System.out.print(numbers[i] + " ");
            if (i == 0) System.out.println("]");
        } // Выводим оригинальный массив в перевернутом состоянии с квадратными скобками и пробелом
    }
}
