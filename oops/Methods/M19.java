package Methods;
class computer{
    //   //static method 
    //      static void add(int a, int  b){
    //     int c=a+b;
    //     System.out.println(c);
    //   }
    // non static method 
        void add(int a, int  b){
        int c=a+b;
        System.out.println(c);
      }
}
public class M19 {
    public static void main(String[] args) {
      int a=2;
      int b=2;
    //  computer.add(a,b);

    //non static method 
    computer Add =new computer();
     Add.add(a, b);

}
}



