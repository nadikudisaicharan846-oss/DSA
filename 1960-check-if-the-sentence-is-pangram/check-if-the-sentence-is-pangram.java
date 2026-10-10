class Solution {
    public boolean checkIfPangram(String sentence) {
        int length= sentence.length();
        if(length <26){
            return false;
        }

       for(int i = 0;i<26;i++){
        char alpha =  (char)('a'+i);
        boolean check =  false;
        for(int j= 0;j<length;j++){
            if(alpha== sentence.charAt(j)){
                check = true;
                  break;
            }
        }
            if(!check){
                return false;
            }

        }  
        return true;
    }
}