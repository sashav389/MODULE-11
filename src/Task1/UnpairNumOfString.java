package Task1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class UnpairNumOfString {
    public void leftOnlyUnpairNames(String[] arrNames){
        AtomicInteger i = new AtomicInteger(0);
        Stream<String> names =
                Stream.of(arrNames)
                        .map(name -> i.getAndIncrement() + ". " + name)
                        .filter(name -> parseInt(Character.toString(name.charAt(0))) % 2 == 1 );
        List<String> filteredNames = names.collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
