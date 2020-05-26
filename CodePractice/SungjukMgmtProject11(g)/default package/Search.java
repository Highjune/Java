import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class Search { //1���� �л��� ã�� ��
	private Scanner scan;
	private Connection conn;
	
	//primary key(�й�)���� �˻��ϴϱ� 1���� ���� ��.
	public Search(Scanner scan) { 
		this.scan = scan;
		this.conn = DBConnection.getConnection("mariadb.properties");  //3. 
	}
	
	public Student search() { //ã�� �л��� ����
		Statement stmt = null;
		ResultSet rs = null;
		Student s = null;
		try {
			stmt = this.conn.createStatement();    //4.
			System.out.print("ã������ �л��� �й� : ");
			String hakbun = this.scan.next();
			String sql = "SELECT hakbun, name, kor, eng, mat FROM project.Student " +
			                 "WHERE hakbun = '" + hakbun + "' ";
			rs = stmt.executeQuery(sql);   //5.  rs(Resultset)�� SELECT�� ������ �� �������.
			
			//�л��� ã���� ���, ã�� ���ڵ��� �� (�� �ٿ� hakbun, name, kor, eng, mat �� �������) �ٷ� ���� Ŀ���� ��ġ�� �ִ�.
			if(rs.next()) {  //�л��� ã���� ���  //6.
				s = new Student(rs.getString("hakbun"), rs.getString("name"),
						              rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"));
			}else { //ã�� �������� ���ڵ尡 ���� ���̰� �׷��� Ŀ���� next�� �� �� ����. �׷��� null�� �Ѿ ����. ���� s�� null�� �ʱ�ȭ�����ϱ�.(������)
				System.out.println("���ǿ� �´� �л��� ã�� ���߽��ϴ�. Ȯ�� �� �ٽ� �˻��� �ּ���.");
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}finally {
			DBClose.close(this.conn, stmt, rs);
		}
		return s;
	}
}
