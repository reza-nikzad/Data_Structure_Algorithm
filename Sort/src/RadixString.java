public class RadixString {
    int radix = (int)'z'-(int) 'a' + 1;
    int width;
    String[] array;

    public RadixString(String[] array, int width) {
        this.array = array;
        this.width = width;
    }

    void sort() {
        for (int i = width-1 ; i >=0 ; i--) {
            radixSingleSort(i);
        }
    }

    private void radixSingleSort(int position) {
        int [] countArray = new int[radix];
        for (String s : array) {
            countArray[getIndexOfChar(s,position)]++;
        }

        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i-1];
        }
        String[] temp = new String[array.length];
        for(int i = array.length-1 ; i>=0 ; i--){
            temp[--countArray[getIndexOfChar(array[i],position)]] = array[i];
        }

        for(int i = 0 ; i < array.length; i++){
            array[i] = temp[i];
        }
    }

    private int getIndexOfChar(String str, int position){
        return str.charAt(position)-'a';
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for(int i = 0; i< array.length ; i++ ){
            sb.append(array[i]);
            sb.append(", ");
        }
        sb.replace(sb.length()-2,sb.length()-1,"}");
        return sb.toString();
    }
}
