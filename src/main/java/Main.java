// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.Random;
import java.lang.String;
import java.lang.Short;

public class Main {
    public static void main(String[] args) {

        // Первое задание
        int i = methodRandom();
        System.out.print("1. Случайное число от 0 до 2000 > ");
        System.out.print(i);
        System.out.println();

        // Второе задание
        int n = high_bit_line(i);
        System.out.print("2. Номер старшего значащего бита выпавшего числа > ");
        System.out.print(n);
        System.out.println();

        // Третье задание
        int[] m1 = multiplicity1(i, n);
        System.out.print("3. Все кратные n числа в диапазоне от i до Short.MAX_VALUE, массив m1: ");
        for (int v : m1)
            System.out.print(v);
        System.out.println();

        // Четвертое задание
        int[] m2 = multiplicity2(i, n);
        System.out.print("4. Все некратные n числа в диапазоне от Short.MIN_VALUE до i, массив m2: ");
        for (int v2 : m2)
            System.out.print(v2);
        System.out.println();
    }

    public static int methodRandom() {
        return new Random().nextInt(0, 2000);
    }

    public static int high_bit_line(int i) {
        int res = 0;
        while (i != 1) {
            i >>= 1;
            res++;
        }
        return res;
    }

    public static int[] multiplicity1(int i, int n) {
        int[] m = new int[Short.MAX_VALUE];
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m[j] = j;
            }
        }
        return m;
    }

    public static int[] multiplicity2(int i, int n) {
        int[] m2 = new int[Short.MAX_VALUE];
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n == 1) {
                m2[j] = j;
            }
        }
        return m2;
    }
}
