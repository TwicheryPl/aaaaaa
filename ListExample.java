import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        
        for (String item : list) {
            System.out.println(item);
        }
    }
}
