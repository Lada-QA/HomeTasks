package HTack_lection6;

public class Passenger extends Ground {
    String bodyType;
    int passengers;
    double answer;
    double kilometers;
    int time = 2;
       public void getInfoPassenger(String bodyType, int passengers) {
           this.bodyType = bodyType;
           this.passengers = passengers;
    }
    public void description() {
        System.out.println("[ Wheels: " + this.wheels);
        System.out.println("Fuel consumption: " + fuelConsumption);
        System.out.println("Power: " + this.power);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Mark: " + this.mark);
        System.out.println("Weight: " + this.weight);
        System.out.println("Body type: " + this.bodyType);
        System.out.println("Passengers: " + this.passengers);
        System.out.println("Power in kilowatts: " + this.answer + " ]");
        System.out.println(this.value());
    }
    public void powerKilowatts() {
        answer = 0.74 * power;

    }
    private String value() {
        kilometers = time * maxSpeed;
        return "At the time " + time + " hours the car Peugeot is moving at the maximum speed " +
                maxSpeed + " kl/h and will use up " + fuelConsumption +
                " litres gasoline\n";

    }
}
