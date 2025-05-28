class Count_letters_in_strings{
    public static void main(String args[]){
        String s="abcaadbca";   
        String v=" ";
        for(int i=0;i<s.length();i++){
            int c=0;
            char f=s.charAt(i);
            if(v.indexOf(f)==-1){
                for(int j=0;j<s.length();j++){
                    char g=s.charAt(j);
                    if(f==g){
                    c++;
                    }         
                }
                v=v+f;
                System.out.println(s.charAt(i)+"->"+c);
            }
        }       
    }
}
    

