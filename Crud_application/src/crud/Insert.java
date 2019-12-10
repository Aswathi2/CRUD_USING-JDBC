package crud;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Insert {
	
ConnectionManager con=new ConnectionManager();
	 void insert1() throws SQLException, ClassNotFoundException {
	Scanner s=new Scanner(System.in);
	
	Pattern p1 = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	String n1= "[A-Z][a-z]*";
	
	Pattern p=Pattern.compile(n1);
	System.out.println("enter the user id");
	int id=s.nextInt();
	System.out.println("enter the name");
	String name=s.next();
	System.out.println("enter the password");
	String pw=s.next();
	
	Matcher em1=p.matcher(name);
	Matcher em2=p1.matcher(pw);
	if(em1.matches()&&em2.matches())
	{
	PreparedStatement pr=(PreparedStatement) con.getConnection().prepareStatement("insert into login1(ID,Name,Password) values(?,?,?)");
	pr.setInt(1,id);
	pr.setString(2,name);
	pr.setString(3,pw);
	pr.executeUpdate();
	con.getConnection().close();
	}
	else
	{
		if(!em1.matches())
			System.out.println("invalid user name ");
		if(!em2.matches())
			System.out.println("invalid password ");
	}
	Choice ch=new Choice();
	ch.choice1();

}
}