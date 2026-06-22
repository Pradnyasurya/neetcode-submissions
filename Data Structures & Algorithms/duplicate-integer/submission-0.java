class Solution {
    public boolean hasDuplicate(int[] nums) {
        //1, 2, 3, 1
        Set <Integer> seen = new HashSet<>();
        for (Integer num : nums) {
            if (seen.contains(num)) {
                return true;          
            }
            seen.add(num);            
        }
        return false;
    }
}