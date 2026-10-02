class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,Integer> hp=new HashMap<>();
        // List<List<String>> list=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
          String x=strs[i];
          char arr[]=x.toCharArray();
          Arrays.sort(arr);
          String f=new String(arr);
          if(hp.containsKey(f)){
            int r=hp.get(f);
            list.get(r-1).add(x);

          }else{
            List<String> li=new ArrayList<>();
            li.add(x);
            hp.put(f,hp.size()+1);
            list.add(li);
          }
        }
        list.sort(Comparator.comparingInt(List::size));
        return list;

        
        
    }
}