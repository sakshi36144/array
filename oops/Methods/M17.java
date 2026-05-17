 package Methods;

class M17 {
 static void gcd(int a, int b){
    while(a!=b){
 if(a>b){a=a-b;}
 else{b=b-a;}

    }
     System.out.println(a);

}
public static void main(String[] args){
    int a=25; int b=15;
    gcd(a, b);

}

    
}

