import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    int array[] = {-3, 2, 3, 10, 4};


    @Test
    public void testQuickSort() {
        QuickSort.quickSort(array);
        assertSame(-3, array[0]);
        assertSame(4, array[3]);
    }
}