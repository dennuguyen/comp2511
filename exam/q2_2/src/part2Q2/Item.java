package part2Q2;

public abstract class Item {
    public abstract int getPrice();

    @Override
    public String toString(){
        return getClass().getName();
    }
}
