import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

public class Output {
	private Vector<Student> vector;
	private FileOutputStream fos;
	
	public Output(Vector<Student> vector) {
		this.vector = vector;
		try {
			fos = new FileOutputStream("C:/temp/result.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
	
	public void output() {
		
		
	}
	
	public void printlabel() throws IOException{
		this.fos.write("     <<ssangyong high school>>".getBytes("UTF-8"));
		this.fos.write(10);
		this.fos.write("학번	이름	국어	영어	수학	총점	평균	평점".getBytes("UTF-8"));
		this.fos.write(10);
		this.fos.write("     <<ssangyong high school>>".getBytes("UTF-8"));
		this.fos.write(10);
		this.fos.flush();
	}
}
