class Solution {
    public int maxScore(int[] arr, int k) {
        int maxlen=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            maxlen=Math.max(maxlen,sum);
        }
        int h=arr.length-1;
        for(int i=k-1;i>=0;i--){
            sum-=arr[i];
            sum+=arr[h];
            h--;
            maxlen=Math.max(maxlen,sum);
        }
        return maxlen;

        
    }
}