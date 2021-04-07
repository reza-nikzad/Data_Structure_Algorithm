public class Challenge1 {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        mergeSortDescending(array, 0, array.length);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }

    }

    private static void mergeSortDescending(int[] array, int start, int end) {// 0 , 7
        if(end - start < 2){//4,5
            return;
        }

        int mid = (end+start)/2;//0,7 = 3

        mergeSortDescending(array, start, mid);// 0, 3 -> 0 , 1 -> 3, 5 -> 3, 4
        mergeSortDescending(array, mid, end); // 3 , 7 -> 5, 7 -> 6, 7
        merge(array, start, mid, end);// 0, 3 , 7
    }

    private static void merge(int[] array, int start, int mid, int end) {

        if(array[mid-1] >= array[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int[] temp = new int[end - start ];
        int tempIndex = 0;

        while( i< mid &&  j< end  ){
            temp[tempIndex++] = array[i] >= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, tempIndex+start, mid-i);
        System.arraycopy(temp, 0, array, start, tempIndex);

    }
}
