public class HeapSort {


    public static void heapify(int [] array, int root, int size){

        int largest = root;                      //     i
        int lchild = root + 1;                  //     / \
        int rchild = root + 2;                 //     l   r

        if(lchild < size && array[lchild]>array[largest]){
            largest = lchild;
        }
        if(rchild < size && array[rchild]>array[largest]){
            largest = rchild;
        }
        if(largest != root){
            int temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;
            heapify(array, largest, size);
        }
    }

    public static void heapSort(int [] array){
        int size = array.length;
        for(int i = size; i>=0; i--){
            heapify(array, i, size);
        }

        for(int i = size-1; i>=0; i--){
            int temp = array[0];
            array[0] = array [i];
            array[i] = temp;
            heapify(array, 0, i);
        }
    }




}
