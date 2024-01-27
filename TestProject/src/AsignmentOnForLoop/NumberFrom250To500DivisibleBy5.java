package AsignmentOnForLoop;

public class NumberFrom250To500DivisibleBy5 {

	public static void main(String[] args) {
		int count=0;
		for(int i=250; i<=500; i++)
		{
			if(i%5==0)
			{
				count=count+1;
			}
		}
		System.out.println(count);

	}

}
