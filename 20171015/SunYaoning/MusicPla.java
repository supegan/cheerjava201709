import java.util.Scanner;
public class MusicPla{
	public String song;
	public String volum;

	public void songCha(String s){
		Scanner sc=new Scanner(System.in);

		System.out.println("请按按钮切换歌曲(l/n)：");
		s=sc.next();

		mp.song=s;
		if(s.equals("l")){
			System.out.println("切换歌曲"+song.replace("l","上一首"));
		}else if(s.equals("n")){
			System.out.println("切换歌曲"+song.replace("n","下一首"));
		}else{
			System.out.println("操作错误，请重试");
		}
	}

	public void volumTur(String v){
		Scanner sc=new Scanner(System.in);

		System.out.println("请按按钮调节音量(u/d)：");
		v=sc.next();

		mp.volum=v;
		if(v.equals("u")){
			System.out.println("调节音量"+volum.replace("u","升高"));
		}else if(v.equals("d")){
			System.out.println("调节音量"+volum.replace("d","降低"));
		}else{
			System.out.println("操作错误，请重试");
		}
	}

	public static void main(String[] args){
		MusicPla mp=new MusicPla();
		
		mp.songCha(s);
		mp.volumTur(v);
	}
}