package june19;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("StasikPidoras");
        names.add("StasikPidoras");
        names.add("StasikPidoras");
        names.add("StasikPidoras");
        names.add("StasikPidoras");
        names.add("StasikPidoras");
        names.add("StasikPidoras");
        names.forEach(System.out::println);
    }
}
