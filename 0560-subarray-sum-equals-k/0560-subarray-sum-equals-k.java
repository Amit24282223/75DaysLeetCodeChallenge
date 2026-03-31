class Solution {
    public int subarraySum(int[] arr, int y) {
        List<List<Integer>> list=new ArrayList<>();
        int count=0;

        for(int i=0;i<arr.length;i++){
            int x=0;
            for(int j=i;j<arr.length;j++){
                x=x+arr[j];
                if(x==y){
                    count++;
                }
                // if(x>y){
                //     break;
                // }
                

                }
            
        }
        return count;
        
    }
}