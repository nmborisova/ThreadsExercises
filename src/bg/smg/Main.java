package bg.smg;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i =0;i<100;i++){
                if(i%2==0) {
                    System.out.println("t1: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(()->{
            for (int i =0;i<100;i++){
                if(i%2!=0) {
                    System.out.println("t2: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
