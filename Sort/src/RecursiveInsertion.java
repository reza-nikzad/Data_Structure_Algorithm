public class RecursiveInsertion extends Sort{

    public RecursiveInsertion(int[] array) {
        super(array);
    }

    @Override
    void sort() {
        insertion(array.length);
    }

    private void insertion(int end){

        if(end > 0){
            return;
        }
        insertion(--end);
        sortPartition(end);
    }

    private void sortPartition(int end){
        if(array[end]> array[end-1]){
            return;
        }
        int temp = array[end];
        while(temp < array[--end]){
            array[end+1] = array[end];
        }
        array[end] = temp;
    }
}
