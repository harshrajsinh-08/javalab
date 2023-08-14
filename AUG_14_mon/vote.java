package AUG_14_mon;
import java.util.Scanner;

class person{
    public int age;
    person(){};
    person(int age){
        this.age = age;
    };
    void checkEligibility(){
        if(age>18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        person p = new person(age); 
        p.checkEligibility();       
    }
}
