package Alishev_Multithreading_in_Java;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runner1());
        thread.start();
    }
}
class Runner1 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello from MyTread "+i);

        }
    }
}
class MyTread extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello from MyTread "+i);

        }
    }
}