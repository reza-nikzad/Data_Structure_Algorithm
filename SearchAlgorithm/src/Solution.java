class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{2,2,3,0};
        int num =8;
        int[] result = twoSum(arr, num);
        System.out.println("["+result[0]+","+result[1]+"]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int j = 0;
        int[] result = new int[2];
        for(int i = 0; i< nums.length-1; i++){
            j = i+1 ;
            while(nums[i] <= target && j< nums.length){
                if((nums[i]+nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                j++;
            }
        }
        throw new IndexOutOfBoundsException(" No num matches");
    }

}