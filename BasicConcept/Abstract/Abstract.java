//�ڹ��� ���� p377
//�߻�ȭ (�������� ����ȭ)
//�ڽ��� ���Ƽ� �װ��� ���� ��ü ����. �׷��� �ݵ�� (��ü�� ������) �ڽ��� ���ƾ� �ȴ�. �ڱ��ڽ�(�θ�)�� ��ü�� ������(�߻��̴ϱ�)

public class Abstract {
	public static void main(String[] args) {
//		Birds buz = new Birds(); 	 //�ϸ� ������
		Birds buz = new Sparow(); 	 
		
		buz.display();
		
	}
}

abstract class Birds{   //abstract�� ���̸� ������ �������� �ʱ� ������ ��ü ������ new Birds(); ��ü�� �ȵȴ�.
	int numOfWings = 2;
	public void display() {
		System.out.println("���� ����.");
	}
}
class Sparow extends Birds{
		
}