package Methods;


public class M2 {
                //method   
         static int max(int a,int b,int c,int d)//formal parameter
         {
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;
        return max;

    }
    public static void main(String[] args) {
        int a=10,b=40,c=20 ,d=70;
        M2 m2=new M2();
        System.out.println("Maximum :"+ m2.max(a, b, c, d));
    }
}
