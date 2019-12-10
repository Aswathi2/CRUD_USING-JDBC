package crud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Login1 {
	void login1() throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
	ConnectionManager con=new ConnectionManager();
	System.out.println("WELCOME TO LOGIN");
	System.out.println("enter the name");
	String name=s.next();
	System.out.println("enter the password");
	String pw=s.next();
	int flag=0;
	java.sql.Statement s1=con.getConnection().createStatement();
	ResultSet r=s1.executeQuery("select * from login1");
	while(r.next())
	{
		String name1=r.getString(2);
		String pw1=r.getString(3);
		if(name1.equals(name)&&pw1.equals(pw))
			flag=1;
			
	}
	if(flag==1)
		System.out.println("successfully verified");
	else
		System.out.println("not verified");
	
	Choice ch=new Choice();
	ch.choice1();
	}
}


