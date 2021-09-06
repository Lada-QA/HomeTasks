package HTack_lection4;

/** Создать двухмерный квадратный массив и заполнить его бабочкой
 *  (т.е. таким образом:
 *      1  1  1  1  1
 *      0  1  1  1  0
 *      0  0  1  0  0
 *      0  1  1  1  0
 *      1  1  1  1  1)
 **/
public class Butterfly {
    public static void main(String[] args) {
        int[][] twoArr = {{1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};
        //Инициализирую двухмерный массив
        for (int iString = 0; iString < 5; iString++) {
            //Задаю цикл для прохождения по индексу строк
            for (int iColumn = 0; iColumn < 5; iColumn++) {
                //Задаю цикл для прохождения по индексу столбцов
                System.out.print(" " + twoArr[iString][iColumn] + " ");
                // Добавляю пробелы для красивого вывода массива
            }
            System.out.println();
            //Сохраняю масив в виде матрицы
        }
    }
}
