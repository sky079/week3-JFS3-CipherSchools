import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
public class Filter
{
    public static void main(final String[] args) {
        final List<Integer> numbers = Arrays.asList(12, 56, -90, 78);
        final List<Integer> result = numbers.stream().filter(e -> e < 0).collect((Collector<? super Object, ?, List<Integer>>)Collectors.toList());
        System.out.println(result);
        final List<Object> myList = Arrays.asList(true, 100, "hello", 900, "welcome");
        final List<Object> ans = myList.stream().filter(e -> e.getClass().getSimpleName().equals("Integer")).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
        System.out.println(ans);
        myList.forEach(m -> System.out.println(invokedynamic(makeConcatWithConstants:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;, m, m.getClass().getSimpleName())));
        final int totalintger = (int)myList.stream().filter(e -> e.getClass().getSimpleName().equals("Integer")).count();
        System.out.println(totalintger);
    }
}

