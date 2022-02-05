package part2Q2;

import java.util.Iterator;

public class CreativeHamper extends ArrayListItemHamper<Item> {
    /**
     * invariant: if hamper contains 5 or more items, it must contain at least 2 toy cars (at least
     * 1 must be premium) and at least 2 fruits. Otherwise, adding an item should do nothing
     * creative hamper has a price surcharge of $10
     */


    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }

    @Override
    public void add(Item e, int n) {
        if (super.size() >= 5) {

            int toyCarCount = 0;
            int premiumCarCount = 0;
            int fruitCount = 0;

            for (Iterator<Count<Item>> iter = super.iterator(); iter.hasNext();) {
                Count<Item> element = iter.next();
                if (element.getElement() instanceof PlasticToyCar)
                    toyCarCount += element.getCount();
                if (element.getElement() instanceof PremiumToyCar)
                    premiumCarCount += element.getCount();
                if (element.getElement() instanceof Fruit)
                    fruitCount += element.getCount();
            }

            if ((toyCarCount + premiumCarCount) >= 2 && premiumCarCount >= 1 && fruitCount >= 2)
                super.add(e, n);

        } else {
            // CreativeHamper has less than 5 items
            super.add(e, n);
        }
    }
}
