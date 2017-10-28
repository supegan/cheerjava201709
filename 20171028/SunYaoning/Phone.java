package day1;

public class Phone {
	static{
		System.out.println("这是电话类，包含座机和手机");
	}
	
	public Phone(){
		System.out.println("这是电话");
	}
	
	public Phone(String brand){
		System.out.println("这是电话，品牌"+brand);
	}
	
	public void use(){
		System.out.println("通话");
	}
	
	public static void main(String[] args) {
		Phone p=new Phone();
		Phone p1=new Phone("待定");
		p.use();
	}
}
