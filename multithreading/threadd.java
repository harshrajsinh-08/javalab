/* 
class Mythread extends Thread {
    public void run() {
        int i = 1;
        while (i < 40) {
            System.out.println(i + " Hello");
            i++;
        }

    }
}

public class threadd {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        int i = 1;

        while (i < 40) {
            System.out.println(i + " World");
            i++;

        }

    }
}
*/

// Using ONLY ONE THREAD CLASS

public class threadd implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        threadd t = new threadd();
        Thread t1 = new Thread(t);
        t1.start();
        
        
    }
}