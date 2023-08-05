//to perform arithmatic calculation using any loop statement and switch statement

import java.util.Scanner;

public class arithmatic{
    public static void main(String[] args) {
        int choice = 0;
        float result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to my calculator");

        System.out.println("enter a number : ");
        float n1 = sc.nextFloat();
        result = n1;

        while (true) {
            System.out.println("enter operator to continue and 0 to exit ");
            String opt = sc.next();
            if (opt.equals("+")){
                choice = 1;
            }
           else if (opt.equals("-")){
                choice = 2;

            }
            else if (opt.equals("*")) {
                choice = 3;
            }
            else if (opt.equals("/")) {
                choice = 4;
            }
            else if (opt.equals("0")){
                System.out.println("exiting .....");
                break;
            }

            System.out.println("enter another number");
            float n2 = sc.nextFloat();
            // System.out.println(n2);

            switch (choice) {
                case 1:
                    result += n2;
                    break;
                case 2:
                    result -=n2;
                    break;
                case 3:
                    result *= n2;
                    break;
                case 4:
                    result /= n2;
                    break;
            }
            System.out.println("result is : ");
            System.out.println(result);
        }
    }
}