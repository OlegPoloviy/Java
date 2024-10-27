package abstractExample;

public class Apple extends Food {

    public Apple(double weight, boolean isTasty, double price) {
        super("Apple", weight, isTasty, price);
    }

    @Override
    public String taste() {
        return "Like apple";
    }

    @Override
    public boolean isGood() {
        return true;
    }

    @Override
    public void tryFood() {
        System.out.println("You try an apple, and it tastes " + taste());
    }
}
