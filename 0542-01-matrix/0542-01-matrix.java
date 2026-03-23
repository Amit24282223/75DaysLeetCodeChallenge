class Solution {
    public int[][] updateMatrix(int[][] arr) {
        Queue<int[]> q=new LinkedList<>();
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==0){
                q.add(new int[]{i,j});
            }
        }
    }
    int ans[][]=new int[arr.length][arr[0].length];
    int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
    while(!q.isEmpty()){
        int []curr=q.poll();
        for(int d[]:dir){
            int row=d[0]+curr[0];
            int col=d[1]+curr[1];
            if(row>=0&&col>=0&&row<arr.length&&col<arr[0].length&&arr[row][col]==1&&ans[row][col]==0){
                ans[row][col]=ans[curr[0]][curr[1]]+1;
                q.add(new int[]{row,col});
            }
        }
        
    }
    return ans;
}
}