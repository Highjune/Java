import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Vector;

public class Output {
	private Vector<Student> vector;
	private FileOutputStream fos;
	
	public Output(Vector<Student> vector) {
		this.vector = vector;
		try {
			fos = new FileOutputStream("C:/temp/Sungjukmgmt7result.txt", true);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public void output() {
		printlabel();
	}
	
	private void printlabel() {
		printlable
	}
	
	
	
}
