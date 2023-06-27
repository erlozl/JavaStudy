package ex16;

public class DeadLock_1 {
    public static void main(String[] args) {
        final String res1 = "Gold";
        final String res2 = "Sliver";

        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                // 동기화를 위해 사용되는 키워드
                System.out.println("Thread 1 : 자원 1 획득");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
            synchronized (res2) {
                System.out.println("Thread 1 : 자원 2 획득");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (res1) {
                System.out.println("Thread 2 : 자원 1 획득");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
            synchronized (res2) {
                System.out.println("Thread 2 : 자원 2 획득");
            }
        });

        t1.start();
        t2.start();
    }
}
