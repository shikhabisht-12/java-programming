class Study implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Studying: " + i);
        }
    }
}

class Play implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Playing: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Study s = new Study();
        Play p = new Play();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(p);

        t1.start();
        t2.start();
    }
}