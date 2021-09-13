package HTack_lection6;

public class Military extends Air {
    boolean catapult = true;
    int rockets;
    double answer;
    int checkRockets = 36;
    String halk = "OH, NO!!!HAAAAALK!!!";

    void getInfoMilitary(boolean catapult, int rockets) {
        this.catapult = catapult;
        this.rockets = rockets;
    }

    public void description() {
        System.out.println("[ Wingspan: " + this.wingspan);
        System.out.println("Minimum runway length" + this.minRunwayLength);
        System.out.println("Weight: " + this.weight);
        System.out.println("Power: " + this.power);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Mark: " + this.mark);
        System.out.println("Passengers: " + this.catapult);
        System.out.println("Business class: " + this.rockets);
        System.out.println("Power in kilowatts: " + this.answer + " ]");
        System.out.println(shot(this.checkRockets));
        System.out.println("System of catapult: " + checkingCatapult(this.catapult));
        System.out.println(this.halk +"\n" + attackHalk(this.catapult));
    }
    public void powerKilowatts() {
        answer = 0.74 * power;

    }
    private String shot(int checkRockets) {
        String answer2;
        if (checkRockets != 0) {
            answer2 = "The rocket went!";
        } else {
            answer2 = "There is no ammunition";
        }
        return answer2;
    }
    private String checkingCatapult(boolean catapult){
        String answer3;
        if(catapult != false) {
            answer3 = "The ejection was successful\n";
        } else {
            answer3 = "You don't have such a system\n";
        }
        return answer3;
    }
    private String attackHalk(boolean catapult){
        String answer4;
        if(!catapult){
            answer4 = "You died!!! You were attacked by the Halk\n";
        }else {
            answer4 = "You successfully ejected! The Halk didn't get you!\n";
        }
        return answer4;
    }
}
