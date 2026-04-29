package oops;
// class
public class cl{
    // methods
    public void eat(String name,String dish){
        System.out.println(name+ "eat ani" +dish);
    }
    // main methods
    public static void main(String[] args){
        // object 
        cl jumbo =new cl();
        
        // methods call
        jumbo.eat("jumbo","food");
        jumbo.run("jumbo",5);
        cl buzo =new cl();
        buzo.eat("buzo","food");
        buzo.run("buzo",6);
    }  
    public void run(String name, int distance){
        System.out.println(name+" run ani"+distance);
    }
    
}
