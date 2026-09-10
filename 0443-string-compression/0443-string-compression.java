class Solution {
    public int compress(char[] chars) {
        char arr[]=new char[chars.length];
        int t=0;
        for(int i=0;i<chars.length;i++){
            int  j=i+1;
            int count=0;
            while(j<chars.length&&chars[i]==chars[j]){
                count++;
                j++;
            }
            arr[t++]=chars[i];
            if(count>0){
                String s=String.valueOf(count+1);
                for(int r=0;r<s.length();r++){
                    arr[t++]=s.charAt(r);
                }
            }
            i=j-1;
        }
        for(int i=0;i<t;i++){
            chars[i]=arr[i];
        }
        return t;

















//         HashMap<Character,Integer> hp=new HashMap<>();
//         if(chars.length<=1){
//             return chars.length;
//         }
//         for(int i=0;i<chars.length;i++){
//             hp.put(chars[i],hp.getOrDefault(chars[i],0)+1);
//         }
//         // String s="";
//         int x=0;
//         List<Character> list=new ArrayList<>();
//         int t=0;
//        for(Map.Entry<Character,Integer> entry:hp.entrySet()){
//         // list.add(entry.getKey());
//         chars[t++]=entry.getKey();
//         int fre=entry.getValue();
//         if(fre>1){
//             String s=String.valueOf(fre);
//             for(int i=0;i<s.length();i++){
//                 chars[t++]=s.charAt(i);
//             }
//         }

//     //    list.add((char)(entry.getValue()+'0'));
//        }
//     //    int t=0;
//     //    for(int i=0;i<list.size();i++){
//     //     chars[t++]=list.get(i);
//     //    }



// return t;

        
    }
}