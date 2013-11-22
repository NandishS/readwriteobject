import javax.swing.JOptionPane;


public class MethodDemo {

	public static int promptNumber() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number."));
	}
	
	public static int f(int x) {
		return x+1;
	}
	
	public static double squareRoot(double x) {
		return Math.sqrt(x);
	}
	
	public static void main(String [] args) {
		int input = promptNumber();
		System.out.println("The x+1 is " + f(input));
		System.out.println("The squareroot  is " + squareRoot(input));

	}
}
