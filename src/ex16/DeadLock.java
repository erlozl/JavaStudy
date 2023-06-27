package ex16;

// 동기화는 여러 스레드가 공유된 리소스에 동시에 접근하는 것을 제어하여 스레드 간의 충돌이나 데이터 일관성 문제를 방지하는 메커니즘
// 교착(데드락)예제
public class DeadLock {
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
                    System.out.println("Thread 1 : 자원 2 획득");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (res2) {
                System.out.println("Thread 2 : 자원 2 획득");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println("Thread 2 : 자원 1 획득");
                }
            }
        });

        t1.start();
        t2.start();

    }
}
