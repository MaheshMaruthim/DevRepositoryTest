package AsignmentOnForLoop;

public class CountOfNumbersDivideBy3 {

	public static void main(String[] args) {
		int count=0;
		for(int i=100; i<=200; i++)
		{
			if(i%3==0)
			{
				count=count+1;
			}
			
		}
		System.out.println(count);
	}

}
