public abstract class Vehicle {
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void check() {
        System.out.println("Обслуживаем " + this.modelName);
        updateTyre();
    }

    private void updateTyre() {
        for (int i = 0; i < this.wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
