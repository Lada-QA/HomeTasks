package HTack_lection6;

public class Civil extends Air {
    int passengers;
    boolean businessCl;
    double answer;
    int passenger = 236;
    public void getInfoCivil(int passengers, boolean businessCl) {
        this.passengers = passengers;
        this.businessCl = businessCl;
    }

    public void description() {
        System.out.println("[ Wingspan: " + this.wingspan);
        System.out.println("Minimum runway length" + this.minRunwayLength);
        System.out.println("Weight: " + this.weight);
        System.out.println("Power: " + this.power);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Mark: " + this.mark);
        System.out.println("Passengers: " + this.passengers);
        System.out.println("Business class: " + this.businessCl);
        System.out.println("Power in kilowatts: " + this.answer + " ]");
        System.out.println(checkingPassenger(this.passenger) + "\n");
    }
    public void powerKilowatts(){

        answer = 0.74 * power;
    }
    private String checkingPassenger(int passenger) {
        String answer1;
        if (passenger == passengers) {
            answer1 = "Your Air is loaded";
        } else {
            answer1 = "You need a bigger Air";
        }
        return answer1;
    }
}