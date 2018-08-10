import java.util.Scanner;

public class AnExceptionGeneric {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		int num;
		int den;
		try {
			num = Integer.parseInt(key.next());
			den = Integer.parseInt(key.next());
			int div = num / den;
			System.out.format("%d/%d=%d", num,den,div);
		} catch (Throwable t) {
			System.out.println("Error Log: "+ t);
			
		}finally {
			key.close();
		}
		
		
		

	}

}
