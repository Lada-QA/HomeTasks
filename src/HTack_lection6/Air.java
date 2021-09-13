package HTack_lection6;

public class Air extends Transport{
    double wingspan;
    int minRunwayLength;

      void getInfoAir(double wingspan, int minRunwayLength){
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
     }

    void info() {
        System.out.println("Air transport");
    }
}
