class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int comp = target-nums[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                int j = map.get(comp);
                return new int[]{i,j};
            }
        }
        return new int[0];
    }
}
