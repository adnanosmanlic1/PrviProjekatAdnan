package eight.collection;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class NaturalNumber implements Iterable<Integer>{

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}
