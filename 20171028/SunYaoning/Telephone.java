package day1;

public class Telephone extends Phone {
	static{
		System.out.println("����������");
	}
	
	public Telephone(){
		System.out.println("��������");
	}
	
	public Telephone(String brand){
		System.out.println("����������Ʒ��Ϊ"+brand);
	}
	
	public void use(){
		System.out.println("����ͨ��");
	}
	
	public static void main(String[] args) {
		Phone tp=new Telephone();
		Phone tp1=new Telephone("����");
		tp.use();
	}
}
