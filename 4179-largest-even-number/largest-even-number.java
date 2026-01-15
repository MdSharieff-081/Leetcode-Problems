class Solution {
    public String largestEven(String s) {
        StringBuilder sb=new StringBuilder(s);

        
        // if(sb.length()==1){
        //     if(sb.charAt(0)=='1'){
        //         return "";
        //    }
        //    else{
        //     return sb.toString();
        //    }
        // }
        int n=sb.length()-1;
        for(int i=n;i>=0;i--){
            if(sb.charAt(i)=='2'){
                return sb.substring(0,i+1);
            }
            // else{
            //     //return sb.toString();
            // }
        }
        return "";
    }
}