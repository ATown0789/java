import java.util.*;

public class JavaChallenges {

	public static void main(String[] args) {
		//solve the code challenges found in the static methods on this class
		//System.out.println(calcGPA(new int[] {100,80,85,92,60,44,67}));
		//solveQuadratic(4,-5,1);
		//printEgg();
		Item pants = new Item("pants",20);
		Item iphone = new Item("iPhone",1100);
		System.out.println(totaledReceipt(new Item[]{pants, iphone}));
	}

	static void printMsg(String msg, int repeats) {
		/* print the message to the console the amount of repeats specified for the 2nd parameter
		printMsg("hello world",3) =>
		hello world
		hello world
		hello world
		 */
		for(int i = 0; i < repeats; i++) {
			System.out.println(msg);
		}
	}

	static int nthFibonacci(int n) {
		/*calculate the nth fibonacci number and return the value.  The first 4 fibonacci numbers are : 1, 1, 2, 3...  learn more : http://bit.ly/fibonacci-agile
		example : nthFibonacci(7) => 13
		 */
		if(n <=  1)
			return n;
		return nthFibonacci(n-1) + nthFibonacci(n-2);

	}

	static double calcPay(int hrsPerPeriod, double hourlyRate, int payPeriods) {
/*		calculate the total payout to based on the hours worked for a given pay period, the hourly rate, and the # of pay periods.  return the total pay as output.
		12 hours / period, $50.00 / hr , 4 periods => calcPay(80,50.00,4) => 16000.00
		80 hours / period , $50.00 / hr, 8 periods => calcPay(80,25.00,8) => 16000.00
		1 hr / period, $250.00 / hr, 2 periods => calcPay(1,250.00,2) => 500.00
 */

		return hrsPerPeriod*hourlyRate*payPeriods;
	}

	static void solveQuadratic(int a, int b, int c) {
		/* compute a quadratic equation using the input parameters.  Recall that a quadratic equation has the format :  ax^2 + bx + c */
		if(a == 0) {
			System.out.println("A Cannot be 0");
			return;
		}
		double root1, root2;

		double determinant = b * b - 4 * a * c;

		if(determinant > 0) { //2 real number solutions
			root1 = (-b + Math.sqrt(determinant))/(2*a);
			root2 = (-b - Math.sqrt(determinant))/(2*a);
			System.out.println("Two real number answers:");
			System.out.println("answer 1 = " + root1);
			System.out.println("answer 2 = " + root2);
		}

		else if(determinant == 0) { //1 real number solution

			root1 = -b / (2 * a);

			System.out.println("One real number answer");
			System.out.println("answer = " + root1);

		}

		else { //imaginary number solutions
			root1 = -b / (2*a); //real part
			root2 = Math.sqrt(-determinant) / (2*a); //imaginary part
			System.out.println("answer 1 = " + root1 + "+" + root2 + "i");
			System.out.println("answer 1 = " + root1 + "-" + root2 + "i");
		}

	}

	static int countQuarters(double amount) {
//		calculate the number of quarters that can be changed for the given amount.
//		$10.50 => countQuarters(10.50) => 42
			return (int) (amount/.25);

	}

	static String reverseString(String str) {
		//reverse the input string and return it.
		List<Character> charList = new ArrayList<Character>();
		for(int i = 0; i < str.length(); i++) {
			charList.add(i,str.charAt(i));
		}
		Collections.reverse(charList);

		String newStr = String.valueOf(charList);

		return newStr;
	}

	static String shuffleMessage(String[] messages) {
//		Create a String message by randomly combining the elements of the strings in the messages array.  The output should be randomized.
/*		["hi", "dear", "friend"] => shuffleMessage() => "hi dear friend";
		["hi", "dear", "friend"] => shuffleMessage() => "dear hi friend";
		["hi", "dear", "friend"] => shuffleMessage() => "friend dear hi";
*/
		List<String> messageList = Arrays.asList(messages);
		Collections.shuffle(messageList);

		return String.join(" ", messageList);
	}

	static double calcGPA(int[] scores) {
			/*calcGpa accepts an array of scores, representing a student's scores for a list of classes, and returns that student's
			overall GPA. The GPA ranges between 0.0 and 4.0 . Ignore any scores are outside the range of 0 to 100.
			Grading Scale :
			0 - 59 = 0.0
			60 - 69 - 1.0
			70 - 79 - 2.0
			80 - 89 - 3.0
			90 - 100 - 4.0
		 */
		double sumScore = 0;
		for(int i : scores) {
			if(i >= 90 && i <= 100){
				sumScore += 4.0;
			}
			else if(i >= 80 && i <= 89){
				sumScore += 3.0;
			}
			else if(i >= 70 && i <= 79){
				sumScore += 2.0;
			}
			else if(i >= 60 && i <= 69){
				sumScore += 1.0;
			}
			else if(i >= 0 && i <= 59){
				sumScore += 0.0;
			}
		}

		return sumScore / scores.length;
	}

	static void printEgg() {
		/*printEgg() => displays the following output:
			  _______
			 /       \
			/         \
			-"-'-"-'-"-
			\         /
			 \_______/

		*/
		System.out.println("  -------   ");
		System.out.println(" /       \\ ");
		System.out.println("/         \\");
		System.out.println("-\"-'-\"-'-\"-");
		System.out.println("\\         /");
		System.out.println(" \\_______/");
	}

	static class Item {
		String item;
		double cost;

		public Item(String item, double cost) {
			this.item = item;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Item{" +
					"item='" + item + '\'' +
					", cost=" + cost +
					'}';
		}
	}

		static double totaledReceipt(Item[] transactions) {

	//		Calculate the total amount of all items in the transactions array.  Note that each element of the transactions array is of type Item.
	//		[Item{ item : "pants" , cost : 20.00} , Item{ item : "iPhone", cost : 1100.00} ] => totaledReceipt() => 1120.00
			double total = 0;

			for(Item item : transactions) {
				total += item.cost;
			}

			return total;

		}
	}