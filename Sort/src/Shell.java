public class Shell extends Sort {

    public Shell(int[] array) {
        super(array);
    }

    @Override
    void sort() {
//        int n = 2;
        for (int gap = array.length/2; gap > 0 ; gap/=2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while(j >= gap && array[j-gap] > newElement){
                    array[j] = array[j-gap];
                    j = j-gap;
                }
                array[j] = newElement;
            }
        }

    }

    void sort(int n) {
        for (int gap = array.length/n; gap > 0 ; gap/=n) {
            for (int i = gap; i <array.length ; i++) {
                int newElement = array[i];
                int j = i;
                while(j >= gap && array[j-gap] > newElement){
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j] = newElement;
            }
        }

    }


}
