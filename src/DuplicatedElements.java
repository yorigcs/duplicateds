import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatedElements {

    private final List<String> duplicateds= new ArrayList<>();
    public DuplicatedElements(String[] arr1, String[] arr2) {
        Map<String, Boolean> hashMap = new HashMap<>();
        for (String item : arr1) {
            hashMap.put(item, true);
        }

        for (String s : arr2) {
            boolean item = hashMap.containsKey(s);
            if (item) this.duplicateds.add(s);

        }
    }

    public void printDuplicatedItems() {
        this.duplicateds.forEach(System.out::println);
    }
}
