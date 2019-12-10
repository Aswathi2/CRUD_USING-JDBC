package crud;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Delete {
	ConnectionManager con=new ConnectionManager();
	void delete1() throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the register number you want to update");
		int id1=s.nextInt();
		PreparedStatement pr=(PreparedStatement) con.getConnection().prepareStatement("delete from login1 where ID=?");
		pr.setInt(1,id1);
		pr.executeUpdate();
		con.getConnection().close();
		System.out.println("data deleted successfully");
		Choice ch=new Choice();
		ch.choice1();
	}

}
