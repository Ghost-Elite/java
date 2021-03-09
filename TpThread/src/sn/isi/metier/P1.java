package sn.isi.metier;

public class P1 extends Thread{
    public P1() {
        //this.start();
    }

    @Override
    public void run() {
        System.out.println("Demarrage du proccessus p1");
        try {
            sleep(200);
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }

    }
}
