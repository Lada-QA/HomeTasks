package HTack_lection6;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        passenger.info();
        passenger.getInfoGround(4, 22);
        passenger.getInfo(200, 183, "Peugeot 3008", 1445);
        passenger.getInfoPassenger("SUV", 5);
        passenger.powerKilowatts();
        passenger.description();

        Passenger passenger2 = new Passenger();
        passenger2.getInfoGround(4, 26);
        passenger2.getInfo(180, 170, "Nisan", 1400);
        passenger2.getInfoPassenger("MPV", 5);
        passenger2.powerKilowatts();
        passenger2.description();

        Cargo cargo = new Cargo();
        cargo.info();
        cargo.getInfoGround(10,27);
        cargo.getInfo(475, 100,"МАЗ-5440М9", 8250);
        cargo.getInfoCargo(40000);
        cargo.powerKilowatts();
        cargo.description();

        Cargo cargo2 = new Cargo();
        cargo2.getInfoGround(10,25);
        cargo2.getInfo(475, 100,"ВАЗ", 8200);
        cargo2.getInfoCargo(35000);
        cargo2.powerKilowatts();
        cargo2.description();

        Civil civil = new Civil();
        civil.info();
        civil.getInfoCivil(236, true);
        civil.getInfo(143, 871, "A321neo", 93500);
        civil.getInfoAir(35.80, 300);
        civil.powerKilowatts();
        civil.description();

        Civil civil2 = new Civil();
        civil2.getInfoCivil(220, false);
        civil2.getInfo(130, 700, "A320", 90000);
        civil2.getInfoAir(35.80, 300);
        civil2.powerKilowatts();
        civil2.description();

        Military military = new Military();
        military.getInfoMilitary(true, 36);
        military.getInfo(7700, 1010, "Northrop B-2 Spirit", 171000);
        military.getInfoAir(52.12,  2240);
        military.powerKilowatts();
        military.description();

        Military military2 = new Military();
        military2.getInfoMilitary(false, 0);
        military2.getInfo(6700, 914, "Boeing KC-46 Pegasus", 181610);
        military2.getInfoAir(48.1,  2240);
        military2.powerKilowatts();
        military2.description();

        }
}