public class Shuzi
{
   public static void main(String[] args)
   {
   	String shu = "1239586838923173478943890234092";
   	String[] num = {"0","1","2","3","4","5","6","7","8","9"};
   	String[] shu1 = shu.split("");
   	for(int i = 0; i < 10; i ++)
   	{
   		int count = 0;
   		for(int j = 0; j < shu1.length; j++)
   		{
   			if(shu1[j].equals(num[i]))
   			{
   				count++;
   			}
   		}
   		System.out.println("数字:"+num[i]+"出现过"+count+"次");
   	}
   }

}
