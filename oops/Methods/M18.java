 package Methods;

class M18 {
    int gcd(int a, int b){
    while(a!=b){
 if(a>b){a=a-b;}
 else{b=b-a;}

    }
         return a;

}
public static void main(String[] args){
    int a=25; int b=15;
    M18 m18=new M18();
    System.out.println(m18.gcd(a, b));

}

    
}

