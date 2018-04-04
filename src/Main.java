import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String [] args){
        Random rand = new Random();

        int [] tabLong = new int[10000];
        for(int i = 0; i<tabLong.length; i++){
            tabLong[i] = rand.nextInt();
        }
        int [] tabLong2 = Arrays.copyOf(tabLong, tabLong.length);

        //10000 ints
        long start1 = System.currentTimeMillis();
        HeapSort.heapSort(tabLong);
        long end1 = System.currentTimeMillis();
        System.out.println("Heapsorting (10000 ints) took "+(end1-start1)+"ms.");
        long start2 = System.currentTimeMillis();
        QuickSort.quickSort(tabLong2);
        long end2 = System.currentTimeMillis();
        System.out.println("Quicksorting (10000 ints) took "+(end2 - start2)+"ms.");

        //100 ints
        int [] tabShort = new int[100];
        for(int i = 0; i<tabShort.length; i++){
            tabShort[i] = rand.nextInt();
        }
        int [] tabShort2 = Arrays.copyOf(tabShort, tabShort.length);

        long start3 = System.nanoTime();
        HeapSort.heapSort(tabShort);
        long end3 = System.nanoTime();
        System.out.println("Heapsorting (100 ints) took "+(end3-start3)+"ns.");
        long start4 = System.nanoTime();
        QuickSort.quickSort(tabShort2);
        long end4 = System.nanoTime();
        System.out.println("Quicksorting (100 ints) took "+(end4 - start4)+"ns.");

        //Pre-sorted array (10000 ints)
        int [] tabSorted = new int[10000];
        for(int i = 10000; i<tabSorted.length; i++){
            tabSorted[i] = i;
        }

        long start5 = System.nanoTime();
        HeapSort.heapSort(tabShort);
        long end5 = System.nanoTime();
        System.out.println("Heapsorting (10000 ints, pre-sorted) took "+(end5-start5)+"ns.");
        long start6 = System.nanoTime();
        QuickSort.quickSort(tabShort2);
        long end6 = System.nanoTime();
        System.out.println("Quicksorting (10000 ints, pre-sorted) took "+(end6 - start6)+"ns.");



    }
}
