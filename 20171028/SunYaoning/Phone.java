package day1;

public class Phone {
	static{
		System.out.println("���ǵ绰�࣬�����������ֻ�");
	}
	
	public Phone(){
		System.out.println("���ǵ绰");
	}
	
	public Phone(String brand){
		System.out.println("���ǵ绰��Ʒ��"+brand);
	}
	
	public void use(){
		System.out.println("ͨ��");
	}
	
	public static void main(String[] args) {
		Phone p=new Phone();
		Phone p1=new Phone("����");
		p.use();
	}
}
