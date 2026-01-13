package ejercicios5_4Visibilidad;

public class Motorbike {
	private int wheelCount;
	private double speed;
	private String color;
	
	public Motorbike(int wheelCount, String color) {
		this.wheelCount=wheelCount;
		this.color=color;
	}
	//Get
	int getWheelCount() {//Friendly
		return wheelCount;
	}
	public String getColor() {
		return color;
	}
	public double getSpeed() {
		return speed;
	}
	//Set
	public void setColor(String color) {
		this.color=color;
	}
	public void accelarete(double amount) {
		speed +=amount;
	}
	//toString
	@Override
    public String toString() {
        return String.format("Número de ruedas: %d, color: %s, velocidad: %.2f km/h", wheelCount, color, speed);
    }
}
