class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        comb(target,arr,0,li,list);
        
        return list;

        
    }
    public void comb(int target,int []arr,int start,List<Integer> li,List<List<Integer>>  list){
        if(target==0){
         list.add(new ArrayList<>(li));// importen consept
        // list.add(li); Problem 2: list.add(li); (reference issue)

// li ek hi list hai jo recursion me baar-baar change ho rahi hai.
// Agar tum directly list.add(li) karoge to:
            return;
        }
        if(start>=arr.length){
            return;
        }
        if(target<0){
            return;
        }
       li.add(arr[start]);
       comb(target-arr[start],arr,start,li,list);
       li.remove(li.size()-1);
       comb(target,arr,start+1,li,list);
    }
}