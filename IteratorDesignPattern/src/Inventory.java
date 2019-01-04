import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Inventory implements Iterable<Toy> {
    private List<Toy> toys = new ArrayList<>();
    private ArrayList<Toy> logs = new ArrayList<>();


    public void add(Toy t) {
        toys.add(t);
        logs.add(t);
    }

    /*
     * Returns an iterator over elements of type {T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Toy> iterator() {
        return new InventoryIterator();
    }

    private class InventoryIterator implements Iterator<Toy> {
        Iterator<Toy> toysIterator = toys.iterator();
        Iterator<Toy> backlogIterator = logs.iterator();

        /*
         * Returns {true} if the iteration has more elements.
         * (In other words, returns {true} if {#next} would
         * return an element rather than throwing an exception.)
         *
         * @return {true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return toysIterator.hasNext() || backlogIterator.hasNext();
        }

        /*
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public Toy next() {
            return toysIterator.hasNext() ? toysIterator.next() : backlogIterator.next();
        }
    }

}
