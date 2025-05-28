import java.util.Arrays;

public class Min_max_trace {
    public static void main(String args[]){
        int []a={1,2,3,4};
        int n=a.length;
        //int min=0;
        //int max=0;
        int maxres[]={a[0],a[1]};
        int minres[]={a[0],a[1]};
        int maxsum=a[0]+a[1];
        int minsum=a[0]+a[1];
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                System.out.println(a[i]+","+a[j]);
                if(a[i]+a[j]>maxsum){
                    maxsum=a[i]+a[j];
                    maxres[0]=a[i];
                    maxres[1]=a[j];
                }
            
       
                if(a[i]+a[j]<minsum){
                    minsum=a[i]+a[j];
                    minres[0]=a[i];
                    minres[1]=a[j];

                }
            }
        }
        System.out.println("Maximum sum is :"+Arrays.toString(maxres));
        System.out.println("Minimum sum is :"+Arrays.toString(minres));    
    }
}    
