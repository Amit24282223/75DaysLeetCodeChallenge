class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // int i=0;
        // int j=1;
        // int k=2;
        int n=nums.length;
    //     Set<List<Integer>> li=new HashSet<>();
    //    for(int i=0;i<n;i++){
    //     Set<Integer> st=new HashSet<>();
    //     for(int j=i+1;j<n;j++){
    //         int third=-1*(nums[i]+nums[j]);
    //         if(st.contains(third)){
    //             List<Integer> list=new ArrayList<>();
    //             list.add(nums[i]);
    //             list.add(nums[j]);
    //             list.add(third);
    //             Collections.sort(list);
    //             li.add(new ArrayList<>(list));
    //         }
    //         st.add(nums[j]);
    //     }
    //    }
    //    List<List<Integer>> ln=new ArrayList<>(li);
    //     return ln;
    // method 2
    Arrays.sort(nums);
    List<List<Integer>> li=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(i>0&&nums[i]==nums[i-1])  continue;
        int j=i+1;
        int k=n-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum<0){
                j++;
            }else if(sum>0){
                k--;
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                j++;
                k--;
                li.add(new ArrayList<>(list));
                while(j<k&&nums[j]==nums[j-1]){
                    j++;
                }
                while(j<k&&nums[k]==nums[k+1]){
                    k--;
                }

            }
        }
      


    }
       return li;
    }
}