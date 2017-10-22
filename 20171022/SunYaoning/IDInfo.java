import java.util.Scanner;
public class IDinfo{
	private String name;
	private String sex;
	private String race;
	private String birthday;
	private String address;
	private String IDnum;
	Scanner sc=new Scanner(System.in);

	private void inputinfo(){
		System.out.println("请输入姓名：");
		String name=sc.next();
		this.name=name;
		System.out.println("请输入性别：");
		final String sex=sc.next();
		this.sex=sex;
		System.out.println("请输入民族：");
		final String race=sc.next();
		this.race=race;
		System.out.println("请输入出生日期：");
		final String birthday=sc.next();
		this.birthday=birthday;
		System.out.println("请输入住址：");
		String address=sc.next();
		this.address=address;
		System.out.println("请输入公民身份证号码：");
		String IDnum=sc.next();
		this.IDnum=IDnum;
	}

	public String toString(){
		System.out.println("\n证件信息为：\n姓名 "+name+"\n性别 "+sex+"\n民族 "+race+"\n出生 "+birthday+"\n住址 "+address+"\n公民身份证号码 "+IDnum);
		return "s";
	}

	public static void main(String[] args){
		IDinfo Ii=new IDinfo();

		Ii.inputinfo();
		Ii.toString();
	}
}