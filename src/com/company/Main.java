package com.company;

public class Main implements Runnable {
    private static String Winner;

    @Override
    public void run() {
        for (int i = 0; i <= 2000; i++) {
            if (Thread.currentThread().getName().equals("tz") && i%10 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Boolean flag = getWinner(i);
            if (flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了第"+i+"步");
        }
    }

    public Boolean getWinner(int steps) {

        if (Winner != null){
            return true;
        }{
            if (steps >= 200){
                Winner =Thread.currentThread().getName();
                System.out.println("Winner    is      "+Winner);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main main = new Main();
        new Thread(main,"tz").start();
        new Thread(main,"wg").start();
    }
}





