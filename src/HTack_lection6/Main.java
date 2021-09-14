package HTack_lection6;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        passenger.info();
        passenger.Ground(4, 22);
        passenger.Transport(200, 183, "Peugeot 3008", 1445);
        passenger.Passenger("SUV", 5);
        passenger.powerKilowatts();
        passenger.description();

        Passenger passenger2 = new Passenger();
        passenger2.Ground(4, 26);
        passenger2.Transport(180, 170, "Nisan", 1400);
        passenger2.Passenger("MPV", 5);
        passenger2.powerKilowatts();
        passenger2.description();

        Cargo cargo = new Cargo();
        cargo.info();
        cargo.Ground(10,27);
        cargo.Transport(475, 100,"МАЗ-5440М9", 8250);
        cargo.Cargo(40000);
        cargo.powerKilowatts();
        cargo.description();

        Cargo cargo2 = new Cargo();
        cargo2.Ground(10,25);
        cargo2.Transport(475, 100,"ВАЗ", 8200);
        cargo2.Cargo(35000);
        cargo2.powerKilowatts();
        cargo2.description();

        Civil civil = new Civil();
        civil.info();
        civil.Civil(236, true);
        civil.Transport(143, 871, "A321neo", 93500);
        civil.AirTransport(35.80, 300);
        civil.powerKilowatts();
        civil.description();

        Civil civil2 = new Civil();
        civil2.Civil(220, false);
        civil2.Transport(130, 700, "A320", 90000);
        civil2.AirTransport(35.80, 300);
        civil2.powerKilowatts();
        civil2.description();

        Military military = new Military();
        military.getInfoMilitary(true, 36);
        military.Transport(7700, 1010, "Northrop B-2 Spirit", 171000);
        military.AirTransport(52.12,  2240);
        military.powerKilowatts();
        military.description();

        Military military2 = new Military();
        military2.getInfoMilitary(false, 0);
        military2.Transport(6700, 914, "Boeing KC-46 Pegasus", 181610);
        military2.AirTransport(48.1,  2240);
        military2.powerKilowatts();
        military2.description();

        }
}