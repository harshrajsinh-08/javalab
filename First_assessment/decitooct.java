import java.util.Scanner;
public class decitooct {
    static void dec_to_oct(int num){
        int[] oct = new int[50];
        int i =0;
        while(num != 0){
            oct[i] = num%8;
            num = num/8;
            i++;
        }
        for(int j = i-1;j>=0;j--){
            System.out.print(oct[j]);
        }
    }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    dec_to_oct(n1);
    }
}
