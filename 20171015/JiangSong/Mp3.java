import java.util.Scanner;
public class Mp3
{
	public String song;
	public String volumn;


	public void changeSong(String s1,String s2)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("please choose last or next:\t");
		String changeSongButton = sc.next();

		if(changeSongButton.equals("last"))
		{
			this.song = s1;
			System.out.println("Now is playing " + this.song);
		}
		else
		{
			this.song = s2;
			System.out.println("Now is playing " + this.song);
		}
	}

	public void changeVolumn(String v1, String v2)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("please choose up or down:\t");
		String changeVolumnButton = sc.next();

		if(changeVolumnButton.equals("up"))
		{
			this.volumn = v1;
			System.out.println("Now volumn is " + this.volumn);
		}
		else
		{
			this.volumn = v2;
			System.out.println("Now volumn is " + this.volumn);
		}
	}

	public static void main(String[] args)
	{
		Mp3 newmp = new Mp3();
		newmp.changeSong("Good luck","Evening");
		newmp.changeVolumn("Up","Down");

/*		System.out.println(newmp.song);
		System.out.println(newmp.volumn);*/
	}
}