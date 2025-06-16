class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //use Hashset to store elements of nums1
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        //use another Hashset to store the intersection
        Set<Integer> resultSet = new HashSet<>();
        for(int num:nums2){
            if(set1.contains(num)){
                resultSet.add(num);//Ensure uniqueness
            }
        }
    //Convert the resultset to an array
        int[] result=new int[resultSet.size()];
        int index=0;
        for(int num:resultSet){
            result[index++]=num;
        }
      
    return result;    
    }
}