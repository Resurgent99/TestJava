package june19;

public class MilkAdd implements CreateCoffe{
    private final Coffe decoratedCoffe;
    private final double milkCost = 0.5;

    public MilkAdd(Coffe decoratedCoffe){
        this.decoratedCoffe = decoratedCoffe;
    }

    @Override
    public double getCost() {
        return decoratedCoffe.getCost() + milkCost;
    }
}
