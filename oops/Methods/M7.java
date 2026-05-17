package Methods;


public class M7 {
       static void pow(int a,int b){
        //  int c=(int) Math.pow(a,b);
        //     System.out.println("Power :"+c);
         int c=1;
          for(int i=1;i<=b;i++){
               c=c*a;
          }
             System.out.println("Power :"+c);
       }
    public static void main(String[] args) {
        int a=2,b=7;
        pow(a,b);
    }
}
