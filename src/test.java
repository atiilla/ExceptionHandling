
public class test {

	public static void main(String[] args) {
		
		
		try {
			learnAtCertainTemperature(300);
		} catch (ExtremeHeatException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void learnAtCertainTemperature(int temperature) throws ExtremeHeatException {
		if(temperature>5 && temperature<28) {
			System.out.println("nice temp for learning");
			System.out.println("######################");
			
		}
		else {
			throw new ExtremeHeatException();
	
}
}}