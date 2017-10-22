import java.util.Scanner;
public class Manager extends Staff
{
	public void job(String s)
	{
		this.position = s;
		System.out.println(this.position + " has management function to manage the department");
	}

/*	public void callOverJob(String s)
	{
		super.job(s);
	}
*/

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Staff or Manager? : ");
		String st = sc.next();
		if(st.equals("Manager"))
		{
			Staff m = new Manager();
			m.job(st);
		}
		else
		{
			Staff s = new Staff();
			s.job(st);
		}

	}
}