package AUG_2_wed;
import java.util.Scanner;

public class grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int m6 = sc.nextInt();
        int fat = sc.nextInt();
        int internal = m1+m2+m3+m4+m5+m6;
        int external = fat;
        int total = internal + external;
        if (external>20){
            if(total>90){
                char grade = 'S';
                System.out.println("Grade="+grade);
            }
            else if(total>80 && total<90){
                char grade = 'A';
                System.out.println("Grade="+grade);
            }
            else if(total>70 && total<80){
                char grade = 'B';
                System.out.println("Grade="+grade);
            }
            else if (total >60 && total<70){
                char grade = 'C';
                System.out.println("Grade="+grade);
            }
            else if(total >50 && total<60){
                char grade = 'D';
                System.out.println("Grade="+grade);
            }
            else if(total <50 && total >20){
                char grade = 'E';
                System.out.println("Grade="+grade);
            }	 	  	 	  	   	      	  	  	    	       	 	
            
        }
        else{
            char grade = 'F';
            System.out.println("Grade="+grade);
        }
        
    }
}
