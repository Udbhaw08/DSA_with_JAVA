
import java.util.Scanner;

public class conditonal_statements {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //  int a = sc.nextInt();

        //     if (a==b) {
        //       System.out.println("equal");
        //     } else if(a>b){
        //       System.out.println("a is greater than b");
        //     }else{
        //       System.out.println(3"b is greater");
        //     }
        // 
        int b = sc.nextInt();
        switch (b) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("hii");
                break;
            default:
                System.out.println("invaild button");
                ;
        }
    }
}
