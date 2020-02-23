package dot.questionmark;

public class Reverse {
	
	public int reversing_a_number(int number)
	{
		int reverse_number = 0;
		for(; number!=0; number=number/10)
		{
			reverse_number*=10;
			reverse_number+=number%10;
		}
		return reverse_number;
	}

	public static void main(String[] args) {
		
		
		

	}

}
