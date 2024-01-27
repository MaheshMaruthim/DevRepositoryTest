package AsignmentOnForLoop;

public class SumAndCountOf100To300DivideBy11 {

	public static void main(String[] args) {
		int count =0;
		int sum=0;
		for(int i=100; i<=300; i++)
		{
			if(i%11==0)
			{
				count=count+1;
				sum=sum+i;
			}
		}
		System.out.println("Count of numbers from 100 to 300 is = " +count);
		System.out.println("Sum of numbers from 100 to 300 is = "+sum);
	}

}
