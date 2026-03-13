class Solution {
    public boolean containsDuplicate(int[] nums) {
        //using hashset

        Set<Integer> seen = new HashSet<>();
        for ( int n : nums){
            if (seen.contains(n)){
                return true;
            }else{
                seen.add(n);
            }
            

        }
        return false;
        
        
        // Arrays.sort(nums);
        // for ( int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //        return true;
        //     }
        // }
        // return false;
    }
}