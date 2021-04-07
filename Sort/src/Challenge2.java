public class Challenge2 {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        recursiveInsertion(array, array.length);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    private static void recursiveInsertion(int[] array, int next) {
        if( next < 2 ){
            return;
        }

        recursiveInsertion(array, next-1);
        int newElement = array[next-1];
        int i ;
        for(i = next -1 ; i>0 && array[i-1] > newElement; i-- ){
            array[i] = array[i-1] ;
        }
        array[i] = newElement;
    }


}
