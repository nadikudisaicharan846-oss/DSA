class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i--){
            int sum = digits[i]+ 1;
            if(sum<= 9){
                digits[i] = sum;
                return digits;
            }
            digits[i] = 0;
        }
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;

        
        
    }
}