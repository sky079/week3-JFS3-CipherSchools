class worker1 implements Runnable
{
    @Override
    public void run() {
        for (int i = 1; i <= 20; ++i) {
            System.out.println("Thread is working");
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}