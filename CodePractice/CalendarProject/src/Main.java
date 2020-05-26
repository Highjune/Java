import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ��, �� �� ? : ");
		int year = scan.nextInt(); int month = scan.nextInt();
		Main m = new Main();
		int space  = m.getWeekday(year, month);
		int maxday = m.getMaxDay(year,  month);
		m.display(space, maxday);
	}
	
	void display(int space, int maxday) {// �޷��� �׸��� method�� // space�� ó���� ��ĭ����� �Ǵ���.
		//ù ��...
		System.out.println("��\t��\t��\t�\t��\t��\t��");
		System.out.println("--------------------------------------------------------------------");
		int count = 0;
		for(int i = 0 ; i<space; i++) {
			System.out.print("��\t"); count++; //���������� count�� ��Ƹ���.
		}
		for(int i = 1 ; i<=maxday ; i++) {
			System.out.print(i+"\t"); count++; //i�� 1�̴ϱ� 
			if(count % 7 ==0) {
				System.out.println();
			}
		}
	}
	
	
	//������ �� �� ����ϱ�
	// �������� ���鿡 �� �������� ������ �� ������ �Ŀ� count=0 ���� �ʱ�ȭ �ϰ� ��ü-count �� �ϸ� �ȴ�. �׷��� 
		//����ϳ� ������ �������� �װ� �ȵǴµ�, ����ϳ� ������ ������ ������ߵȴ�.
//	if(count != 0) {
//		for(int i = 0 ; i<(7-count) ; i++) {
//			System.out.print("��\t");
//		}
//		}
//	
	
	
	int getWeekday(int year, int month) {  //�ش��ϴ� ���� 1���� ���� �������� �˷���
		//1. �� ���� ����ϱ�
		int sum = 0;
		for(int i = 1 ; i<year ; i++) {  //���� 1����� �۳���� �� ��, �����̸� 366�� �ƴϸ� 365�� ����
			if(isLeapYear(i)) sum += 366;
			else sum += 365; //�ش��ϴ� ���� �� �� ���� 12�� 31�ϱ��� �� ������
		}
		for(int i = 1 ; i <=month ; i++) {
			sum += getMaxDay(year, i);  // �ش��ϴ� ���� 1������ �ش��ϴ� ���� �� �� ������ �� ����
		}
		sum++; //�Ϸ縸 ���ϸ� ��. ex) 6�� ������ �� ���ϰ�, 7�� 1���� ���ؾ� �ϴϱ� +1 �ϸ� 7/1���� �ȴ�.
		return sum % 7 ;	//�� �������� �Ͽ���, 1�� ������ ������ ~ (��κ��� �޷��� �Ͽ��Ϻ��� �����ϴ� ����=�Ͽ����� 7�� ���� ������)
	}
	int getMaxDay(int year, int month) {
		int maxday = 0;
		switch(month) {//switch, if else, 3�� ������ �� ���� �� ����
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: maxday = 31; break;
		case 4:
		case 6:
		case 9:
		case 11: maxday = 30; break;
		case 2:
			if(isLeapYear(year)) maxday = 29;
			else maxday = 28;
			break;
		}
		return maxday;
	}
	boolean isLeapYear(int year){ // �������� ���� Ȯ��, is~??�� ���� boolean �� ����
		//Parameter�� ���� �⵵�� �����̶�� true, �׷��� ������ false�� �����ϱ�
		if((year%400 == 0) || (year%4 ==0 && year % 100 != 0))
			return true; //if�� �����ϸ� true, 
		else return false; // if�� �������ϸ� false; //������ return �ؿ� �ƹ��͵� ���� �ȵǴµ� ���ǹ� �ȿ� ~
	}
}
	//static���� �� ���� �� �������� member�� �� ������, static�� �����ϱ� ������ ������ �����.
	//main�� �������� ����. main�� �� �ϵ��� outsourcing
	//���������� ���鿡�� �� ��������? 
	
	