import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExample {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.add("Item1");
        queue.add("Item2");
        queue.add("Item3");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
