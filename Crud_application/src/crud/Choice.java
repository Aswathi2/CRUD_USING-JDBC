package crud;
import java.sql.SQLException;
import java.util.Scanner;
public class Choice {

	void choice1() throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("1.INSERT\n2.VIEW\n3.UPDATE\n4.DELETE\n5.LOGIN\n6.EXIT\nENTER YOUR CHOICE");
		int n=s.nextInt();
		if(n==1)
		{
			Insert in=new Insert();
			in.insert1();
		}
		else if(n==2)
		{
			View vi=new View();
			vi.view1();	
		}
		else if(n==3)
		{
			Update up=new Update();
			up.update1();
		}
		else if(n==4)
		{
			Delete de=new Delete();
			de.delete1();	
		}
		else if(n==5)
		{
			Login1 li=new Login1();
			li.login1();	
		}
		else
			System.exit(0);
	}

}
