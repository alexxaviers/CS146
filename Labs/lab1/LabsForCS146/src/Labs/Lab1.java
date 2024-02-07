package Labs;

import java.util.HashMap;

public class Lab1 {
	private int[] arr;
	private int target;

	public Lab1(int[] list, int t) {
		arr = list;
		target = t;

	}

	public void twoSum() {
		HashMap<Integer, Integer> mapOfNums = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];

			if (mapOfNums.containsKey(complement)) {
				System.out.println("found");
				System.out.println(i + " " + mapOfNums.get(complement));
			}

			else {
				mapOfNums.put(arr[i], i);

			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 75, 8, 7 };
		int target = 9;
		Lab1 x = new Lab1(arr, target);
		x.twoSum();

	}

}
