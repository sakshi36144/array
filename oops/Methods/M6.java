package Methods;

public class M6{
    static int fac(int a){
        int b=1;
        for(int i=1;i<=a;i++){
           b= b*i;
        }
        return b;
    }
    public static void main(String[] args) {  
        int a=5; 
        M6 m6=new M6();
        System.out.println("Factorial :"+m6.fac(a));
    }
}