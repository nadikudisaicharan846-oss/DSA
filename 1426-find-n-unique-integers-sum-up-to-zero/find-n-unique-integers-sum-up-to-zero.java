class Solution {
    public int[] sumZero(int n) {
        int [] arr =  new int[n];
        int index =  0;
        int num = 1;

        if(n%2 == 1){
            arr[index] = 0;
            index++;

        }
    while(index<n){
        arr[index] = num;
        arr[index + 1] = -num;
        index = index+2;
        num++;
    }    
return arr;
    }
}