
public class ExceptApp {

	public static void main(String[] args) {
		
		try {
			ExceptionMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	public static void ExceptionMethod() {
		String s= null;
		System.out.println(s.length());
	}
}
