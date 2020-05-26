

public class Employee extends Person implements IPerson{
	private String empno; //멤버변수는 무조건 private!!!
	private double salary;
		
//	Employee(){};
	
	Employee(String name, int age, String address, String empno, double salary){
//		super(name, age, address);
		this.empno = empno;
		this.salary = salary;

	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {		
		this.salary = salary;
	}
//	@Override
//	public String toString() {
//		return super.toString() + "\nEmployee [empno=" + empno + ", salary=" + salary + "]";  //부모가 abstract되서 안 됨.
//	};

	public void printInfo() {
		System.out.println("사번 = " + empno + ",봉급 = " + salary);
		
	}
	@Override
	public String toString() {
		return String.format("%s, %d, %s, %s, %.1f\n", getName(), getAge(), getAddress(), empno, salary);  //empno, salary는 같은 식구니까 들고오는 것! 
	}//getname getage getaddress들은 부모꺼 들고 오기 때문에~바로 쓸 수 있다.
	
	
}