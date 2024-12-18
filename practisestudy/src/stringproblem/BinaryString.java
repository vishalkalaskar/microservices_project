package stringproblem;

public class BinaryString {

		// Function to calculate the Hamming distance between two binary strings
		static int hammingDistance(String s1, String s2) {
			int hammingDist = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					hammingDist++;
				}
			}
			return hammingDist;
		}

		public static void main(String[] args) {

			// create binary strings
			String binaryStr1 = "10101010";
			String binaryStr2 = "01010101";

			// Length of binary string
			System.out.println("Length of binary string 1: " + binaryStr1.length());

			// Concatenation of binary strings
			String concatenatedStr = binaryStr1 + binaryStr2;
			System.out.println("Concatenation of binary strings: " + concatenatedStr);

			// Substring of binary string
			String substring = binaryStr1.substring(2, 6);
			System.out.println("Substring of binary string 1: " + substring);

			// Prefix of binary string
			String prefix = binaryStr1.substring(0, 3);
			System.out.println("Prefix of binary string 1: " + prefix);

			// Suffix of binary string
			String suffix = binaryStr2.substring(4, 8);
			System.out.println("Suffix of binary string 2: " + suffix);

			// Hamming distance between two binary strings
			int hammingDist = hammingDistance(binaryStr1, binaryStr2);
			System.out.println("Hamming distance between binary strings 1 and 2: " + hammingDist);

			// Regular Language of binary strings (ends with '0')
			boolean hasRegularLanguage = binaryStr1.chars().allMatch(c -> c == '0');
			System.out.println("Does binary string 1 have a regular language? " +
					(!hasRegularLanguage ? "Yes" : "No"));

			// Binary Arithmetic (addition)
			int binaryNum1 = Integer.parseInt(binaryStr1, 2);
			int binaryNum2 = Integer.parseInt(binaryStr2, 2);
			int sum = binaryNum1 + binaryNum2;
			System.out.println("Binary addition of " +
					binaryNum1 + " and " +
					binaryNum2 + ": " +
					Integer.toBinaryString(sum));
		}
	}
