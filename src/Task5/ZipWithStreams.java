package Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ZipWithStreams {
    public  <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> fir = new ArrayList<>(first.toList());
        List<T> sec = new ArrayList<>(second.toList());
        int length = Math.min(fir.size(), sec.size());

        if(fir.size() > length) {
            fir = changeLength(fir, length);
        }
        else {
            sec = changeLength(sec, length);
        }


        Collections.shuffle(fir);
        Collections.shuffle(sec);


        return Stream.concat(fir.stream(), sec.stream());
    }
    public  <T> ArrayList<T> changeLength(List<T> x, int length){
        return new ArrayList<>(x.stream()
                .limit(length).toList());
    }
}
