package AUG_2_wed;
import java.util.Scanner;
public class attendence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("HELLO");
        float total = sc.nextFloat();
        float attended = sc.nextFloat();
        float percent = (attended/total)*100;
        // System.out.println(percent);
        System.out.println("Attendance Percentage = "+(int)percent);
        if(percent >=75){
            System.out.println("Permitted to attend Exam");
        }
        else{
            System.out.println("Not Permitted to attend Exam");
            
        }
        
        
    }
}
