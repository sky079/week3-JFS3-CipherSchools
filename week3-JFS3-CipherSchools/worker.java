import java.util.Date;
class worker extends Thread
{
    @Override
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println(invokedynamic(makeConcatWithConstants:(Ljava/util/Date;)Ljava/lang/String;, new Date()));
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

