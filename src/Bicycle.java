public class Bicycle {
	// the Bicycle class has
    // three fields
	
    private int cadence;
    private int speed;
    private int gear;
    
    // the bicycle class has 
    // two constructors
    public Bicycle (int startCadence, int startSpeed, int startGear){
    	gear = startGear;
    	cadence = startCadence;
    	speed = startSpeed;
    }
    
    public Bicycle() {
        gear = 1;
        cadence = 10;
        speed = 0;
    }
    
    //Bicycle class has
    // six methods
    
    public int getCadence() {
        return cadence;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear() {
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
    
    public void setSpeed(int newValue){
    	speed = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public void printStates() {
    	System.out.println("The speed we are running is " + speed + " in the gear " + gear + " with cadence " + cadence);
    }
}