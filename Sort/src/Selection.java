public class Selection extends Sort{

    public Selection(int[] array) {
        super(array);
    }

    public void sort(){
        int maxIndex = 0;
        for (int j = array.length-1; j>1; j--) {
            for (int i = 1; i <j ; i++) {
                if(array[maxIndex]<array[i]){
                    maxIndex = i;
                }
            }
        }

    }

    private void swap(int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
