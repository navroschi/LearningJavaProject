class BycicleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle(20, 5, 1);
        Bicycle bike2 = new Bicycle(10, 7, 1);
        Bicycle bike3 = new MountainBike(0, 0, 0, 0);

        // Invoke methods on 
        // those objects
        bike1.setCadence(50);
        bike1.speedUp(10);
        bike1.setGear(2);
        bike1.printStates();

        bike2.setCadence(50);
        bike2.speedUp(10);
        bike2.setGear(2);
        bike2.setCadence(40);
        bike2.speedUp(10);
        bike2.setGear(3);
        bike2.printStates();
        bike3.applyBrake(1);
        bike3.printStates();
    }
}