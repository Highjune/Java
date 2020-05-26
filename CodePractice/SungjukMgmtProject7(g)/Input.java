import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


public class Input {
	private Scanner scan;
	private Vector<Student> vector;
	private FileInputStream fis; 
	
	public Input(Vector<Student> vector) {   //Constructor
		this.scan = new Scanner(System.in);
		this.vector = vector;
		try {
			this.fis = new FileInputStream("C:/temp/sungjuk.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	
	
	public void input() {
		try {
		byte[] buffer = new byte[this.fis.available()]; //available�� Ư���� ���� �� �� �� ���, text���Ͽ��� �о���� �� �ִ� ����. �� �縸ŭ�� �ѹ��� �о�鿩�� �� �����. ��� ��õ�ϴ� �����x. ���� ������ ��û ũ�� ������ �ȴ�. 
		int number = this.fis.read(buffer);//buffer��� �ϴ� ����Ʈ �迭�� �����.
		String str = new String(buffer, 0, number); //������ ���� ����Ʈ �迭�� string���� ���� �� �����ڸ� ����. �Ķ����(�����͹迭, ó��, �)
		StringTokenizer st = new StringTokenizer(str, "\n"); //��ü�� 3���̴ϱ� �� 1���� countTokens�� �ȴ�.
		String [] array = new String[st.countTokens()]; //�� 3���� ���� �����.
		for(int i=0; i<array.length;i++) {
			array[i] = st.nextToken();  //array[0] = 2019-01	������	45 67 98
			Scanner scan = new Scanner(array[i]).useDelimiter("\\s+");
			Student student = new Student(scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());
			this.vector.addElement(student);
		}
		
		}catch(IOException ex) {
			System.out.println(ex);
			 
		}
	}
}
