package phone;

public class Galaxy extends Phone implements Ringable  {

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "Galaxy "+getVersionNumber()+" says " + getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "unlocking via finger print";
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy "+getVersionNumber()+" from "+getCarrier());
		
	}

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	

}
