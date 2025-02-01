public class CarFactory {
    public Car createcar(String type) {
        if (type.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (type.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else {
            return null;
        }
    }
}

