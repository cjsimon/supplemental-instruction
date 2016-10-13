// Practice It 3.6
// http://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/s6%2DparameterMysteryNumbers
// What is the output of the following program?
public class MysteryNumbers {
	public static void main(String[] args) {
		String one = "two";
		String two = "three";
		String three = "1";
		int number = 20;

		sentence(one, two, 3);					// three times two = 6
		sentence(two, three, 14);				// 1 times three = 28
		sentence(three, three, number + 1); 	// 1 times 1 = 42
		sentence(three, two, 1);				// three times 1 = 2
		sentence("eight", three, number / 2);	// 1 times eight = 20
	}

	public static void sentence(String three, String one, int number) {
		System.out.println(one + " times " + three + " = " + (number * 2));
	}
}