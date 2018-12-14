package mybignumber;
   
 
class MyBigNumber {
    private IReceiver receiver;
   
    public MyBigNumber(IReceiver receiver) {
        this.receiver = receiver;
    }   
    
    public String sum (String s1, String s2) {
        
        String result="";
        int length_s1=s1.length();
        int length_s2=s2.length();
        int temp=0;
        int max;
        char c1,c2;
        int sum=0;
        
        if(length_s1>length_s2){
            max=length_s1;
        }
        else{
            max=length_s2;
        }
        
        for(int i=0;i<max;i++){
            length_s1--;
            length_s2--;
            if(length_s1>=0){
                c1=s1.charAt(length_s1);
            }
            else{
                c1='0';
            }
            if(length_s2>=0){
                c2=s2.charAt(length_s2);
            }
            else{
                c2='0';
            }
            sum=(c1-'0')+(c2-'0')+temp;
            result=(sum%10)+result;
            temp=(sum/10);            
        }
        if(temp>0){
            result=temp+result;
        }
        return result;
    }
}





