public class RecursiveInsertion extends Sort{

    public RecursiveInsertion(int[] array) {
        super(array);
    }

    @Override
    void sort() {
        insertion(array.length);
    }

    private void insertion(int end){

        if(end < 2){
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
        int i = end;
        while(i > 0 && temp < array[i-1]){
            array[i] = array[i-1];
            i--;
        }
        array[i] = temp;
    }
}
