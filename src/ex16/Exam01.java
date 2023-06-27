package ex16;

// 정수 배열 출력하기

class Printer {
    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


class MyThread1 extends Thread {
    Printer printCons;
    int[] myarr = { 10, 20, 30, 40, 50 };

    MyThread1(Printer print) {
        this.printCons = print;
    }

    public void run() {
        printCons.print(myarr);
    }

}

class MyThread2 extends Thread {
    Printer printCons;
    int[] myarr = { 1, 2, 3, 4, 5 };

    MyThread2(Printer print) {
        this.printCons = print;
    }

    public void run() {
        printCons.print(myarr);
    }
}

public class Exam01 {
    public static void main(String[] args) {
        Printer print = new Printer();
        MyThread1 t1 = new MyThread1(print);
        MyThread2 t2 = new MyThread2(print);
        t1.start();
        t2.start();
    }
}
