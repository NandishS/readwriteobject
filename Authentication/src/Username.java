import javax.swing.JOptionPane;


public class Username 
{

	
	/* This program will ask the user to input their username and then their password.  If the password is incorrect three times in a row, then the program will exit. */
	
	
	public static void main(String[] args) 
	{
		
		// Asking the user to input their username.
		
		String username = (JOptionPane.showInputDialog("Input Username"));
		int i = 0;
		
		// Program determines which account the user belongs too.
		
		if (username.equalsIgnoreCase("admin"))
		{
			// The progam then asks the user for the correct password. They have 3 tries.
			
			do{
			String password = (JOptionPane.showInputDialog("Input Password."));
			if (password.equalsIgnoreCase("adminpassword"))
			{
				JOptionPane.showMessageDialog(null, "Welcome Admin!");
				i=3;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Password.");
				i++;
			}}while (i<3);
		}
		
		// There are two other accounts the user can log into.  "Student" and "Staff."
		
		else if (username.equalsIgnoreCase("student"))
		{
			do{
			String password = (JOptionPane.showInputDialog("Input Password."));
			if (password.equalsIgnoreCase("studentpassword"))
			{
				JOptionPane.showMessageDialog(null, "Welcome Student!");
				i=3;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Password.");
				i++;
			}}while (i<3);
		}
		
		else if (username.equalsIgnoreCase("staff"))
		{	
			do{
			String password = (JOptionPane.showInputDialog("Input Password."));
			if (password.equalsIgnoreCase("staffpassword"))
			{
				JOptionPane.showMessageDialog(null, "Welcome Staff!");
				i=3;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Password.");
				i++;
			}}while (i<3);
		}
		
		// If the username was incorrect, then the program will exit.
		
		else
			JOptionPane.showMessageDialog(null, "Invalid Username.");
			System.exit(0);
		
		
	}

}

