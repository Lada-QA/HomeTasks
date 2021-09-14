package HTack_lection6;

public class Military extends AirTransport {
    boolean catapult = true;
    int rockets;
    double answer;
    String halk = "OH, NO!!!HAAAAALK!!!";

    void getInfoMilitary(boolean catapult, int rockets) {
        this.catapult = catapult;
        this.rockets = rockets;
    }

    public void description() {
        System.out.println("[ Wingspan: " + this.wingspan);
        System.out.println("Minimum runway length " + this.minRunwayLength);
        System.out.println("Weight: " + this.weight);
        System.out.println("Power: " + this.power);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Mark: " + this.mark);
        System.out.println("Passengers: " + this.catapult);
        System.out.println("Business class: " + this.rockets);
        System.out.println("Power in kilowatts: " + this.answer + " ]");
        System.out.println(shot(this.rockets));
        System.out.println("System of catapult: " + checkingCatapult(this.catapult));
        System.out.println(this.halk +"\n" + attackHalk(this.catapult));
    }
    public void powerKilowatts() {
        answer = 0.74 * power;

    }
    private String shot(int rockets) {
        if (rockets != 0) {
            return  "The rocket went!";
        } else {
            return "There is no ammunition";
        }
    }
    private String checkingCatapult(boolean catapult){
        if(catapult != false) {
            return "The ejection was successful";
        } else {
            return  "You don't have such a system";
        }
    }
    private String attackHalk(boolean catapult){
        if(!catapult){
          return  "You died!!! You were attacked by the Halk";
        }else {
            return  "You successfully ejected! The Halk didn't get you!\n";
        }
    }
}
