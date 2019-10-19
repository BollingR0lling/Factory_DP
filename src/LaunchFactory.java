public interface LaunchFactory {

    Wheel createWheel();
    Engine createEngine();
    Transmission createTransmission();

}

abstract class Wheel {
    String name;
    public String getName(){
        return name;
    }
}

abstract class Engine {
    String name;
    public String getName(){
        return name;
    }
}

abstract class Transmission {
    String name;
    public String getName(){
        return name;
    }
}