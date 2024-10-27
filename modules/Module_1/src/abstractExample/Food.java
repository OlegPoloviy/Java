package abstractExample;

abstract class Food {
    private String type;
    private double weight;
    private boolean isTasty;
    private double price;

    public Food(String type,double weight,boolean isTasty,double price){
        this.type = type;
        this.weight = weight;
        this.isTasty = isTasty;
        this.price = price;
    }

    public abstract String taste();

    public abstract boolean isGood();

    public abstract void tryFood();

    public void printInfo(){
        System.out.println("Type of the food: " +
                this.type + "\n" +
                "Weight" + this.weight + "\n" + "It is tasty? " +
                this.isTasty + "\n" + "It costs " + this.price);
    }
}
