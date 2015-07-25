import java.util.Arrays;

public class IntegerPermutation {

	private static void swap(Integer[] integerArray, int i, int j) {
		Integer temp = integerArray[i];
		integerArray[i] = integerArray[j];
		integerArray[j] = temp;
	}

	private static void permutationHelper(Integer[] integerArray,
			int currentPosition) {

		if (currentPosition == 1) {
			System.out.println(Arrays.toString(integerArray));
		} else {
			for (int i = 0; i < currentPosition; i++) {
				permutationHelper(integerArray, currentPosition - 1);

				if (currentPosition % 2 == 0) {
					swap(integerArray, i, currentPosition - 1);
				} else {
					swap(integerArray, 0, currentPosition - 1);
				}
			}
		}
	}

	public static void permutation(Integer[] integerArray, int lengthOfTheArray) {
		permutationHelper(integerArray, lengthOfTheArray);
	}

	public static void main(String[] args) {

		Integer[] a = new Integer[] { 1, 2, 3 };
		IntegerPermutation.permutation(a, a.length);
	}
}