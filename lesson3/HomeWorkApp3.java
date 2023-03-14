package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask(7, 8);

    }

    private static void firstTask() {

        int[] array = {0, 1, 0, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < array.length; i++) {
            int a = 0;
            if (array[i] == a) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void secondTask() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void thirdTask() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fourthTask() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, x = array.length; j < array.length; j++, x--) {
                if (i == j || i == x - 1) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fifthTask(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }
}


