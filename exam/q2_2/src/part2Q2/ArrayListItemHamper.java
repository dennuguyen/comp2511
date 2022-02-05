package part2Q2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A hamper implemented using an ArrayList.
 *
 * @author Matthew Perry
 *
 * @invariant for all c in counts, c.getCount() > 0
 *
 * @param <E>
 */
public class ArrayListItemHamper<E extends Item> implements Hamper<E> {

    private ArrayList<Count<E>> counts;

    /**
     * Create a new empty hamper.
     */
    public ArrayListItemHamper() {
        this.counts = new ArrayList<Count<E>>();
    }

    private Count<E> getCount(Object o) {
        for (Count<E> c : counts)
            if (c.getElement().equals(o))
                return c;
        return null;
    }

    @Override
    public void add(E e) {
        add(e, 1);
    }

    @Override
    public void add(E e, int n) {
        Count<E> c = getCount(e);
        if (c != null) {
            c.incrementCount(n);
        } else if (n > 0) {
            counts.add(new Count<E>(e, n));
        }
    }

    @Override
    public void remove(E e) {
        remove(e, 1);
    }

    @Override
    public void remove(E e, int n) {
        Count<E> c = getCount(e);
        if (c != null) {
            c.decrementCount(n);
            if (c.getCount() <= 0) {
                counts.remove(c);
            }
        }
    }

    @Override
    public int count(Object o) {
        Count<E> c = getCount(o);
        if (c != null)
            return c.getCount();
        return 0;
    }

    @Override
    public int size() {
        int count = 0;
        for (Count<E> c : this.counts)
            count += c.getCount();
        return count;
    }

    @Override
    public Hamper<E> sum(Hamper<? extends E> hamper) {
        Hamper<E> result = new ArrayListItemHamper<E>();
        for (Count<E> c1 : this.counts)
            result.add(c1.getElement(), c1.getCount());
        for (Count<? extends E> c2 : hamper)
            result.add(c2.getElement(), c2.getCount());
        return result;
    }

    @Override
    public Iterator<Count<E>> iterator() {
        return counts.iterator();
    }

    /**
     * For this method, hampers should be the same class to be equal (ignore the generic type
     * component). For example, a CreativeHamper cannot be equal to a FruitHamper, And a FruitHamper
     * cannot be equal to an ArrayListItemHamper<Fruit>, However an ArrayListItemHamper<Fruit> can
     * be equal to a ArrayListItemHamper<Item> if they both only contain fruit. HINT: use getclass()
     * to compare objects.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (this.getClass() != o.getClass())
            return false;

        if (this == o)
            return true;

        ArrayListItemHamper<E> obj = (ArrayListItemHamper<E>) o;

        // Check sizes
        if (obj.size() != this.size())
            return false;

        // Check the difference of the Hampers
        Hamper<E> result = new ArrayListItemHamper<E>();
        for (Count<E> c1 : this.counts)
            result.add(c1.getElement(), c1.getCount());
        for (Count<E> c2 : obj)
            result.remove(c2.getElement(), c2.getCount());
        if (result.size() != 0)
            return false;

        return true;
    }

    /**
     * 
     * @return price of the hamper - for ArrayListItemHamper, this should be the sum of the prices
     *         of items with each price multiplied by the number of times that item occurs
     */
    @Override
    public int getPrice() {
        int price = 0;
        for (Count<E> c : this.counts)
            price += c.getElement().getPrice() * c.getCount();
        return price;
    }

    @Override
    public String toString() {
        return counts.toString();
    }
}
