package SEPT_27_wed;
import java.util.Scanner;

interface flyable{
    public void fly_obj();
}

class Spacecraft implements flyable{
    @Override
    public void fly_obj(){
        System.out.println("Flying a spacecraft");
    }
}
class Airplane implements flyable{
    @Override
    public void fly_obj(){
        System.out.println("Flying an airplane");
    }
}

class Helicopter implements flyable{
    @Override
    public void fly_obj(){
        System.out.println("Flying a helicopter");
    }
}
public class flyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
        System.out.println("What do you want to fly ?\n 1) helicopter \n 2) Spacecraft \n 3) Airplane \n 4) Exit");
        choice  = sc.nextInt();
        switch(choice){
            case 1:
            Helicopter h1 = new Helicopter();
            h1.fly_obj();
            break;
            
            case 2:
            Spacecraft s1 = new Spacecraft();
            s1.fly_obj();
            break;
            
            case 3:
            Airplane a1 = new Airplane();
            a1.fly_obj();
            break;
            
            case 4:
            System.out.println("Exiting ...");
            break;

            default:
            System.out.println("Please select from the valid options");
            break;
        }
    }while(choice !=4);
    }
}
