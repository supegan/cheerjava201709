package day1;

public class Handphone extends Phone{
	static{
		System.out.println("�����ֻ���");
	}
	
	public Handphone(){
		System.out.println("�����ֻ�");
	}
	
	public Handphone(String brand){
		System.out.println("�����ֻ���Ʒ��"+brand);
	}
	
	public void use(){
		System.out.println("�ƶ�ͨ��");
	}
		
	public static void main(String[] args) {
		Phone hp=new Handphone();
		Phone hp1=new Handphone("��Ϊ");
		hp.use();
	}
}
