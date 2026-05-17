package Methods;


public class M8 {
       static int pow(int a,int b){
        //  int c=(int) Math.pow(a,b);
        //     return c;
          int c=1;
          for(int i=1;i<=b;i++){
               c=c*a;
            
          }
             return c;
       }
    public static void main(String[] args) {
        int a=2,b=7;
        M8 m8=new M8();
        System.out.println("Power :"+m8.pow(a,b));
    }
}
