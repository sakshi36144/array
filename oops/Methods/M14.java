package Methods;
// strong number
public class M14{
     static int b; //global variable 
    static int fac(int a){
        b=1;
        for(int i=1;i<=a;i++){
           b= b*i;
        }
        return b;
    }
    static int sum(int a){
    int rem=0; int sum=0; int ori=a;
    while(a>0){
    rem=a%10;
    fac(rem);
      sum= sum+b;
       a=a/10;
        
}
 if (sum == ori){
            System.out.println(ori + " is a Strong Number");}
        else {
            System.out.println(ori + " is NOT a Strong Number");}
    return sum;
    }
    public static void main(String[] args) {  
        int a=145; 
        
        sum(a);
    }
}