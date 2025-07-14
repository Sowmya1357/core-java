package javaprograms;
public class GarbageCollectorExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memory before GC: " + runtime.freeMemory());

        System.gc(); // Suggests garbage collection

        System.out.println("Memory after GC: " + runtime.freeMemory());
    }
}
