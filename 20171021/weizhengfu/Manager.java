import java.util.Scanner;
public class Manager extends Staff{
	public String manager;
	public String manager(){
		return manager;
	}
	public void manager1(String manager){
		this.manager = manager;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Staff a = new Staff();
		System.out.print("请输入员工姓名:");
		a.name = sc.next();
		System.out.print("请输入员工年龄:");
		a.age = sc.nextInt();
		System.out.print("请输入员工工作内容:");
		a.jop = sc.next();
		Manager a1 = new Manager();
		System.out.print("请输入经理姓名:");
		a1.name = sc.next();
		System.out.print("请输入经理年龄:");
		a1.age = sc.nextInt();
		System.out.print("请输入经理工作内容:");
		a1.jop = sc.next();
		System.out.print("请输入经理管理内容:");
		a1.manager = sc.next();
	}
}