
public class Temp
{
	public static void main(String[] args) {
		int line=4;
		int space=line-1;
		int star=1;
		for(int i=0;i<line;i++)
		{
			for(int j=space;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
			star=star+2;
			System.out.println();
		}
		
	}
}
