class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);//1)sort the arrays
        for(int i=0;i<nums.length;i+=2)
        {
           sum+=nums[i];//2)sum the array
        }
    return sum; //3)return

        
    }
}