package Task3;

import java.util.Arrays;

public class NumbersFromArrays {
    public void getSortNumbers(String[] arr){
        String[] temp = String.join(", ", arr)
                .replace(", ", " ")
                .split(" ");
        Integer[] res2 = Arrays.stream(temp)
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(res2));
    }
}
