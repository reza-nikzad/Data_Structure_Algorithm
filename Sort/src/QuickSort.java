public class QuickSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        quickSort(array, 0, array.length);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if(end - start < 2 ){
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;

        while( i < j ){

            while( i < j && array[--j] >= pivot ); //empty while, just to decrement j
            if( i < j ){
                array[i] = array[j];
            }
            while (i < j && array[++i] <= pivot);//empty while
            if(( i < j)){
                array[j] = array[i];
            }

        }
        array[j] = pivot;
        return j;
    }
}
