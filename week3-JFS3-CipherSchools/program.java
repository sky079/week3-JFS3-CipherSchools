import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;
class program
{
    static void converter(final int arg) {
        System.out.println(Math.abs(arg));
    }
    
    void doaction() {
        final List<Integer> as = Arrays.asList(-3, 7, 8, -9, 5);
        as.forEach(program::converter);
    }
    
    public static void main(final String[] args) {
        final program obj = new program();
        obj.doaction();
    }
}

