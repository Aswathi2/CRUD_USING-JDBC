package crud;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Update {
	ConnectionManager con=new ConnectionManager();
	void update1() throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the register number you want to update");
		int id1=s.nextInt();
		System.out.println("enter new user id");
		int id=s.nextInt();
		System.out.println("enter new name");
		String name=s.next();
		System.out.println("enter new password");
		String pw=s.next();
		PreparedStatement pr=(PreparedStatement) con.getConnection().prepareStatement("update login1 set ID=?,Name=?,Password=? where ID=?");
		pr.setInt(1,id);
		pr.setString(2,name);
		pr.setString(3,pw);
		pr.setInt(4,id1);

		pr.executeUpdate();
		con.getConnection().close();
		Choice ch=new Choice();
		ch.choice1();
		
	}

}
