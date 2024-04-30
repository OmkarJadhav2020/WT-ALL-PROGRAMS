public class MulltiThreading {
    public static void main(String[] args) {
        Mythred thread1 = new Mythred();
        Mythred thread2 = new Mythred();
        thread1.start();
        thread2.start();
    }
}

public class Mythred extends Thread
{
    public void run()
    {
        for(int i = 0 ; i < 5 ; i ++)
        {
            System.out.println("Thread " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}