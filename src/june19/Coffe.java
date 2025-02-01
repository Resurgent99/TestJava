package june19;




interface CreateCoffe{
    double getCost();
}
public class Coffe implements CreateCoffe{
    public double CoffeCost = 1.0;
    public double getCost(){

        return CoffeCost;
    }


    public static void main(String[] args) {
        Coffe coffe = new Coffe();
        System.out.println(coffe.getCost());
        MilkAdd milk = new MilkAdd(coffe);
        System.out.println(milk.getCost());







    }
}


