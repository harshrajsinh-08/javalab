package AUG_2_wed;
import java.util.Scanner;

public class sum_and_prod_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int arr[] = new int[element];
        for(int i =0;i<element;i++){
            arr[i] = sc.nextInt();
            
        }
        int summ = findSum(arr);
        int prod = findProd(arr);
        System.out.println("Sum="+summ);
        System.out.println("Product="+prod);
        
    }
    public static int findSum(int arr[]){
        int sum = 0;
        for(int num:arr){
            sum += num;
        }
        return sum;
    }
    public static int findProd(int arr[]){
        int prod = 1;
        for (int num : arr){
            prod *= num;
        }
        return prod;
    }
    
}	 	  	 	  	   	      	  	  	    	       	 	
