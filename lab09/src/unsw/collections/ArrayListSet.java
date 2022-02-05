/**
 * An implementation of Set that uses an ArrayList to store the elements.
 */
package unsw.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSet<E> implements Set<E> {

    private ArrayList<E> elements;

    public ArrayListSet() {
        this.elements = new ArrayList<E>();
    }

    @Override
    public void add(E e) {
        if (!this.elements.contains(e))
            this.elements.add(e);
    }

    @Override
    public void remove(E e) {
        this.elements.remove(e);
    }

    @Override
    public boolean contains(Object e) {
        return this.elements.contains(e);
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public boolean subsetOf(Set<?> set) {
        for (E e : this.elements)
            if (!set.contains(e))
                return false;
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return this.elements.iterator();
    }

    @Override
    public Set<E> union(Set<? extends E> set) {
        ArrayListSet<E> result = new ArrayListSet<E>();
        result.addAll(this);
        result.addAll(set);
        return result;
    }

    @Override
    public Set<E> intersection(Set<? extends E> set) {
        ArrayListSet<E> result = new ArrayListSet<E>();
        for (E e : this.elements)
            if (set.contains(e))
                result.add(e);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (!(obj instanceof Set))
            return false;

        if (this == obj)
            return true;

        Set<?> set = (Set<?>) obj;

        if (set.size() != this.size())
            return false;

        if (!this.subsetOf(set) || !set.subsetOf(this))
            return false;

        return true;
    }

    public void addAll(Set<? extends E> set) {
        for (E e : set)
            this.add(e);
    }

    public void println() {
        System.out.print("[");
        for (E e : this.elements) {
            System.out.print(e);
            System.out.print(", ");
        }
        System.out.println("]");
    }
}
