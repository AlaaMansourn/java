package phone;

public class IPhone extends Phone implements Ringable{

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "Iphone "+getVersionNumber()+" says " + getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		System.out.println("Iphone "+getVersionNumber()+" from "+getCarrier());
		
	}
	
	
	

}
