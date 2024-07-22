
class Palindrome{
    public boolean Palindrome(int num){
        int temp =num;
        int res =0;
        int output=0;
        while(num > 0){
            res = num%10;
            output = output*10+res;
            num=num/10;
        }
        if(output ==  temp){
            return true;
        }
        else{
            return false;
        }
        
    }
}