package Task4;

import java.util.stream.LongStream;

public class RandomGenerator {
    public void randomGenerate(long a, int c, long m){
        LongStream.iterate(1, x -> (x * a + c) % m )
                .limit(10) //удаляем строку для бесконечной генерации
                .forEach(x -> System.out.print(x + ", "));
    }
}
