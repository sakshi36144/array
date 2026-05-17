package Methods;

public class M5{
    static void fac(int a){
        int b=1;
        for(int i=1;i<=a;i++){
           b= b*i;
        }
        System.out.println("Factorial :"+b);
    }
    public static void main(String[] args) {  
        int a=5; 
        fac(a); 
    }
}

// int a=5;
//     int b=1;
//     for(int i=1;i<=a;i++){
//         b=b*i;
//         System.out.println(b)