public class Sort {
    public static void main(String[] args) {
        int[] array = {25,16,-10,10,5, 50, 10,-60};

//        array = bubbleSort(array);
//        array = selectionSort(array);
        array = shellSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }
    }


    /**
     * Shell sort
     * Unstable, in-place, almost quadratic
     * @param arr : array
     * @return : sorted array from min to max
     */
    public static int[] shellSort(int[] arr){
        for (int gap = arr.length/2 ; gap > 0 ; gap/=2) {
            for (int i = gap; i < arr.length ; i++) {
                int newItem = i;
                while(newItem-gap>=0 && arr[newItem] < arr[newItem-gap] ){
                    swap(arr, newItem-gap , newItem);
                    newItem = newItem - gap;
                }
            }
        }
        return arr;
    }
    public static void shellSortInCourse(int[] arr){

        for ( int gap = arr.length/2 ; gap > 0 ; gap/=2) {
            int newElement;
            int newIndex;
            for (int i = gap ; i < arr.length ; i++) {
                newIndex = i;
                newElement = arr[i];
                while(newIndex-gap>=0 && arr[newIndex-gap] > newElement ){
                    arr[newIndex] = arr[newIndex-gap];
                    newIndex=newIndex-gap;
                }
                arr[newIndex] = newElement;
            }

        }
    }

    /**
     * Selection sort
     * stable, in-place, quadratic
     * @param arr : array
     * @return : sorted array from min to max
     */
    public static int[] selectionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j-1]>arr[j]){
                    swap(arr, j, j-1);
                }
            }
        }

        return arr;
    }

    /**
     * Bubble sort
     * stable, in-place, quadratic
     * @param arr : array
     * @return : sorted array from min to max
     */
    public static int[] bubbleSort(int[] arr){
        for(int i = arr.length-1; i>0 ; i--){
            for(int j = 0; j < i ; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j, j+1 );
                }
            }
        }
        return arr;
    }

    public  static void swap(int[] arr , int i , int j){
        if(i == j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
