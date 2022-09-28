
import Task5.ZipWithStreams;
import Task4.RandomGenerator;
import Task1.UnpairNumOfString;
import Task2.MakeBigAndSort;
import Task3.NumbersFromArrays;

import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------- First Task ----------");
        String[] arrNames = {"John", "Bill", "Max", "Zara", "Alex", "Jo", "ma"};
        UnpairNumOfString changed = new UnpairNumOfString();
        changed.leftOnlyUnpairNames(arrNames);

        //-------------------------------
        System.out.println("\n-------- Second Task ----------");
        MakeBigAndSort makeBig = new MakeBigAndSort();
        makeBig.changeString(arrNames);

        //-------------------------
        System.out.println("\n-------- Third Task ----------");
        String[] mas = {"2, 0", "4, 5, 66, 8", "3, 17, 88, -2"};
        NumbersFromArrays numbers = new NumbersFromArrays();
        numbers.getSortNumbers(mas);

        //---------------------------
        System.out.println("\n-------- Fourth Task ----------");
        long a = 25214903917L, m = 2^48L;
        int c = 11;
        RandomGenerator rand = new RandomGenerator();
        rand.randomGenerate(a , c, m);

        //---------------------------

        System.out.println("\n\n-------- Fifth Task ----------");
        Stream<String> first = Stream.of("A", "B", "C", "D");
        Stream<String> second = Stream.of("a", "b", "c", "d", "e", "f");
        ZipWithStreams someZip = new ZipWithStreams();
        Stream<String> th = someZip.zip(first, second);
        th.forEach(x -> System.out.print(x + ", "));





    }




}