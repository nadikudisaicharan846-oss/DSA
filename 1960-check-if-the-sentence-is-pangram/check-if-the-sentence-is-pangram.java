class Solution {
    public boolean checkIfPangram(String sentence) {
        int length= sentence.length();
        if(length <26){
            return false;
        }
        int[] array =new int[26];


       for(int i = 0;i<sentence.length();i++){
        int num =  sentence.charAt(i) - 'a';
        array[num] = 1;
       }
        for(int j= 0;j<26;j++){
            if(array[j] == 0){
                return false;
            }
        }
            

         
        return true;
    }
}