package hw3;

public class Car implements Drivable {
	String color;
	String make;
	String model;
	boolean EngineStatus;
	
	public Car(String color, String make,String model, boolean EngineStatus) {
		
		this.color=color;
		this.make=make;
		this.model=model;
		this.EngineStatus=EngineStatus;
	}
	public String getColor() {
		
		return color;
		}
	public String getMake() {
		
		return make;
		}
	public String getModel() {
		
		return model; 
		}
	public boolean getEngineStatus() {
		return EngineStatus;
		
	}
	public String toString() {
		return "The Color of the car is "+getColor()+", the make is "+getMake()+", the Model is "+getModel()+", and the Engine Status is "+getEngineStatus();
	}
	public boolean equals(Car other) {
		if (color==other.color && make==other.make && model==other.model && EngineStatus==other.EngineStatus)
		{ return true; }
		else { return false; }
		

} 
	}
