public class Triangle1 extends Rectangle
{
	public int area (int a, int b)
	{
		this.length = a;
		this.height = b;
		return a * b / 2;
	}

	public static void main(String[] args)
	{
		Rectangle t = new Triangle1();
		System.out.println(t.area(5,2));
	}
}