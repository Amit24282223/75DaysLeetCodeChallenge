class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list =new ArrayList<>();
        int n=arr.length;
        int m=arr[0].length;
        int t=n;
        int p=m;
        int x=0;
        int y=0;
        int temp[][]=new int[n][m];
        while(list.size()<=t*p&&n>=0&&m>=0){
            
            for(int i=x;i<m;i++){
                if(temp[y][i]==0){
                list.add(arr[y][i]);
                temp[y][i]=1;
                }
            }
            if(list.size()>=t*p){
                break;
            }
            for(int j=y+1;j<n;j++){
                          if(temp[j][m-1]==0){
                list.add(arr[j][m-1]);
                temp[j][m-1]=1;
                          }
            }
            if(list.size()>=t*p){
                break;
            }
            for(int i=m-1-1;i>=0;i--){
                  if(temp[n-1][i]==0){
                list.add(arr[n-1][i]);
                temp[n-1][i]=1;
                  }
            }
             if(list.size()>=t*p){
                break;
            }
            for(int i=n-1-1;i>=x+1;i--){
                  if(temp[i][x]==0){
                list.add(arr[i][x]);
                temp[i][x]=1;
                  }
            }
             if(list.size()>=t*p){
                break;
            }
            x++;
            y++;
            n--;
            m--;

        }
        return list;
        
        
    }
}