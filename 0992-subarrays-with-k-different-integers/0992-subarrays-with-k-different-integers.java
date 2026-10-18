class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // int count=0;
         return fun(nums,k)-fun(nums,k-1);

        
    }
    public int fun(int arr[],int k){
        if(k<=0){
            return 0;
        }
        int i=0;
        int j=0;
        int count=0;
        int n=arr.length;

        int sum=0;
        HashMap<Integer,Integer> hp=new HashMap<>();
       while(j<n){
        int x=arr[j];
        hp.put(arr[j],hp.getOrDefault(arr[j],0)+1);
        while(hp.size()>k){
            hp.put(arr[i],hp.get(arr[i])-1);
            if(hp.get(arr[i])==0){
                hp.remove(arr[i]);
            }
            i++;
        }if(hp.size()<=k){ 
        count+=j-i+1;
        }
        j++;
       }
        return count;
        
    }
}