
public class Region {

	private String regionName;
	private double square;
	private double population;
	
	public Region (String regionName, double square, double population ) {
		this.regionName = regionName;
		this.square = square;
		this.population = population;
	}

	public String getRegionName() {
		return regionName;
	}

	public double getSquare() {
		return square;
	}
	
	public double getPopulation() {
		return population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((regionName == null) ? 0 : regionName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (regionName == null) {
			if (other.regionName != null)
				return false;
		} else if (!regionName.equals(other.regionName))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", square=" + square + "]";
	}

	
	
}
