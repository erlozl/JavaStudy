package ex16;

class Buffer {
    private int data;
    // 생산자로부터 소비자에게 전해지는 데이터
    private boolean empty = true;
    // 소비자가 기다리고 있으면 true,
    // 생산자가 기다리고 있으면 false

    public synchronized int get() {
        while (empty) {
            try {
                wait();
                // 어떤 일이 일어나기를 기다릴 때 사용하는 메서드
            } catch (InterruptedException e) {

            }
            // 케이크가 생산될 때까지 기다린다
        }
        empty = true; // 상대를 토글한다
        notifyAll(); // 생산자를 깨운다
        // 어떤 일이 일어났을 때 알려주는 메서드
        return data;
    }

    public synchronized void put(int data) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        empty = false;
        this.data = data;
        notifyAll();
    }

}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("생산자" + i + "번 케이크를 생산하셨습니다");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (Exception e) {
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer drop) {
        this.buffer = drop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int data = buffer.get();
            System.out.println("생산자" + data + "번 케이크를 소비하셨습니다");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (Exception e) {
            }
        }
    }
}

public class BufferThr {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        (new Thread(new Producer(buffer))).start();
        (new Thread(new Consumer(buffer))).start();
    }
}
