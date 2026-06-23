class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] original = nums.clone();
        Arrays.sort(nums);
        int i=0;
        int j= nums.length-1;
        while(i<j){
            int result = nums[i] + nums[j];

            if(result < target){
                ++i;
            }else if(result > target){
                --j;
            }else{
                break;
            }
        }
        int idx1 = -1, idx2 = -1;
        for (int k = 0; k < original.length; k++) {
            if (original[k] == nums[i] && idx1 == -1) idx1 = k;
            else if (original[k] == nums[j]) idx2 = k;
        }
        return new int[]{Math.min(idx1, idx2), Math.max(idx1, idx2)};
    }
}
