
public class Main {

	public static void main(String[] args) {

		Process countryName = new Process();
		countryName.setCountry("Республика Беларусь");

		//If you need printing list about information of region, 
		//you can change "setPrint" on true.
		Process.setPrint(false);
		//Create head of Region and create array of region
		Process.generateHead();


	}

}
