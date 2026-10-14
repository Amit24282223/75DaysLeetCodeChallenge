class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[0];
        }else{
            long x=num/3;
            long arr[]=new long[3];
            arr[0]=x-1;
            arr[1]=x;
            arr[2]=x+1;
            return arr;
        }

        
    }
}