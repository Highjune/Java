import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

public class Output {
	private FileOutputStream fos;
	private Vector<Student> vector;
	
	public Output(Vector<Student> vector) {		
		this.vector = vector;
		try {
			fos = new FileOutputStream("C:/temp/result.txt", true);
		}catch(IOException e) {
			System.out.println("File not found");
		}
	}
	
	public void output() {
		try {
		printlabel();
		for(Student s : this.vector) {
			this.fos.write(s.toString().getBytes("UTF-8"));
			this.fos.write(10);
		}
			this.fos.flush();
			System.out.println("File Save Success");
			
		}catch(IOException ex) {
			System.out.println(ex);
		}finally {
			try {
				this.fos.close();
			}catch(IOException ex2) {
				System.out.println(ex2);
			}
		}
		
	}
	
	public void printlabel() throws IOException{
		this.fos.write("---------------------------------------".getBytes("UTF-8"));
		this.fos.write(10);
		this.fos.write("------------성적관리프로젝트7---------------".getBytes("UTF-8"));
		this.fos.write(10);
		this.fos.write("kor	eng	mat	tot	avg	grade".getBytes("UTF-8"));
		this.fos.write(10);
	}
}
