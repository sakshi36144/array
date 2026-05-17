package Methods;


public class M4 {
    static int fac(int a){
         int count = 0;
         for(int i=1;i<=a;i++){
            if(a%i==0)
                 System.out.println(i);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a=12;
        M4 m4=new M4();
        System.out.println("factors :" + m4.fac(a));
       
    }
}
