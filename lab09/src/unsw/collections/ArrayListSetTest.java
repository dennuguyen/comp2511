package unsw.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Iterator;
import org.junit.Test;

import unsw.fruit.Apple;
import unsw.fruit.Fruit;
import unsw.fruit.Orange;

public class ArrayListSetTest {

    @Test
    public void basicListMethodsShouldBeCorrect() {
        Set<String> set = new ArrayListSet<>();
        set.add("Hello");
        set.add("World");
        assertTrue(set.contains("Hello"));
        assertTrue(set.contains("World"));

        set.remove("Hello");
        assertFalse(set.contains("Hello"));
        assertTrue(set.contains("World"));

        set.add("World");
        assertFalse(set.contains("Hello"));
        assertTrue(set.contains("World"));
        assertEquals(1, set.size());
    }

    @Test
    public void subsetOfShouldReturnBoolean() {
        Set<Fruit> fruits = new ArrayListSet<Fruit>();
        fruits.add(new Apple("Gala"));
        fruits.add(new Apple("Fuji"));
        fruits.add(new Orange("Navel"));

        Set<Apple> apples = new ArrayListSet<>();
        apples.add(new Apple("Gala"));
        apples.add(new Apple("Fuji"));

        assertTrue(apples.subsetOf(fruits));
        assertFalse(fruits.subsetOf(apples));

        fruits.remove(new Apple("Fuji"));

        assertFalse(apples.subsetOf(fruits));
    }

    @Test
    public void unionShouldMakeNewUnion() {
        Set<Integer> digits = new ArrayListSet<Integer>();
        digits.add(1);
        digits.add(2);
        digits.add(3);

        Set<Integer> otherDigits = new ArrayListSet<Integer>();
        otherDigits.add(3);
        otherDigits.add(4);
        otherDigits.add(5);

        Set<Integer> union = digits.union(otherDigits);

        assertTrue(otherDigits.subsetOf(union));
        assertTrue(union.contains(3));
        assertTrue(union.contains(4));
        assertTrue(union.contains(5));
        assertEquals(5, union.size());
    }

    @Test
    public void intersectionShouldMakeNewIntersection() {
        Set<Fruit> basket1 = new ArrayListSet<Fruit>();
        basket1.add(new Apple("Banana"));
        basket1.add(new Orange("Orange"));

        Set<Fruit> basket2 = new ArrayListSet<Fruit>();
        basket2.add(new Orange("Orange"));

        Set<Fruit> intersection = basket1.intersection(basket2);

        assertTrue(intersection.subsetOf(basket2));
        assertEquals(1, intersection.size());
    }

    @Test
    public void setsWtihSameGenericShouldBeEquatable() {
        Set<Fruit> basket1 = new ArrayListSet<Fruit>();
        Set<Fruit> basket2 = new ArrayListSet<Fruit>();

        assertTrue(basket1.equals(basket2));
        assertTrue(basket2.equals(basket1));

        basket1.add(new Apple("Appa"));
        basket2.add(new Orange("Appa"));

        assertFalse(basket1.equals(basket2));
        assertFalse(basket2.equals(basket1));

        basket1.add(new Orange("Appa"));
        basket2.add(new Apple("Appa"));

        assertTrue(basket1.equals(basket2));
        assertTrue(basket2.equals(basket1));
    }

    @Test
    public void setsWithDifferentGenericsShouldBeEquatable() {
        Set<Fruit> fruits = new ArrayListSet<Fruit>();
        Set<Apple> apples = new ArrayListSet<Apple>();

        assertTrue(fruits.equals(apples));

        fruits.add(new Apple("Gee"));
        fruits.add(new Apple("Goo"));

        assertFalse(fruits.equals(apples));

        apples.add(new Apple("Gee"));
        apples.add(new Apple("Goo"));

        assertTrue(fruits.equals(apples));

        fruits.add(new Orange("Fee"));

        assertFalse(fruits.equals(apples));
    }

    @Test
    public void setShouldBeIterable() {
        Set<Fruit> fruits = new ArrayListSet<Fruit>();
        fruits.add(new Apple("Gala"));
        fruits.add(new Apple("Fuji"));
        fruits.add(new Orange("Navel"));

        Iterator<Fruit> iter = fruits.iterator();

        assertTrue(fruits.contains(iter.next()));
        assertTrue(fruits.contains(iter.next()));
        assertTrue(fruits.contains(iter.next()));
        assertFalse(iter.hasNext());
    }
}
