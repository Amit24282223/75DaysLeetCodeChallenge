class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int maxlen=0;
        int z=0;
        while(j<nums.length){
            if(nums[j]==0){
                z++;
            }
            while(z>k){
                if(nums[i]==0){
                    z--;
                }
                i++;
            }
            if(z<=k){
                maxlen=Math.max(maxlen,j-i+1);
            }
            j++;
        }
        return maxlen;
        
    }
}