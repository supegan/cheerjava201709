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

	public void assignJob(){
		System.out.println("指派"+name+"担任"+job);
	}

	public static void main(String[] args){
		Applicant al=new Applicant();
		Scanner sc=new Scanner(System.in);

		System.out.println("求职者姓名：");
		al.name=sc.next();
		System.out.println("求职者性别：");
		al.sex=sc.next();
		System.out.println("求职者年龄：");
		al.age=sc.nextInt();
		System.out.println("身份证号码：");
		al.ID=sc.nextInt();
		System.out.println("求职者学历：");
		al.education=sc.next();
		System.out.println("求职者住址：");
		al.address=sc.next();
		System.out.println("求职者身高：");
		al.height=sc.nextInt();
		System.out.println("求职者体重：");
		al.weight=sc.nextInt();
		System.out.println("手机号码：");
		al.cellnum=sc.nextInt();
		System.out.println("计划指派岗位：");
		al.job=sc.next();
		
		al.assignJob();
	}
}