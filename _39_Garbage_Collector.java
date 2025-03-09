public class _39_Garbage_Collector {

    public static void main(String[] args) {
        // Creating two objects of the GarbageCollectorDemo class
        GarbageCollectorDemo example1 = new GarbageCollectorDemo();
        GarbageCollectorDemo example2 = new GarbageCollectorDemo();

        // Making the objects eligible for garbage collection
        example1 = null;
        example2 = null;

        // Requesting the JVM to perform garbage collection
        System.out.println("Requesting Garbage Collection...");
        System.gc();

        System.out.println("End of the main method.");
    }

    @Override
    protected void finalize() throws Throwable {
        // Message to confirm garbage collection occurred
        System.out.println("Garbage collection is executed, and the object is destroyed.");
    }
}
