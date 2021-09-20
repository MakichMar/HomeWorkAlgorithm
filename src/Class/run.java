package Class;

import java.util.Arrays;

public class run {
    public static void main(String[] args) {
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        System.out.println("Skzbnakan tesq  " + Arrays.toString(mas));
        Arrays.sort(mas);

        System.out.println("Verjnakan tesq " + Arrays.toString(mas));

    }
}
