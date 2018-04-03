import static org.junit.Assert.*;

public class HeapSortTest {

    int[] array = {-3, 2, 10, 33, 0, 10};
    int[] heap = {3, 10, 2};

    @org.junit.Test
    public void testHeapify() {
        HeapSort.heapify(heap, 0, 3);
        assertSame(10, heap[0]);   //   10
        assertSame(3, heap[1]);   //   /  \
        assertSame(2, heap[2]);  //   3    2
    }

    @org.junit.Test
    public void testHeapSort() {
        HeapSort.heapSort(array);
        assertSame(-3, array[0]);
        assertSame(33, array[5]);
        assertSame(2, array[2]);
    }
}