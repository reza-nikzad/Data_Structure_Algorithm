public class Practice {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        shellSortInCourse(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }
    }
    public static void shellSortInCourse(int[] arr){

        for ( int gap = arr.length/2 ; gap > 0 ; gap/=2) {
            int newElement;
            int newIndex;
            for (int i = gap ; i < arr.length ; i++) {
                newIndex = i;
                newElement = arr[i];
                while(newIndex-gap>=0 && arr[newIndex-gap] > newElement ){
                    arr[newIndex] = arr[newIndex-gap];
                    newIndex=newIndex-gap;
                }
                arr[newIndex] = newElement;
            }

        }
    }

}
