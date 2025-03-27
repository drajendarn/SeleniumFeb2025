package week6.day3.extentreports;

import java.io.IOException;

public class LearnTryCatch {
	// throws- This is at method level

	public static void main(String[] args) throws IOException {

		try {
			int c = 100 / 0;
			System.out.println(c);

			int[] a = { 1, 2, 3 };
			System.out.println(a[4]);

			throw new NullPointerException();// Throw - used to manually throw the exception and stop the execution
		}

		catch (ArithmeticException e) {
			System.out.println("This Math is not allowed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The Index is not correct");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException thrown manually");
		}
		// Finally - this will be executed always
		finally {
			System.out.println("This will be always executed even if exception is thrown");
		}
	}
}
