import java.util.Scanner;
import java.lang.Math;
public class armst {
    static int digittt(int num){
        int count =0;
        while(num!=0){
            num = num/10;
            count += 1;
            // System.out.println(count); 
        }
            return count; 
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find whether its armstrong or not : ");
        int orgnum = sc.nextInt();
        int numberofdigits = digittt(orgnum);

        
        int arm = 0;
        int x = orgnum;
        while(x!=0){
            int digits = x % 10;
            arm += Math.pow(digits, numberofdigits);
            x = x/10;    
        }
        if(arm == orgnum){
            System.out.println("its an armstrong number ");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}

