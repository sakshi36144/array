package Methods;


public class M3 {
    static void fac(int a){
        
         for(int i=1;i<=a;i++){
            if(a%i==0)
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int a=12;
        fac(a);
       
    }
}
