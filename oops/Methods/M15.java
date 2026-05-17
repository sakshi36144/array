package Methods;


public class M15 {
        static int c; 
       static void pow(int a){
          c=(int) Math.pow(a,3);
            // System.out.println(c);
            
            }
            static void arm(int a){
                int rem=0; int sum=0; int ori=a;
                 while(a>0){
                 rem=a%10;
                  pow(rem);
                 sum= sum+c;
                   a=a/10;
            }
            if (sum == ori){
                System.out.println(ori + " is an Armstrong Number");}
            else {
                System.out.println(ori + " is NOT an Armstrong Number");}
            }
    public static void main(String[] args) {
        int a=153;
        arm(a);
    }
}
