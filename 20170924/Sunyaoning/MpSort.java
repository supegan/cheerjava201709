public class MpSort
{
	public static void main(String[] args)
	{
		int numGp[]={2,0,8,6,5,4};
		System.out.print("排序前顺序为：");
		for(int x:numGp){
			System.out.print(x+" ");
		}
		System.out.println("");
		
		for (int j=0;j<numGp.length ;j++ ) {			
			for (int i=0;i<numGp.length-1 ;i++ ) {
				if (numGp[i]>numGp[i+1]) {
					int temp=numGp[i];
					numGp[i]=numGp[i+1];
					numGp[i+1]=temp;
				}
			}
		}
		System.out.print("排序后顺序为：");
		for(int x:numGp){
			System.out.print(x+" ");
		}
	}
	
}