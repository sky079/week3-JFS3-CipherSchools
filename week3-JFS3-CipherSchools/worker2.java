class worker2 implements Runnable
{
    @Override
    public void run() {
        for (int i = 1; i <= 20; ++i) {
            System.out.println("Hello from Thread two");
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}