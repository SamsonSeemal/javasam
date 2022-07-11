package P1;

public class Ola {

	public Car BookCar(int numberOfPassenger, int numberOfKms) {
		if(numberOfPassenger<=3) {
			return new HatchBack(numberOfKms);
		}
		else
		{
			return new Sedan(numberOfKms);
		}
	}
	
	public int calculateBill(Car car) {
		if(car instanceof Sedan) {
			return ((Sedan)car).farePerKm*car.getNumberOfKms();
		}
		else
		{
			return ((HatchBack)car).farePerKm*car.getNumberOfKms();
		}
	}
	
}
