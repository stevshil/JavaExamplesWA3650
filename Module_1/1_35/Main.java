public class Main {
  public static void main(String[] args) {
    MyRunnable runnable = new MyRunnable();
    Thread thread = new Thread(runnable);
    Thread thread2 = new Thread(runnable);
    thread.start();
    thread2.start();
  }
}