
import java.util.Arrays;
class Fib {
    public static void main(String args[]){
        int l=1;
        int r=3;
        for(int i=0;i<5;i++){//upto 5 terms
           
            int c=l+r;
             System.out.print(c+" ");
            l=r;
            r=c;
        }
    }    
}
