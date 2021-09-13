package HTack_lection5;

/**
         Создать класс компьютер.
         Поля:
    -процессор Boolean
    -оперативка Boolean
    -жесткий диск Boolean
    -ресурс полных циклов работы (включений/выключений) int.
        Методы:
     -метод описание(вывод всех полей)
     -метод включить, при включении может произойти сбой, при вызове метода
    рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
    угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
    включить нужно выдать сообщение что ему конец
    -включить(аналогично включению)
    -при превышении лимита ресурса комп сгорает
 */
public class Computer {
    boolean processor;
    boolean ram;
    boolean hardDrive;
    int recourse;
    boolean isOn;

    public Computer(boolean processor, boolean ram, boolean hardDrive, int recourse) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.recourse = recourse;
    }

    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hardDrive=" + hardDrive +
                ", recourse=" + recourse +
                '}';
    }
}

