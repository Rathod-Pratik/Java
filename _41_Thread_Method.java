class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(getName() + " is running.");
            Thread.sleep(500); // Demonstrates sleep()
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}

public class _41_Thread_Method {
    public static void main(String[] args) {
        // Create threads
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-1"); // Using setName()
        thread1.setPriority(Thread.MAX_PRIORITY); // Using setPriority()

        MyThread thread2 = new MyThread();
        thread2.setName("Thread-2");

        // Check thread states before starting
        System.out.println(thread1.getName() + " state before start: " + thread1.getState());
        System.out.println(thread2.getName() + " state before start: " + thread2.getState());

        thread1.start(); // Start thread1
        thread2.start(); // Start thread2

        // Check if threads are alive
        System.out.println(thread1.getName() + " is alive? " + thread1.isAlive());
        System.out.println(thread2.getName() + " is alive? " + thread2.isAlive());

        try {
            // Join threads to main thread
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Check thread states after completion
        System.out.println(thread1.getName() + " state after finish: " + thread1.getState());
        System.out.println(thread2.getName() + " state after finish: " + thread2.getState());

        // Use currentThread()
        Thread current = Thread.currentThread();
        System.out.println("Currently running thread: " + current.getName());

        // Demonstrating daemon threads
        Thread daemonThread = new Thread(() -> {
            System.out.println("Daemon thread running.");
        });
        daemonThread.setDaemon(true); // Setting thread as daemon
        daemonThread.start();
    }
}
