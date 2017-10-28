package day1;

public class Telephone extends Phone {
	static{
		System.out.println("这是座机类");
	}
	
	public Telephone(){
		System.out.println("这是座机");
	}
	
	public Telephone(String brand){
		System.out.println("这是座机，品牌为"+brand);
	}
	
	public void use(){
		System.out.println("有线通话");
	}
	
	public static void main(String[] args) {
		Phone tp=new Telephone();
		Phone tp1=new Telephone("中兴");
		tp.use();
	}
}
