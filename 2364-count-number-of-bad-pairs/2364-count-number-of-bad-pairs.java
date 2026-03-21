class Solution {
    public long countBadPairs(int[] nums) {
        long count=0;
      long goodpair=0;
      long n=nums.length;
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++){
        int val=i-nums[i];
        int present=map.getOrDefault(val,0);
        goodpair+=present;
        map.put(val,map.getOrDefault(val,0)+1);

      }
    long total=n*(n-1)/2;

        return total-goodpair;
        
    }
}