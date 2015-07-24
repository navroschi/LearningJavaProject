public class BycicleDemo {

    public static Bicycle createBycicle(int[] bicycleType) {
    	Bicycle bikeCreated = new Bicycle(bicycleType[0], bicycleType[1], bicycleType[2]);
    	return bikeCreated;    	
    }
    
	public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        int[] bicycleType = {30, 10, 2};
		
		Bicycle bike1 = new Bicycle(20, 5, 1);
        Bicycle bike2 = new Bicycle(10, 7, 1);
        Bicycle bike3 = new MountainBike(0, 0, 0, 0);
        Bicycle bike4 = createBycicle(bicycleType);
        
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
        if (bike3.getSpeed() < 0){
        	bike3.setSpeed(0);
        }
        bike3.printStates();
        bike4.printStates();
    }
}