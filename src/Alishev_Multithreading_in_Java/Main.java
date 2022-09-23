package Alishev_Multithreading_in_Java;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        Scanner scanner=new Scanner("Hello by not ron");
        scanner.useDelimiter("\\A");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
         */

//        MyTread myTread1=new MyTread();
//        myTread1.start();
//        System.out.println("hello world!");
        MyTread myTread2=new MyTread();
        myTread2.start();
        Thread.sleep(2000);
        MyTread myTread3=new MyTread();
        myTread3.start();

        /*
        System.out.println("I am going to sleep");
        Thread.sleep(3000);
        System.out.println("I am awake!");
         */

    }
}
class Runner implements Runnable{
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
