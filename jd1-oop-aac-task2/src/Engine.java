import java.util.Objects;

public class Engine {

	    public String id;
	    private double fuelForWork;

	    public Engine(String id, double fuelForWork) {
	        this.id = id;
	        this.fuelForWork = fuelForWork;
	    }

	    public double work(){
	        return fuelForWork;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Engine engine = (Engine) o;
	        return Objects.equals(id, engine.id);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

		@Override
		public String toString() {
			return "Engine [id=" + id + ", fuelForWork=" + fuelForWork + "]";
		}
	    
}
