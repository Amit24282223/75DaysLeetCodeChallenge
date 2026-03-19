class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
           boolean check[][]=new boolean[n][m];
           int count=0;
           Queue<int[]> q=new LinkedList<>();
           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    count++;
                }
                
            }

           }
           if(count==0){
            return 0;
           }
           int der[][]={{-1,0},{0,-1},{1,0},{0,1}};
        int x=0;
           while(!q.isEmpty()){
              int ct=count;
            int y=q.size();
            for(int i=0;i<y;i++){ 
            int []curr=q.poll();
            for(int [] arr:der){
                int r=curr[0]+arr[0];
                int c=curr[1]+arr[1];
                if(r>=0&&c>=0&&r<n&&c<m&&grid[r][c]==1){
                    grid[r][c]=2;
                    count--;
                    q.add(new int[]{r,c});
                
                }
            }
           }
           if(ct>count){
            x++;
           }
           }
           if(count==0){ 
           return x;
           }else{
            return -1;
           }
    }
   
}