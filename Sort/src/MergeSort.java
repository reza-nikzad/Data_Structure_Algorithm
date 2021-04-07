import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        split(array, 0, array.length);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    public static void split(int[] arr, int start , int end){

        if( end - start < 2 ){
            return;
        }

        int mid = (end + start)/2 ;
        split(arr, start, mid );
        split(arr, mid, end);
        merge(arr, start, mid, end); 
    }

    //20,   35, -15,  /  7, 55,   1, -22
    private static void merge(int[] arr, int start, int mid, int end) {

        //mid-1 is last element of left and mid is first element of right
        //stops us from further action
        if(arr[mid-1] <= arr[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        //33 ,35     34, 36
        while(i < mid && j < end ){
                temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        //33 , 36      34 , 35 -> 36 should be added
        System.arraycopy(arr, i, arr, start + tempIndex, mid-i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }


}
