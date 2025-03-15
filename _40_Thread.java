public class Main {

    class threads1 extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 100) {
                System.out.println("Thread 1 is running");
                i++;
            }
        }
    }

    class threads2 extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 100) {
                System.out.println("Thread 2 is running");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Main mainInstance = new Main(); // Create an instance of the enclosing class
        threads1 t1 = mainInstance.new threads1();
        threads2 t2 = mainInstance.new threads2();

        t1.start();
        t2.start();
    }
}