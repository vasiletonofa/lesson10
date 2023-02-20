package run;

public interface Runner {

    default void run() {
        System.out.println("Run");
    }
}
