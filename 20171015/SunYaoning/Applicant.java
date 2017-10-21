import java.util.Scanner;
public class Applicant{
	String name;
	String sex;
	int age;
	int ID;
	String education;
	String experience;
	String address;
	int height;
	int weight;
	int cellnum;
	String job;

	public void jobseeker(){
		Scanner sc=new Scanner(System.in);

		System.out.println("求职者姓名：");
		this.name=sc.next();
		System.out.println("求职者性别：");
		this.sex=sc.next();
		System.out.println("求职者年龄：");
		this.age=sc.nextInt();
		System.out.println("身份证号码：");
		this.ID=sc.nextInt();
		System.out.println("求职者学历：");
		this.education=sc.next();
		System.out.println("求职者住址：");
		this.address=sc.next();
		System.out.println("求职者身高：");
		this.height=sc.nextInt();
		System.out.println("求职者体重：");
		this.weight=sc.nextInt();
		System.out.println("手机号码：");
		this.cellnum=sc.nextInt();
	}

	public void assignJob(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("计划指派岗位：");		
		this.job=sc.next();
		System.out.println("指派"+name+"担任"+job);
	}

	public static void main(String[] args){
		Applicant al=new Applicant();
		
		al.jobseeker();
		al.assignJob();
	}
}