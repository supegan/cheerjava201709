import java.util.Scanner;
public class Graph //父类
{	
	double length = 59; //长度
	double hight = 68;  //宽度
	double radius = 20; //半径
	public void getArea(){
		double a = length*hight;
		System.out.println("长方形或正方形面积是:" + a);
	}
	public void area(){
		double b = radius*radius*3.14;
		System.out.println("园面积是:" + b);
	}
}