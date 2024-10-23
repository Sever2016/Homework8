import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        double[] second = {1.57, 7.654, 9.986};
        char[] third = {'a', 'b', 'c'};
        //Задача 2
        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.println(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
        for (int i = 0; i < second.length; i++) {
            if (i == second.length - 1) {
                System.out.println(second[i]);
                break;
            }
            System.out.print(second[i] + ", ");
        }
        for (int i = 0; i < third.length; i++) {
            if (i == third.length - 1) {
                System.out.println(third[i]);
                break;
            }
            System.out.print(third[i] + ", ");
        }
        //Задача 3
        for (int i = first.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
        for (int i = second.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(second[i]);
                break;
            }
            System.out.print(second[i] + ", ");
        }
        for (int i = third.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(third[i]);
                break;
            }
            System.out.print(third[i] + ", ");
        }
        //Задача 4
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 == 1) {
                first[i]++;
            }
        }
        System.out.println(Arrays.toString(first));
    }
}