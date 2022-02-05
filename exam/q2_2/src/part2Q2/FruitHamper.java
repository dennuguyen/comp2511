package part2Q2;

import java.util.Iterator;

public class FruitHamper extends ArrayListItemHamper<Fruit> {
    /**
     * invariant: FruitHamper must have at least 2 apples and 2 avocados when have >= 6 fruits.
     * Otherwise, adding an item should do nothing fruit hamper has price surcharge of 25%, rounded
     * up to nearest integer
     */

    @Override
    public int getPrice() {
        return (int) Math.round(super.getPrice() * 1.25);
    }

    @Override
    public void add(Fruit e, int n) {
        // FruitHamper must have at least 6 fruits
        if (super.size() >= 6) {

            int avoCount = 0;
            int appleCount = 0;

            for (Iterator<Count<Fruit>> iter = super.iterator(); iter.hasNext();) {
                Count<Fruit> element = iter.next();
                if (element.getElement() instanceof Apple)
                    appleCount += element.getCount();
                if (element.getElement() instanceof Avocado)
                    avoCount += element.getCount();
            }

            // FruitHamper must have at least 2 apples and 2 avocados
            if (avoCount >= 2 && appleCount >= 2)
                super.add(e, n);

        } else {
            // FruitHamper has less than 6 fruits
            super.add(e, n);
        }
    }
}
