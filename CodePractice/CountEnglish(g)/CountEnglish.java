import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


	//constructor ������ (���� ���� ����)
	public class CountEnglish {
		//���Ϸκ��� �Է�, ǥ�����(ȭ�����)
		private BufferedInputStream bis;	//�������̹Ƿ� byte������ �о���� ���̰�, byte������ �ְ�θ��� BufferdInputStream(���۸��ؼ� �о���̴� ���̶� ȿ�� ����)
		
		private CountEnglish() throws IOException{//�ܺο��� ���������� ���� ���̴� private ������.
				File file = new File("usatoday.txt");
				this.bis = new BufferedInputStream(
						new FileInputStream(file));					
		}

	//Destructor �Ҹ���(���� �ݴ� ����)
	@Override
	protected void finalize() { //Object�� �ִ� ���̴�.
	if(this.bis != null) {//�������� �����ִٸ�
		try {
			this.bis.close();
		} catch (IOException e) {}
		}
	}	
	
	
	public static void main(String[] args) throws IOException {
		CountEnglish ce = new CountEnglish();
		int[] array = new int[52]; //�빮�� 26, �ҹ��� 26��, �迭�� Ÿ���� int�̹Ƿ� �� ���� 0���� �ʱ�ȭ �Ǿ��ִ�.
		int number = 0, count = 0; //count�� ��ü���ڸ� ����
		while((number = ce.bis.read()) >= 0) { //read()�� 1byte�� �о���δ�. -1�� ���� ������.
			if(number >=65 && number <=90) {//�빮�� (�迭 0~25������ �빮���� ��)
				array[number-65]++; count++;
			}else if (number >=97 && number <=122) {//�ҹ���(26~51������ �ҹ����� ��)
				array[number-71]++; count++;
			}
		}
		ce.print(array);
		System.out.println("Total Count = " + count);
	}
	
	private void print(int[] array) {
		int count = 0;
		for(int i=0 ; i<26 ; i++) { //�빮��
			System.out.printf("%c=%d\t", (char)(i+65), array[i]);
			count++;
			if(count % 5 ==0 ) System.out.println(); //���ٿ� 5���� ��� ���ؼ�.
		}
		
		System.out.println();
		
		count = 0;
		for(int i=26 ; i<array.length; i++) { //�ҹ���
			System.out.printf("%c=%d\t", (char)(i+71), array[i]);
			count++;
			if(count % 5 ==0 ) System.out.println();
		}
	}
	
}
	

	
	
	

