public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {-20, -10 , 1 ,7, 15, 20, 35};
      /*  System.out.println(binary(sortedArray , 1));
        System.out.println(binary(sortedArray , 15));
        System.out.println(binary(sortedArray , 12));
        System.out.println(binary(sortedArray , -20));
        System.out.println(binary(sortedArray , 35));
        System.out.println(binary(sortedArray , -15));*/
        System.out.println(binaryRecursive(sortedArray , 0,sortedArray.length, 1));
        System.out.println(binaryRecursive(sortedArray , 0,sortedArray.length, 15));
        System.out.println(binaryRecursive(sortedArray , 0,sortedArray.length, 12));
        System.out.println(binaryRecursive(sortedArray , 0,sortedArray.length, -20));
        System.out.println(binaryRecursive(sortedArray , 0,sortedArray.length, 35));
        System.out.println(binaryRecursive(sortedArray , 0,sortedArray.length, -15));


    }

    private static int binary(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while(start < end){
            int mid = (end + start)/2;
            if(value == input[mid]){
                return mid;
            }else if(input[mid] <value){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return -1;
    }

    public static int binaryRecursive(int[] input ,int start, int end , int value){
        int mid = (end + start )/2;
        if(end - start < 1){
            return -1;
        }

        if(input[mid] == value){
            return mid;
        }
        if(input[mid]< value){
            return binaryRecursive(input, mid+1 , end , value);
        }else{
            return binaryRecursive(input, start, mid, value);
        }
    }
}
