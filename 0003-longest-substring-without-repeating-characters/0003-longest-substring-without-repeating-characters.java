class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0,l=0;
        int maxlen=0;
        HashMap<Character,Integer> hp=new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            if(hp.containsKey(ch)){ 
            if(hp.get(ch)>=l){
                l=hp.get(ch)+1;
            }
            }
            hp.put(ch,r);
            maxlen=Math.max(maxlen,r-l+1);
            r++;

        }
        return maxlen;
    
     
       
}
}