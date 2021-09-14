package HTack_lection6;

public class Cargo extends Ground {
    int loadCapacity;
    double answer;
    int checking = 40000;

    void Cargo(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    void description() {
        System.out.println("[ Wheels: " + this.wheels);
        System.out.println("Fuel consumption: " + fuelConsumption);
        System.out.println("Power: " + this.power);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Mark: " + this.mark);
        System.out.println("Weight: " + this.weight);
        System.out.println("Load capacity: " + loadCapacity);
        System.out.println("Power in kilowatts: " + this.answer + " ]" );
        System.out.println(checkingCapacity(this.checking) + "\n");
    }
    public void powerKilowatts() {
        answer = 0.74 * power;
    }
    private String checkingCapacity(int checking) {
        if (checking == loadCapacity) {
            return "Your truck is loaded";
        } else {
            return "You need a bigger truck";
        }
    }
}
