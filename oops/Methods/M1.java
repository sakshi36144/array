package Methods;


public class M1 {
                //method   
         static void max(int a,int b,int c,int d)//formal parameter
         {
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;
        System.out.println("Maximum = " + max);

    }
    public static void main(String[] args) {
        int a=10,b=40,c=20 ,d=70;
         max(a, b, c, d); //actual parameter   //method call 
        
    }
}
