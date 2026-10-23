class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=binary(nums,target,false);
        arr[1]=binary(nums,target,true);
        return arr;

    }
    public int binary(int nums[],int target,boolean t){
        int start=0;
        int end=nums.length-1;
        int result=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                result=mid;
                if(t){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }
        }
        return result;
    }
}