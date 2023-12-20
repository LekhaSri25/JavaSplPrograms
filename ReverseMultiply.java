import static java.lang.Integer.parseInt;

public class ReverseMultiply{
    public void result(){
       for(int i = 0;i<100;i++){
           int sum;
           int rev;
           if(i<10){
               sum = i;
               rev = i;
           }
           else {
               sum = (i/10)+(i%10);
               if(sum<10){
                  rev = sum;
               }
               else{
                   String a = String.valueOf(i%10);
                   String b = String.valueOf(i/10);
                   rev = parseInt(a+b);
               }
           }
           int res = sum*rev;
           if(res == i){
               System.out.println(i);
           }
        }
    }
    public static void main(String args[]){
        ReverseMultiply rm = new ReverseMultiply();
        rm.result();
    }
}
