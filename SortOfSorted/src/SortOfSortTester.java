import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {

    @Test
    /*
    First test case will be a simple test to make sure the method functions correctly.
     */
    public void sortOfSortTest1() {

        int[] A = {56, 3, 10, 32, 5, 24, 3, 10, 0, 14};

        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);

        int[] sorted = {24, 14, 5, 3, 0, 3, 10, 10, 32, 56};

        assertArrayEquals(sorted, A);
    }

    @Test
    /*
    Second test case will test how the method handles negative numbers within the array. Negative numbers should
    be sorted in the middle of the array when the rest of the numbers are positive.
     */
    public void sortOfSortTest2() {

        int[] A = {2, 7, 12, -5, 8, -16, 9, 4, 1};

        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);

        int[] sorted = {8, 7, 1, -5, -16, 2, 4, 9, 12};

        assertArrayEquals(sorted, A);
    }

    @Test
    /*
    Third test case will test how the method handles all negative numbers in the array. Numbers further from 0 should
    be sorted towards he middle of the array while numbers closer to 0 should be closer to the edges.
     */
    public void sortOfSortTest3() {

        int[] A = {-6, -9, -3, -23, -15, -7, -20, -8, -19, -1};

        SortOfSort test = new SortOfSort();
        SortOfSort.sortOfSort(A);

        int[] sorted = {-6, -7, -15, -19, -23, -20, -9, -8, -3, -1};

        assertArrayEquals(sorted, A);
    }

    @Test
    /*
    Fourth test case will test how the method handles an array with a large amount of elements of varying value.
     */
    public void sortOfSortTest4() {

        int[] A = {7, -1, 0, 4, -14, -8, 10, 21, 1, -21, 56, 8, 9, 15, -98, -43, 54, 11, -2, 20};

        SortOfSort test = new SortOfSort();
        SortOfSort.sortOfSort(A);

        int[] sorted = {21, 20, 10, 9, 4, 1, -2, -8, -43, -98, -21, -14, -1, 0, 7, 8, 11, 15, 54, 56};

        assertArrayEquals(sorted, A);
    }

    @Test
    /*
    Fifth test case will test how the method handles a method with duplicates in it. Duplicate numbers should be sorted
    together and
     */
    public void sortOfSortTest5() {

        int[] A = {7, -1, 0, 6, -1, 75, 7, 32, 7, -21, 0, 8};

        SortOfSort test = new SortOfSort();
        SortOfSort.sortOfSort(A);

        int[] sorted = {8, 7, 6, 0, -1, -21, -1, 0, 7, 7, 32, 75};

        assertArrayEquals(sorted, A);
    }
}
