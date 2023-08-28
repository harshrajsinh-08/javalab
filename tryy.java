import java.util.ArrayList;
import java.util.Scanner;
class hell { 
    Scanner sc = new Scanner(System.in);
    int n1;
    public void get_n1(){
        System.out.print("enter n1: ");
        n1 = sc.nextInt();
    }
    public static String conv(int n1){
        ArrayList a1= new ArrayList<>();
        String s1 = a1.toString();
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter for loop limiter: ");
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                a1.add(i,num);
            }

        }

        return s1;
        
    }
}


public class tryy {
    public static void pr_n1(hell h1){
        System.out.println(h1.n1);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        hell h1 = new hell();
        h1.get_n1();
        hell h2 = new hell();
        h2.get_n1();
        pr_n1(h1);
        pr_n1(h2);
        h1.conv(5);
        
    }
}
