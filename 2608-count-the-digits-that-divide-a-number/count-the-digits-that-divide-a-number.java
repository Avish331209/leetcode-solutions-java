class Solution {
    public int countDigits(int num) {
        int original=num;
        int count=0;
        while(num>0){
            int d=num%10;
            if(d!=0 && original%d==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}