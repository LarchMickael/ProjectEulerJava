
public class Main {


	public static void main(String[] args) {
		int fib1 = 1;
		int fib2 = 2;
		int sum = fib2;
		boolean test = true;
		while(test)
		{
			fib1 += fib2;
			if(fib1%2 == 0)
			{
				sum += fib1;
			}
			fib2 += fib1;
			if(fib2%2 == 0)
			{
				sum += fib2;
			}
			if(fib2 >= 4000000)
				test = false;
		}
		System.out.println(sum);
	}

}
