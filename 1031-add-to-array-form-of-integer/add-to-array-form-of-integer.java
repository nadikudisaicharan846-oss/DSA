class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        
int carry = 0;
int index = num.length-1;
int sum = 0;

        while(index>=0 || k>0){
            int a = index<0?0:num[index];
            int b  = k%10;
            sum = a+b+carry;
            int firstdigit = sum%10;
            list.add(firstdigit);
            carry = sum>9?1:0;
            index--;
            k/=10;
        }
        if(carry==1){
            list.add(1);
        }
        Collections.reverse(list);
        return list;


        
    }
}