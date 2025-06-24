class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
            nums[left]=nums[left]*nums[left]; 
            res[i]=nums[left];
            left++;
            }
            else
            {
             nums[right]=nums[right]*nums[right];
            res[i]=nums[right];
             right--;
            }
        }
    return res;  
    }
}