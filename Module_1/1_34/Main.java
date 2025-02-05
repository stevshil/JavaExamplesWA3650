public class Main {
  public static void main(String[] args) {
    MyThread thread = new MyThread();
    MyThread thread2 = new MyThread();
    thread.start();
    thread2.start();
  }
}