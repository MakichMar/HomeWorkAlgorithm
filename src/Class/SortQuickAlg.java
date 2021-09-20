package Class;

import java.util.Arrays;

public class SortQuickAlg {
    public static void QuickSort(int[] array, int Low, int Hight) {
        if (array.length == 0)
            return;

        if (Low >= Hight)
            return;

        // Select pivot element
        int middle = Low + (Hight - Low) / 2;
        int twx = array[middle];

        // Split into subarrays which is larger and smaller than the pivot
        int w = Low, J = Hight;
        while (w < J) {
            while (array[w] < twx) {
                w++;
            }
            while (array[J] > twx) {
                J--;
            }
            // Swap
            if (w <= J) {
                int temp = array[w];
                array[w] = array[J];
                array[J] = temp;
                w++;
                J--;
            }


        }
       // calling recursion to sort the left and right side
        if (Low < J)
            QuickSort(array, Low, J);

        if (Hight > w) ;
        QuickSort(array, w, Hight);
    }
        public static void main(String[] args){
            int[] x = {8, 0, 4, 7, 3, 7, 10, 12, -3};
            System.out.println("It was");
            System.out.println(Arrays.toString(x));

            int low = 0;
            int high = x.length - 1;

            QuickSort(x, low, high);
            System.out.println("Has become");
            System.out.println(Arrays.toString(x));


        }
    }
