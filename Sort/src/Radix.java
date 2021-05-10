public class Radix extends Sort {
    int radix;
    int width;

    public Radix(int[] array, int radix, int width) {
        super(array);
        this.radix = radix;
        this.width = width;
    }

    @Override
    void sort() {
        doSort();
    }

    private void doSort() {
        for (int i = 0; i < width; i++) {
            radixSingleSort(i);
        }
    }

    private void radixSingleSort(int position) {

        int[] countArray = new int[radix];
        for (int value :  array) {
            countArray[getDigit(value, position)]++;
        }

        for (int i = 1; i < radix; i++) {
            countArray[i]+=countArray[i-1];
        }

        int[] temp = new int[array.length];

        for (int i = array.length-1; i >= 0 ; i--) {
            temp[--countArray[getDigit(array[i],position)]] = array[i];
        }

        System.arraycopy(temp,0,array,0,array.length);
    }

    private int getDigit(int numItem, int position){
        return numItem / (int) Math.pow(radix, position) % radix ;
    }

}
