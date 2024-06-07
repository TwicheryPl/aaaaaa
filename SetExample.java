import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Item1");
        set.add("Item2");
        set.add("Item3");
        set.add("Item1"); // This will not be added again

        for (String item : set) {
            System.out.println(item);
        }
    }
}

