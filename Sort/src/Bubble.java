import java.util.Arrays;

public class Bubble extends Sort{

    public Bubble(int[] array) {
        super(array);
    }

    public void sort(){
        int j = array.length-1;
        while(--j>0){
            for(int i = 0; i<j-1; i++){
                if(array[i] > array[i + 1]){
                    swap(i,i+1);
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
