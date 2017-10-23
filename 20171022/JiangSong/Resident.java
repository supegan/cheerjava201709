public class Resident
{
	final String name;
	final int id;
	final String sex;
	static int height;

	public Resident(String s1, int i, String s2)
	{
		this.name = s1;
		this.id = i;
		this.sex = s2;
	}


	public String toString()
	{
		System.out.println(this.name + "--" + this.id + "--" + this.sex + "--" + this.height + "cm");
		return "";
	}



	public static void main(String[] args)
	{
		Resident r = new Resident("Jack",123654789,"male");
		r.height = 175;
		System.out.println(r);

/*		Resident r1 = new Resident("Lucy",789654321,"female");
		r1.height = 165;
		System.out.println(r1);*/
	}

}