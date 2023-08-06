import java.util.Scanner;

public class good_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times= sc.nextInt();

        for (int i = 0; i <= times; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int[] series = genser(a, b, n);
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            int n2 = sc.nextInt();
            int[] series2 = genser(a2, b2, n2);
            printSeries(series);
            printSeries(series2);
        }
    }

    public static int[] genser(int a, int b, int n) {
        int[] series = new int[n];
        int currentTerm = a;
        for (int i = 0; i < n; i++) {
            currentTerm += (int) Math.pow(2, i) * b;
            series[i] = currentTerm;
        };
        return series;
    }

    public static void printSeries(int[] series) {
        for (int i = 0; i < series.length; i++) {
            System.out.print(series[i] + " ");
        }
        System.out.println();
    }
}
