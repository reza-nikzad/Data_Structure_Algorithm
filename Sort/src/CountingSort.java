public class CountingSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
        countingSort(array, 1 , 10);

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+",");
        }
    }

    /**
     *
     * @param array
     * @param min : min value in array
     * @param max : max value in array
     */
    private static void countingSort(int[] array, int min, int max) {
        int[] counter = new int[max - min + 1];

        for (int i = 0; i < array.length ; i++) {
            counter[array[i] - min]++;
        }

        int j = 0;
        for (int i = min ; i <= max ; i++) {
            while(counter[i-min]>0){
                array[j++] = i ;
                counter[i-min]--;
            }
        }
    }
}
