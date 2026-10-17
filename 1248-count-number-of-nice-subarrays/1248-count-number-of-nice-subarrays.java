class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int nums[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                nums[i]=1;
            }else{
                nums[i]=0;
            }
            
        }

    return fun(nums,k)-fun(nums,k-1);

        
    }
    public int fun(int arr[],int k){
        int i=0;
        int j=0;
        int count=0;
        int n=arr.length;
        int sum=0;
        while(j<n){
            sum+=arr[j];
            while(sum>k){
                sum-=arr[i];
                i++;
            }
            if(sum<=k){ 
            count+=j-i+1;
            }
            j++;

        }
        return count;
    }
}