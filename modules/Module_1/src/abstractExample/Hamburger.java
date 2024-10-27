package abstractExample;

public class Hamburger extends Food{

    public Hamburger(String type,double weight,boolean isTasty){
        super(type,weight,isTasty,150);
    }

    @Override
    public String taste(){
        return "like diabetes";
    }

    @Override
    public boolean isGood() {
        return false;
    }

    @Override
    public void tryFood() {
        System.out.println("You try an hamburger, and it tastes " + taste());
    }
}
