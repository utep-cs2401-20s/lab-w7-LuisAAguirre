public class SortOfSort {

    public static void sortOfSort(int[] array) {
        int n = array.length;       // n will help for loops don't check elements that have already been sorted
        int count = 0;              // count will help for loops don't check elements that have already been sorted

        while(n >= count + 2) {     // Limit should ensure method does not go out of bounds

            /*
             Finds highest number and sorts it to the right end of the array while ignoring numbers that
             have already been sorted.
             */
            for (int i = n - 1; i >= n - 3; i--) {
                int maxIndex = i;
                for (int j = i - 1; j >= count; j--) {
                    if (array[j] > array[maxIndex]) {
                        maxIndex = j;
                    }
                }
                int temp = array[maxIndex];
                array[maxIndex] = array[i];
                array[i] = temp;
            }

            n -= 2;

            /*
             Finds highest number and sorts it to the left end of the array while ignoring numbers that
             have already been sorted.
             */
            for (int i = count; i < 2 + count; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (array[j] > array[maxIndex]) {
                        maxIndex = j;
                    }
                }
                int temp = array[maxIndex];
                array[maxIndex] = array[i];
                array[i] = temp;
            }

            count += 2;
        }
    }
}

