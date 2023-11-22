public class p {
    public static void show(int... x) {
        for (int a : x) {
            System.out.println(a);
        }
    }

    public static void showstring(String ... s){
        for(int i=0;i<s.length;i++){
            System.out.printf("%d - %s\n",i+1,s[i]);
        }  
    }

    public static void main(String[] args) {
        // show();
        // show(10, 20, 30);
        // show(new int[] { 2, 3, 4, 5 });

        showstring("john","harsh");
    }
}
