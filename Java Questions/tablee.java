import java.util.*;

class MultiplicationTable extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        table.start();
    }
}

