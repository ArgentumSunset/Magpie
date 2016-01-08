/**
 * A program to allow students to try out different String methods.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		int positionFromSeven = sample.indexOf("jumped", 7);
		int positionFromTwentyOne = sample.indexOf("jumped", 21);
		System.out.println("sample.indexOf(\"quick\") = " + position);
		System.out.println("sample.indexOf(\"jumped\", 7) = " + positionFromSeven);
		System.out.println("sample.indexOf(\"jumped\", 21) = " + positionFromTwentyOne);
		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);

		// Try other methods here:

	}

}
