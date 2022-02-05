package part2Q2;

public class Apple extends Fruit {
    private int pricePerKilo;
    private int weightGrams;

    public Apple(String name, int pricePerKilo, int weightGrams) {
        super(name);
        this.pricePerKilo = pricePerKilo;
        this.weightGrams = weightGrams;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Apple other = (Apple) obj;
        if (pricePerKilo != other.pricePerKilo || weightGrams != other.weightGrams) return false;
        return true;
    }

    public int getPrice(){
        return pricePerKilo*weightGrams;
    }

    @Override
    public String toString(){
        return super.toString()+" pricePerKilo="+pricePerKilo+" weightGrams="+weightGrams;
    }
}
