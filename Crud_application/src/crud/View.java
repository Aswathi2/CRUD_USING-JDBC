package crud;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View {
	ConnectionManager con=new ConnectionManager();
	void view1() throws ClassNotFoundException, SQLException {
		java.sql.Statement s1=con.getConnection().createStatement();
		ResultSet r=s1.executeQuery("select * from login1");
		while(r.next())
		{
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
		}
		Choice ch=new Choice();
		ch.choice1();
		}
	}


