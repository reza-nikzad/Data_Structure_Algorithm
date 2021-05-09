public class DescendingMerge extends Sort{

    public DescendingMerge(int[] array) {
        super(array);
    }

    @Override
    void sort() {
        split(0,array.length);
    }

    private void split(int start, int end){
        if(end - start < 2){
            return;
        }

        int mid = (end+start)/2;
        split(start, mid);
        split(mid, end);
        merge(start, mid, end);
    }

    private void merge(int start,  int mid ,int end){
        if(array[mid-1]> array[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int temp[] = new int[end-start];
        int tempIndex = 0;

        while(i < mid && j < end ){
            temp[tempIndex++] = array[i] >= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
