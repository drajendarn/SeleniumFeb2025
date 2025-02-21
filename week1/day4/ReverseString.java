package week1.day4;

public class ReverseString {

	public static void main(String[] args) {

		String companyName = "TestLeaf";
		char[] c = companyName.toCharArray();
		String revString = "";
		for (int i = c.length - 1; i >= 0; i--) {
			revString = revString + c[i];
		}
		System.out.println("Reversed String is:" + revString);
	}

}
