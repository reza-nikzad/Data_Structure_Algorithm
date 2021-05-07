public class Insertion extends Sort{

    public Insertion(int[] array) {
        super(array);
    }

    @Override
    void sort() {
        for (int i = 1; i < array.length; i++) {
            int newElement = array[i];
            int index = i;
            for (int j = i-1; j >0 ; j--) {
                if(newElement< array[j]){
                    array[j+1]=array[j];
                    index = j;
                }
            }
            array[index] = newElement;
        }
    }

    private void swap(int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
