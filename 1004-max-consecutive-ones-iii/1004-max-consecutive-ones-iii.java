class Solution {
    public int longestOnes(int[] arr, int k) {
        int maxlen=0;
        int l=0;
        int r=0;
        int h=0;
        while(r<arr.length){
            if(arr[r]==0){
                h++;
            }
            while(h>k){
                if(arr[l]==0){
                    h--;
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;


        }
        return maxlen;
        
    }
}