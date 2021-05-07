public class Quick extends Sort{
    public Quick(int[] array) {
        super(array);
    }

    @Override
    void sort() {
        quick(0,array.length);
    }

    private void quick(int start, int end){

        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(start, end);
        quick(start, pivotIndex);
        quick(pivotIndex+1, end);
    }

    private int partition(int start, int end){
        int pivotNum = array[start];
        int i = start;
        int j = end;

        while(i <j){

            while(i<j && array[--j]>= pivotNum);
            if(i<j){
                array[i] = array[j];
            }

            while(i<j && array[++i]<= pivotNum);
            if(i<j){
                array[j] = array[i];
            }
        }
        array[j] = pivotNum;
        return j;
    }
}
