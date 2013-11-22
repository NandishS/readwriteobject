import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;


public class UserList {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		// TODO Auto-generated method stub
		User tanes = new User("Faculty", "Tanes", "pw");
		User Jae = new User("Studnet", "Jae", "pw");
		User lincoln = new User("Student", "Lincoln", "pw");
		
		ArrayList aList = new ArrayList();
		aList.add(tanes);
		aList.add(lincoln);
		aList.add(Jae);
		
		System.out.println(aList);
		
		aList.remove(0);
		System.out.println(aList);
		aList.remove(0);
		System.out.println(aList);
		System.out.println(aList.contains(Jae));

		LinkedList aLL = new LinkedList();
		aLL.add(tanes);
		System.out.println("LinkeList");
		System.out.println(aLL);
		System.out.println(aLL.contains(Jae));
		
		
		
		ObjectOutputStream output;
		try {
			output = new ObjectOutputStream(new FileOutputStream("AList.dat"));
			 output.writeObject(aList);
			 System.out.println("Save file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList bList;
		ObjectInputStream input;
		try {
			input = new ObjectInputStream(new FileInputStream("AList.dat"));
			 bList = (ArrayList)input.readObject();
			 System.out.println(bList.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
