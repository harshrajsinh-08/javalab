import java.util.Scanner;
public class coders_way {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        int choice;
        do{
            System.out.println("How much do you love her/him ?");
            System.out.println("1 --> little");
            System.out.println("2 --> too much");
            System.out.println("3--> UNCOMPARABLE");
            choice = sc.nextInt();
            if(choice == 1){
                for(int i=1;i<=10;i++){
                    System.out.printf("%s I LOVE YOU %d\n",name,i);
                }
            }
            else if(choice == 2){
                for(int i = 1;i<=50;i++){
                    System.out.printf("%s I Love you %d\n",name,i);
                }
            }
            else if(choice ==3){
                int i=1;
                if(name.equals("Naoise")){
                while(true){
                    System.out.printf("%s I Hate you %d\n",name,i);
                    i++;
                    }
                }
                else{
                    while(true){
                    System.out.printf("%s I Love you %d\n",name,i);
                    i++;
                }
            }
        }
        }while(choice !=0);
    }
}