package Methods;


public class M16 {
        static int c; 
       static int  pow(int a){
          c=(int) Math.pow(a,3);
            // System.out.println(c);
            return c;
            }
            static int arm(int a){
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
                return sum;
            }
    public static void main(String[] args) {
        int a=153;
        arm(a);
    }
}
