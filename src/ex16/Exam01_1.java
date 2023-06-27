package ex16;

// 동기화 블록 사용 예제
class PrinterSyn {
    void print(int[] arr) throws Exception {
        // 자기자신을 동기화 시킬거다
        synchronized (this) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "");
                Thread.sleep(100);
            }

        }
    }
}

class MyThread3 extends Thread {
    PrinterSyn printsyn;
    int[] myarr = { 10, 20, 30, 40, 50 };

    MyThread3(PrinterSyn print) {
        this.printsyn = print;
    }

    @Override
    public void run() {
        try {
            printsyn.print(myarr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class MyThread4 extends Thread {
    PrinterSyn printsyn;
    int[] myarr = { 1, 2, 3, 4, 5 };

    MyThread4(PrinterSyn print) {
        this.printsyn = print;
    }

    @Override
    public void run() {
        try {
            printsyn.print(myarr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class Exam01_1 {
    public static void main(String[] args) {
        PrinterSyn print = new PrinterSyn();
        MyThread3 t1 = new MyThread3(print);
        MyThread4 t2 = new MyThread4(print);
        t1.start();
        t2.start();
    }
}
