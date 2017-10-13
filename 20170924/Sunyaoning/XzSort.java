public class XzSort
{
	public static void main(String[] args)
	{
		int numGp[]={2,0,8,6,5,4};
		System.out.print("排序前顺序为：");
		for(int x:numGp){
			System.out.print(x+" ");
		}
		System.out.println("");

		for (int i=0;i<numGp.length ;i++ ) {
			int j;
			int temp=numGp[i];
			for (j=i;j>0 && temp<numGp[j-1] ;j-- ) {
				numGp[j]=numGp[j-1];
			}
			numGp[j]=temp;			//此处不太理解
		}
		System.out.print("排序后顺序为：");
		for(int x:numGp){
			System.out.print(x+" ");
		}
	}
}