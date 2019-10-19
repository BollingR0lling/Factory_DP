public class main {

    public static void main(String[] args) {
        BMW_CAR bmw_car = new BMW_CAR();
        AUDI_CAR audi_car = new AUDI_CAR();
        PrintDetails(bmw_car);
        PrintDetails(audi_car);

    }

    public static void PrintDetails(LaunchFactory factory) {
        Wheel wheel = factory.createWheel();
        Engine engine = factory.createEngine();
        Transmission transmission = factory.createTransmission();
        System.out.print("-----Ваша машина состоит из-----\n");
        System.out.println("" + wheel.getName());
        System.out.println("" + engine.getName());
        System.out.println("" + transmission.getName());
        System.out.print("--------------------------------\n");

    }

}

class BMW_CAR implements LaunchFactory {

    public Wheel createWheel() {
        return new BMW_WHEEL() {
        };
    }

    public Engine createEngine() {
        return new BMW_ENGINE() {
        };
    }

    public Transmission createTransmission() {
        return new BMW_TRANSMISSION() {
        };
    }
}


class AUDI_CAR implements LaunchFactory {

    public Wheel createWheel() {
        return new AUDI_WHEEL() {
        };
    }

    public Engine createEngine() {
        return new AUDI_ENGINE() {
        };
    }

    public Transmission createTransmission() {
        return new AUDI_TRANSMISSION() {
        };
    }
}

abstract class BMW_WHEEL extends Wheel {
    public String getName() {
        return "BMW_WHEEL";
    }
}

abstract class BMW_ENGINE extends Engine {
    public String getName() {
        return "BMW_ENGINE";
    }
}

abstract class BMW_TRANSMISSION extends Transmission {
    public String getName() {
        return "BMW_TRANSMISSION";
    }
}

abstract class AUDI_WHEEL extends Wheel {
    public String getName() {
        return "AUDI_WHEEL";
    }
}

abstract class AUDI_ENGINE extends Engine {
    public String getName() {
        return "AUDI_ENGINE";
    }
}

abstract class AUDI_TRANSMISSION extends Transmission {
    public String getName() {
        return "AUDI_TRANSMISSION";
    }
}

