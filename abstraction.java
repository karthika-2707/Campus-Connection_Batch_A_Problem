abstract class Vehicle {
    abstract void start();   // Abstract method

    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Started");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
        obj.stop();
    }
}
