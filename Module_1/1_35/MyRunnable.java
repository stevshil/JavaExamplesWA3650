import java.util.concurrent.TimeUnit;
import java.util.Random;

public class MyRunnable implements Runnable {
  @Override
  public void run() {
    long threadId = Thread.currentThread().getId();
    Random rand = new Random();
    int rand_int1 = rand.nextInt(10);

    try {
      TimeUnit.SECONDS.sleep(rand_int1);
    } catch (Exception e) {
      System.err.println("No sleep");
    }
    System.out.println("Running in a new thread ID: " + String.valueOf(threadId));
  }
}