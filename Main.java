import com.transport.*;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("3310", "Bus", "Ground", "public transport", 4, 6, 15);
        System.out.println(bus);
        Trolleybus trolleybus =new Trolleybus("TrolleyItal", "Trolleybus", "Ground", "public transport", 4, 9, 11);
        System.out.println(trolleybus);
        Tank tank = new Tank("Abrams", "Tank", "Ground", "military transport", 2, 122, 17);
        System.out.println(tank);
        Bomber bomber = new Bomber("F-16", "Bomber", "Air", "military transport", 2, 20);
        System.out.println(bomber);
        Engine engine = new Engine("Star", "engine", "Ground", "public transport", 48, 20);
        System.out.println(engine);
        Steamship steamship = new Steamship("Blue Sea", "Steamship", "Water","public transport", 0, 11, 32);
        System.out.println(steamship);
    }
}

class Bus extends Transport implements PublicTransport {
    private int numberOfPassengers;
    private int numberOfFreeSeats;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getNumberOfFreeSeats() {
        return numberOfFreeSeats;
    }

    public Bus(String nameOfVehicle, String vehicle, String environmentOfMovement, String purposeOfTransport, int byNumberOfWheel, int numberOfPassengers, int numberOfFreeSeats) {
        super(nameOfVehicle, vehicle, environmentOfMovement, purposeOfTransport, byNumberOfWheel);
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfFreeSeats = numberOfFreeSeats;
    }

    @Override
    public void move() {
        System.out.println("Move on ground");
    }
    public void loadingPeopleIntoTransport(){
        System.out.println("People enter transport");
    }
    public void unloadingPeopleIntoTransport(){
        System.out.println("People get out of transport");
    }

    @Override
    public String toString(){
        return publicTransport;
    }
}

class Trolleybus extends Transport implements PublicTransport{
    private int numberOfPassengers;
    private int numberOfFreeSeats;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getNumberOfFreeSeats() {
        return numberOfFreeSeats;
    }

    public Trolleybus(String nameOfVehicle, String vehicle, String environmentOfMovement, String purposeOfTransport, int byNumberOfWheel, int numberOfPassengers, int numberOfFreeSeats) {
        super(nameOfVehicle, vehicle, environmentOfMovement, purposeOfTransport, byNumberOfWheel);
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfFreeSeats = numberOfFreeSeats;
    }

    @Override
    public void move() {
        System.out.println("Move on ground");
    }
    public void loadingPeopleIntoTransport(){
        System.out.println("People enter transport");
    }
    public void unloadingPeopleIntoTransport(){
        System.out.println("People get out of transport");
    }

    @Override
    public String toString(){
        return publicTransport;
    }
}

class Tank extends Transport implements Enginery{
    private int barrelCaliber;
    private int massOfTheTank;

    public int getBarrelCaliber() {
        return barrelCaliber;
    }

    public int getMassOfTheTank() {
        return massOfTheTank;
    }

    public Tank(String nameOfVehicle, String vehicle, String environmentOfMovement, String purposeOfTransport, int byNumberOfWheel, int barrelCaliber, int massOfTheTank) {
        super(nameOfVehicle, vehicle, environmentOfMovement, purposeOfTransport, byNumberOfWheel);
        this.barrelCaliber = barrelCaliber;
        this.massOfTheTank = massOfTheTank;
    }
    @Override
    public void move() {
        System.out.println("Move on ground");
    }

    public void fire() {
        System.out.println("Fire");
    }
    @Override
    public String toString(){
        return enginery;
    }
}

class Bomber extends Transport implements Enginery{
    private int numberOfMissiles;

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public Bomber(String nameOfVehicle, String vehicle, String environmentOfMovement, String purposeOfTransport, int byNumberOfWheel, int numberOfMissiles) {
        super(nameOfVehicle, vehicle, environmentOfMovement, purposeOfTransport, byNumberOfWheel);
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public void move(){
        System.out.println("Flying in sky");
    }

    public void fire(){
        System.out.println("Fire");
    }

    @Override
    public String toString(){
        return enginery;
    }
}

class Engine extends Transport implements SteamTechnology{
    private int numberOfWagons;

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public Engine(String nameOfVehicle, String vehicle, String environmentOfMovement, String purposeOfTransport, int byNumberOfWheel, int numberOfWagons) {
        super(nameOfVehicle, vehicle, environmentOfMovement, purposeOfTransport, byNumberOfWheel);
        this.numberOfWagons = numberOfWagons;
    }
    @Override
    public void move(){
        System.out.println("Move on ground");
    }

    public void throwCoals(){
        System.out.println("Throw coals into the furnace");
    }

    @Override

    public String toString(){
        return steamTechnology;
    }
}

class Steamship extends Transport implements SteamTechnology{
    private int numberOfPassengers;
    private int numberOfFreeSeats;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getNumberOfFreeSeats() {
        return numberOfFreeSeats;
    }

    public Steamship(String nameOfVehicle, String vehicle, String environmentOfMovement, String purposeOfTransport, int byNumberOfWheel, int numberOfPassengers, int numberOfFreeSeats) {
        super(nameOfVehicle, vehicle, environmentOfMovement, purposeOfTransport, byNumberOfWheel);
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfFreeSeats = numberOfFreeSeats;
    }

    @Override
    public void move() {
        System.out.println("Move on water");
    }

    public void throwCoals(){
        System.out.println("Throw coals into the furnace");
    }

    @Override
    public String toString(){
        return steamTechnology;
    }
}