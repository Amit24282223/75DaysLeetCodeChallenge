class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int i=0;
    int j=numbers.length-1;
    while(i<j){
        int sum=numbers[i]+numbers[j];
        if(sum==target){
            return new int[]{i+1,j+1};

        }else if(sum<target){
            i++;
        }else{
            j--;
        }

    }
        // for(int i=0;i<numbers.length;i++){
        //     int a=numbers[i];
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(target-a<numbers[j]){
        //             break;
        //         }
        //         if(target-a==numbers[j]){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        return new int[]{-1,-1};
        
    }
}