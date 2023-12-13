public class thread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        thread t= new thread();
        Thread t1 = new Thread(t);
        t1.run();


    }
}
