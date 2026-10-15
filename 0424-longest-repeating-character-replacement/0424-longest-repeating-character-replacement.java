class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hp=new HashMap<>();
        int i=0;
        int j=0;
        int maxlen=0;
        int max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            hp.put(ch,hp.getOrDefault(ch,0)+1);
            // while(j-i-max+1>k){
            //     char t=s.charAt(i);
            //     hp.put(t,hp.get(t)-1);
            //     if(hp.get(t)==0){
            //         hp.remove(t);
            //     }
            //     i++;
            // }
            for(char che:hp.keySet()){
                int x=hp.get(che);
                max=Math.max(x,max);
                // i++;
            }
            if(j-i-max+1<=k){
                maxlen=Math.max(maxlen,j-i+1);

            }
             while(j-i-max+1>k){
                char t=s.charAt(i);
                hp.put(t,hp.get(t)-1);
                if(hp.get(t)==0){
                    hp.remove(t);
                }
                i++;
            }
            j++;
        }
        return maxlen;
        
    }
}