import java.util.Scanner;
public class Recruit
{
	String name;
	String sex;
	String race;
	String marry;
	String id;
	int age;
	int height;
	int weight;
	String cellPhone;
	String address;
	String job;
	
	public void arrangeJob(String s)
	{
		this.job = s;
		System.out.println("\n" + this.name + " will be recruited as " + this.job + " !!");
	}

	public static void main(String[] args)
	{
		Recruit rc = new Recruit();
		Scanner sc = new Scanner(System.in);
		System.out.print("please input the name:\t");
		rc.name = sc.next();
		System.out.print("please input the sex(male or female):\t");
		rc.sex = sc.next();
		System.out.print("please input the race:\t");
		rc.race = sc.next();
		System.out.print("please input the status of marry(yes or no):\t");
		rc.marry = sc.next();
		System.out.print("please input the id number:\t");
		rc.id = sc.next();
		System.out.print("please input the age:\t");
		rc.age = sc.nextInt();
		System.out.print("please input the height:\t");
		rc.height = sc.nextInt();
		System.out.print("please input the weight:\t");
		rc.weight = sc.nextInt();
		System.out.print("please input the cellPhone number:\t");
		rc.cellPhone = sc.next();
		System.out.print("please input the address:\t");
		rc.address = sc.next();

		System.out.print("please input the Job vacancy:\t");
		String s = sc.next();
		rc.arrangeJob(s);

	}
}