public class Merge extends Sort{

    public Merge(int[] array) {
        super(array);
    }

    @Override
    void sort() {
        split(0,array.length);
    }

    private void split(int start,int end){
        if(end-start<2){
            return;
        }

        int mid = (end+start)/2;
        split(start, mid);
        split(mid, end);

        merge(start, mid, end);
    }

    private void merge(int start, int mid, int end){
        if(array[mid-1]<=array[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end-start];
        while(i<mid && j<end){
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        //{1 4} {2 3}
        System.arraycopy(array, i, array, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, array,start , tempIndex);
    }
}
