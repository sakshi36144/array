package loop;

public class Q13 {
    public static void main(String[] args){
        // int i,j=0,k=1,m=0;
        // for (i=1;i<=10;i++){
        //     m=j;
        //     System.out.println(m);
        //     m=j+k;
        //     j=k;
        //     k=m;
        int j=0,k=1,c=0;
        for(int i=0;i<=4;i++){
            System.out.println(j);
            c=j+k;
            j=k;
            k=c;
        }
        }
    }
// }
