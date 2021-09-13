package HTack_lection6;

public class Ground extends Transport {
    int wheels;
    int fuelConsumption;
    public void getInfoGround(int wheels, int fuelConsumption) {
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
    void info() {
        System.out.println("Ground transport");
    }
}
