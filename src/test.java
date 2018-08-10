
public class test {

	public static void main(String[] args) {
		
		
		try {
			learnAtCertainTemperature(300);
		} catch (ExtremeHeatException e) {
			ExtremeHeatException ex =  new ExtremeHeatException("aaaaaa");
			ex.errormsg();
			System.out.println(ex.getMessage());
			e.printStackTrace();
			e.getCause();
			
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