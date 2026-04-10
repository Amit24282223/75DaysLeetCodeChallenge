class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
          Set<String> st=new HashSet<>();
    int max=0;
    for(String x:wordDict){
        max=Math.max(x.length(),max);
        st.add(x);
    }
    boolean dp[]=new boolean[s.length()+1];
    dp[0]=true;
    int n=s.length();
   for(int i=1;i<=n;i++){
       for(int j=Math.max(0,i-max);j<i;j++){
           if(dp[j]&&st.contains(s.substring(j,i))){
               dp[i]=true;
               break;
           }
       }
   }
    return dp[s.length()];
    }
}