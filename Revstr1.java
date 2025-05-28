public class Revstr1 {
    public static void main(String args[]){
        String s="leader";
        char[] a=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char c=a[l];
            a[l]=a[r];
            a[r]=c;
            l++;
            r--;    
        }
        String reversed=new String(a);
        System.out.println(reversed);
    }   
}
