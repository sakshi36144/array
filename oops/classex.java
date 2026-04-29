package oops;
// class
public class classex{
    // methods
    public void eat(String name){
        System.out.println(name+ "eat ani");
    }
    // main methods
    public static void main(String[] args){
        // object 
        classex jumbo =new classex();
        
        // methods call
        jumbo.eat("jumbo");
        jumbo.run("jumbo");
        classex buzo =new classex();
        buzo.eat("buzo");
        buzo.run("buzo");
    }  
    public void run(String name){
        System.out.println(name+" run ani");
    }
    
}
