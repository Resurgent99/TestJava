package june19;

public class SugarAdd implements CreateCoffe{
    private final Coffe decoratedCoffe;
    private final double sugarCost = 0.7;

    public SugarAdd(Coffe decoratedCoffe){
        this.decoratedCoffe = decoratedCoffe;
    }
    @Override
    public double getCost() {
        return decoratedCoffe.getCost() + sugarCost;
    }
}
