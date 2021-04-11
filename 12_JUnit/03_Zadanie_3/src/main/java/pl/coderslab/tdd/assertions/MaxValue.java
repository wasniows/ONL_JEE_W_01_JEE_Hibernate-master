package pl.coderslab.tdd.assertions;

public class MaxValue {


	public int largest(int[] list) {
		int index, max = 0;

		if (list.length == 0) {
			throw new RuntimeException("Lista jest pusta");
		}

		for (index = 0; index < list.length; index++) {
			if (list[index] > max) {
				max = list[index];
			}
		}
		return max;
	}

}
