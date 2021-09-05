import java.util.ArrayList;
import java.util.Iterator;

public class BasicJava {

	public static void main(String[] args) {
//		Show1To255();
//		ShowOdd255();
//		PrintSum();

//		int[] arrays = { 4, 8, 8, 5, 9 };
//		IterateArray(arrays);

//		int[] nums = { -1, -2, -3, -4 };
//		getMaxNum(nums);

//		int[] findAvgNums = {2, 10, 3};
//		getAvg(findAvgNums);

//		arrayWithOdd();

//		int[] numsGreaterThanY = {1, 3, 5, 7};
//		greaterThanY(numsGreaterThanY, 3);

//		int[] numbers = {1, 5, 10, -2};
//		squareArr(numbers);

//		int[] negative = { 1, 5, 10, -2 };
//		EliminateNegatives(negative);

//		int[] myNums = {1, 5, 10, -2};
//		MinMaxAvg(myNums);
//	}
		int[] testArr = { 1, 5, 10, 7, -2 };
		ShiftArrayValues(testArr);
	}

	public static void Show1To255() {
		for (int i = 0; i < 256; i++) {
			System.out.println(i);
		}
	}

	public static void ShowOdd255() {
		for (int i = 0; i < 256; i++) {
			if (i % 3 == 0)
				System.out.println(i);
		}
	}

	public static void PrintSum() {
		int sum = 0;
		for (int i = 0; i <= 255; i++) {
			sum += i;
			System.out.println("New number: " + i + " Sum: " + sum);
		}
	}

	public static void IterateArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void getMaxNum(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

	public static void getAvg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println(avg);
	}

	public static void arrayWithOdd() {
		ArrayList<Integer> y = new ArrayList<>();
		for (int i = 1; i < 256; i += 2) {
			y.add(i);
		}
		System.out.println(y);
	}

	public static void greaterThanY(int[] arr, int y) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > y) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void squareArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= arr[i];
			System.out.println(arr[i]);
		}

	}

	public static void EliminateNegatives(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = 0;
			}
			System.out.println(arr[i]);
		}

	}

	public static void MinMaxAvg(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println("Max:" + max + " Min:" + min + " Avg:" + avg);
	}

	public static void ShiftArrayValues(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
			System.out.println(arr[i]);
		}
		arr[arr.length - 1] = 0;

	}
}
