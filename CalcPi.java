// great work!!
// Computes an approximation of PI.
//  צריך לשים 5 רווחים בשורה השנייה של הפלט אחרי :approximated ורווח אחד בשורה הראשונה
public class CalcPi {
	public static void main(String [] args) { 
		int N = Integer.parseInt(args[0]);
		double x = 1.0;
		double sum = 0.0;
		// calculating PI by the formula.
		for (int i = 0; i<= N-1; i++){
			sum = sum + Math.pow(-1, i)/x;
			x = x + 2;
		}
		sum = sum*4;
		System.out.println("pi according to Java: " + Math.PI + "\npi, approximated:     " + sum);
	}
}

