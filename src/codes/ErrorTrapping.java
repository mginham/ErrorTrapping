package codes;

import java.util.Scanner;

public class ErrorTrapping {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int max = 10, min = 1, data = 0;
		
		do
		{
			try
			{
				// possibility of failure, so we 'try' it
				System.out.println("Please enter a number from 1 to 10");
				data = input.nextInt();
			}
			catch (Exception e)
			{
				// if try fails, do this
				input.next();
			}
			finally
			{
				// happens regardless of success or failure
				// rarely used
			}
		} while(data > max || data < min);
	}

}
