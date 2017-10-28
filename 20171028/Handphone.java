package day1;

public class Handphone extends Phone{
	static{
		System.out.println("这是手机类");
	}
	
	public Handphone(){
		System.out.println("这是手机");
	}
	
	public Handphone(String brand){
		System.out.println("这是手机，品牌"+brand);
	}
	
	public void use(){
		System.out.println("移动通话");
	}
		
	public static void main(String[] args) {
		Phone hp=new Handphone();
		Phone hp1=new Handphone("华为");
		hp.use();
	}
}
