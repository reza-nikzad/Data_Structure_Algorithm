public class Counting extends Sort{
    private int min;
    private int max;
    
    public Counting(int[] array, int min, int max) {
        super(array);
        this.min = min;
        this.max = max;
    }

    @Override
    void sort() {
        int[] counter = new int[max - min +1];

        for (int i = 0; i < counter.length; i++) {
            counter[array[i]-min]++;
        }

        int j = 0;

        for (int i = min; i <= max; i++) {
            while(counter[i-min]-- > 0){
                array[j++] = i;
            }
        }

    }
}
