package Task2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MakeBigAndSort {
    public void changeString(String[] arrNames){
        List<String> filteredNames2 = Stream.of(arrNames)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        Collections.reverse(filteredNames2);
        System.out.println(filteredNames2);
    }
}
