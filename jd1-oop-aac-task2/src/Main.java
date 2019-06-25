
public class Main {

	public static void main(String[] args) {
		
	        Wheel[] wheels = {
	                new Wheel(15),
	                new Wheel(15),
	                new Wheel(15),
	                new Wheel(15)
	        };
	        Engine engine = new Engine("Caterpiller", 6);
	        Car car = new Car("qq",12,"Cherry", engine, wheels);
	        car.ride();
	        car.coutBrand();
	        System.out.println(car);

	}

}
