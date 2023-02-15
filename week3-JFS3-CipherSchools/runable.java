public class runnable
{
    Thread t1;
    Thread t2;
    
    runnable() {
        this.t1 = new Thread((Runnable)new worker1());
        this.t2 = new Thread((Runnable)new worker2());
        this.t1.setPriority(1);
        this.t2.setPriority(10);
        this.t1.start();
        this.t2.start();
    }
    
    public static void main(final String[] args) {
        new runnable();
    }
}