
public class District {
	
	private String district;

	public District(String district) {
		
		this.district = district;
		
	}

	public String getDistrict() {
		return district;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((district == null) ? 0 : district.hashCode());
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
		District other = (District) obj;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [district=" + district + "]";
	}
}
