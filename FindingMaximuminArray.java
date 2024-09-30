public class MaximumNumberInArray {
    public static void main(String[] args){


        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int max=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("max number in array is: "+max);
    }
}
