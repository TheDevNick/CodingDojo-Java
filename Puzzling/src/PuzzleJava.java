import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.nio.charset.Charset;

public class PuzzleJava {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);

		Collections.shuffle(numbers);
		System.out.println(numbers); // [1, 5, 2, 4, 3]
		Collections.sort(numbers);
		System.out.println(numbers); // [1, 2, 3, 4, 5]

		Random r = new Random();
		System.out.println(r.nextInt()); // without bounds
		System.out.println(r.nextInt(5));

		int[] nums = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
		PrintSumOfAllInArray(nums);
		System.out.println("---------------------------");
		String[] names = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
		ShuffleNames(names);
		System.out.println("---------------------------");
		ShowAlphabet();
		System.out.println("---------------------------");
		GenerateRandomInt();
		System.out.println("---------------------------");
		GenerateRandomInt2();
		System.out.println("---------------------------");
		RandomStringArr();
		System.out.println("---------------------------");
		randomStringOfStrings();

	}

	public static void PrintSumOfAllInArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (arr[i] > 10) {
				int greater = arr[i];
				System.out.println("Numbers Greater than 10: " + greater);
			}
		}

		System.out.println("Sum: " + sum);
	}

	public static void ShuffleNames(String[] arr) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> nameListOverFive = new ArrayList<String>();
//      Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa

//   if the length of arr[i] (the string length at that index) is more than 5 characters add to list

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 5) {
				nameListOverFive.add(arr[i]);
			}
			nameList.add(arr[i]);

		}
		Collections.shuffle(nameList);
		System.out.println(nameList);
		System.out.println(nameListOverFive);

	}

	public static void ShowAlphabet() {
		ArrayList<String> alphaArr = new ArrayList<String>();
		for (char alpha = 'A'; alpha <= 'Z'; alpha++) {
			alphaArr.add(Character.toString(alpha));
		}
		System.out.println(alphaArr);
		Collections.shuffle(alphaArr);
		System.out.println(alphaArr);
		String sample = alphaArr.get(0);

		System.out.println("First letter of shuffled array: " + alphaArr.get(0));
		System.out.println("Last letter of shuffled array: " + alphaArr.get(25));

		if ("AEIOU".indexOf(sample) > 0) {
			System.out.println("The first letter is a vowel");
		}
	}

	public static void GenerateRandomInt() {
		for (int i = 0; i < 10; i++) {
			Integer randomInteger = ThreadLocalRandom.current().nextInt(55, 101);
			System.out.println(randomInteger);
		}
	}

	public static void GenerateRandomInt2() {
		ArrayList<Integer> nums = new ArrayList<>();
        int min = 101;
        int max = 55;
		for (int i = 0; i < 10; i++) {
			int randomInteger = ThreadLocalRandom.current().nextInt(55, 101);
			nums.add(randomInteger);
            if(randomInteger < min){
                min = randomInteger;
            }
            if(randomInteger > max){
                max= randomInteger;
            }
		}
		System.out.println(nums);
		System.out.println("sorted.......");
		Collections.sort(nums);
		System.out.println(nums);
        System.out.println("Smallest randomized number is: " + min);
        System.out.println("Largest randomized number is: " + max);
	}
	
    public static void RandomStringArr() {
    	byte[] array = new byte[5]; // length is bounded by 5
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("US-ASCII"));

        System.out.println(generatedString);
	}
    public static void randomStringOfStrings(){
    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    ArrayList<String> randList = new ArrayList<String>();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i <10; i++){
        for(int j = 0; j < 5; j++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        randList.add(finalString);
        randString.setLength(0);
    }
    System.out.println(randList);       
    }

}
