public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        super.check();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}