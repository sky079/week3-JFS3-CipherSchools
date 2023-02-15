import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
public class t2
{
    public static void main(final String[] args) {
        final List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        final List<Integer> ans = myList.stream().map(e -> e * e).collect((Collector<? super Object, ?, List<Integer>>)Collectors.toList());
        System.out.println(ans);
    }
}

