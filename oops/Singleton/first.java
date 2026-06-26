package Singleton;
// 1 step
class DatabaseConnection{
     private DatabaseConnection(){
        System.out.println(" DatabaseConnection.DatabaseConnection()");
     }
    // 2 step 
    //  Early loading/Early instantiation
    private static DatabaseConnection instance=new DatabaseConnection();
    //   3 step
    public  static DatabaseConnection getInstance(){
        return instance;
      }
}

public class first {
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
