import java.util.Scanner;
public class Mp3
{
	public String song;
	public String volum;

	public String xia()
	{
		return "下一首";
	}
    public String shang()
    {
    	return "上一首";
    }
    public String big()
    {
    	return "音量+";
    }
    public String smoll()
    {
    	return "音量-";
    }
    public static void main(String[] agrs)
    {    
    	Scanner sc = new Scanner(System.in);
        int yin = 10;
    	for(;;)
    	{
    	
    	Mp3 p = new Mp3();
    	p.song = "天空中最闪亮的星";
    	System.out.println("您正在播放"+p.song);
    	System.out.println("音量+请输入1，音量减请输入2");
    	System.out.println("上一曲请输入3，下一曲请输入4");
    	System.out.println("关机请输入0");      
        int a = sc.nextInt();
        
        if (a == 1) {

        	System.out.println(p.big());
            yin++;
            System.out.println("当前音量为"+yin);
        }
        else if (a == 2) {
        	System.out.println(p.smoll());
            yin--;
            System.out.println("当前音量为"+yin);
        }
        else if(a == 0)
        {
        	System.out.println("再见我的爱");
        	break;
        }
        else if(a == 3)
        {
        	System.out.println(p.xia());
        	System.out.println("即将播放爱我别走");
        }
        else if(a == 4)
        {
        	System.out.println(p.shang());
        	System.out.println("即将播放我来了");
        }
        }
    }
}