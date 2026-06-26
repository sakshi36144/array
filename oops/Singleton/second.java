package Singleton;
// 1 step
class DatabaseConnection{
     private DatabaseConnection(){
        System.out.println(" DatabaseConnection.DatabaseConnection()");
     }
    // 2 step 
    
    private static DatabaseConnection instance=null;
    //   3 step
    public  static DatabaseConnection getInstance(){
        // Lazy loading/Lazy instantiation
        if(instance==null){
        instance=new DatabaseConnection();}
        return instance;
      }
}

public class second {
    public static void main(String[] args){
        DatabaseConnection d1= DatabaseConnection.getInstance();
         DatabaseConnection d2= DatabaseConnection.getInstance();
          DatabaseConnection d3= DatabaseConnection.getInstance();
           DatabaseConnection d4= DatabaseConnection.getInstance();
            DatabaseConnection d5=DatabaseConnection.getInstance();

            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);
            System.out.println(d4);
            System.out.println(d5);
    }
}
