class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       
         int n=rooms.size();
         boolean visited[]=new boolean[n];
         Queue<Integer> q=new LinkedList<>();
         q.add(0);
         visited[0]=true;
         while(!q.isEmpty()){
            int front=q.remove();
            for(int i:rooms.get(front)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
         }
         for(int i=0;i<n;i++){
            if(!visited[i]){
                return false;
            }
         }
         return true;
    }
}