import java.util.Arrays;
import java.util.Objects;

public class Car {
	
    private String id;
    private double fuel = 0;
    private final String brand;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String id, double fuel, String brand, Engine engine, Wheel[] wheels) {
    	
        this.id = id;
        this.fuel = fuel;
        this.brand = brand;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void ride(){
        if(wheels.length != 4 || engine == null)
            throw new RuntimeException();
        for(Wheel wheel:wheels)
            if(wheel == null)
                throw new RuntimeException();
        fuel -= engine.work();
        System.out.println(fuel);
        if(fuel < 0){
            fuel = 0;
            throw new RuntimeException();
        }
    }

    public void changeWheel(Wheel wheel, int pos){
        wheels[pos] = wheel;
    }

    public void fill(double fuel){
        if(fuel<0)
            throw new RuntimeException();
        this.fuel += fuel;

    }

    public void coutBrand(){
        System.out.println(brand);
    }

    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return  Objects.equals(id, car.id) &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, fuel, brand, engine);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }
    
    @Override
    public String toString() {
        return brand + " " + this.id + " (motor: " + engine.id + ")";
    }
}