class Solution {
    public int numberOfSubstrings(String s) {

        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     Set<Character> ch=new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         ch.add(s.charAt(j));
        //         if(ch.size()==3){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        int count=0;
        int x=-1;
        int y=-1;
        int z=-1;
        Set<Character> sh=new HashSet<>();
        for(int i=0;i<s.length();i++){
            sh.add(s.charAt(i));
            if(s.charAt(i)=='a'){
                x=i;
            }else if(s.charAt(i)=='b'){
                y=i;
            }else if(s.charAt(i)=='c'){
                z=i;
            }
            int min=0;
            if(sh.size()==3){
                min=Math.min(x,Math.min(y,z));
                count+=min+1;
            }
            

        }
        return count;
        
    }
}