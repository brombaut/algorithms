package singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}