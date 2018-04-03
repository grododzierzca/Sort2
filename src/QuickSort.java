import java.util.Random;

public class QuickSort {

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int partition(int[] array, int beg, int end){
        Random rand = new Random();
        int pivotIndex = rand.nextInt(end-beg) + beg;
        swap(array, pivotIndex, end);
        int pivot = array[end];
        int i = beg - 1;
        for(int j = beg; j<end; j++){
            if(array[j] <= pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, end);
        return i+1;
    }

    private static void quickSort(int [] array, int beg, int end){
        if(beg < end){
            int pivotIndex = partition(array, beg, end);
            quickSort(array, beg, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    public static void quickSort(int [] array){
        int pivotIndex = partition(array, 0, array.length-1);
        quickSort(array, 0, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, array.length-1);
    }

}
