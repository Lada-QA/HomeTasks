package HTack_lection5;

import java.util.Random;
import java.util.Scanner;

public class HeardComputer {
    public static void main(String[] args) {
        int randomNumber, enteredNumber;
        int count = 1;

        Computer olderComputer = new Computer(true, true, true, 6);
        System.out.println(olderComputer.toString());
        System.out.println("Угадайте и введите задуманное число: 0 либо 1");
        Random generator = new Random();
        randomNumber = generator.nextInt(2);
        Scanner number = new Scanner(System.in);
        enteredNumber = number.nextInt();
        while (enteredNumber != randomNumber) {
            if (count <= 5) {
                if (enteredNumber > randomNumber || enteredNumber < randomNumber)
                    System.out.println("Ваш компьютер сгорел");
                System.out.println("Попробуйте снова");
                enteredNumber = number.nextInt();
                               if (enteredNumber == randomNumber)
                    System.out.println("Ваш компьютер включен");
            } else {
                System.out.println("Вы превысили счётчик");
                break;
            }
            count++;
        }
    }
}


