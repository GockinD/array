import java.lang.module.FindException;
import java.net.BindException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbers1 = {1.57, 7.654, 9.986};
        int[] numbers2 = {10, 20, 30, 40, 50};

        System.out.println();
        System.out.println("Задача 2");
        for (int index = 0; index < numbers.length; index++) {
            if (index == numbers.length - 1) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");
        }
        for (int index = 0; index < numbers1.length; index++) {
            if (index == numbers1.length - 1) {
                System.out.println(numbers1[index]);
                break;
            }
            System.out.print(numbers1[index] + ", ");
        }
        for (int index = 0; index < numbers2.length; index++) {
            if (index == numbers2.length - 1) {
                System.out.println(numbers2[index]);
                break;
            }
            System.out.print(numbers2[index] + ", ");
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int index = numbers.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");
        }
        for (int index = numbers1.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(numbers1[index]);
                break;
            }
            System.out.print(numbers1[index] + ", ");
        }
        for (int index = numbers2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(numbers2[index]);
                break;
            }
            System.out.print(numbers2[index] + ", ");
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 != 0) {
                numbers[index] = numbers[index] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}