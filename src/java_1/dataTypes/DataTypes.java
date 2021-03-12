import java.util.Arrays;

class DataTypes {

//		boolean number = 2021;
//		byte yearOfBirth = 1977;
//		Array nums = [3,4,5,6,7,8,10,12];
//		Object movieName = "Meet The Parents";
//		double male = 'm';
//		triple triplet = 3L;
//		float female = 'f';
//		short decimalVal = .0000000000001f;
//		long halfByte = 0101;




	public static void main(String[] args) {
		int[] bits = new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
		String[] colors = new String[]{"bluebird","yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","Matterhorn","Great White Lakes","torah","white bible","green quran", "red herring", "Black Sea"};
		//the class fields defined in this DataTypes class have mistakes with either the data type, or the syntax.  Fix the data types so the main method correctly displays the value of all of the variables
		//For the methods below in this DataTypes class, determine the appropriate datatypes for the inputs and the outputs

		MyArrays array = new MyArrays();
		array.greet("Anthony");
		System.out.println(Arrays.toString(getDataTypes(31, true, 1232L)));
	}

	int yearsToMonths(int years) {
		//	convert years to months using appropriate data types for the inputs and the outputs, 2 years => 24 months
		return years*12;
	}

	int monthsToHours(int months) {
		//	convert months to hours using appropriate data types for the inputs and the outputs, 8 months => 17520 hours
		return months * 730;
	}

	long daysToSeconds(int days) {
		//	convert days to seconds using appropriate data types for the inputs and the outputs, 2 days => 172800 seconds
		return days * 86400;

	}

	long centuriesToSeconds(int centuries) {
		//	convert centuries to seconds using appropriate data types for the inputs and the outputs, 1 century => 3.1556952 x 10^9 seconds
		return centuries * 3155695200L;
	}

	int dollarsToBitcoin(int dollars) {
		//	convert (usd) dollars $ to bitcoin using appropriate data types for the inputs and the outputs, As of 1/2021, 1 bitcoin ~=> $50000.00
		return dollars * 50000;
	}

	boolean canDrive(int age) {
		//determine if the age passed in is ready to drive, return a value indicating whether or not the age passed in is ready to drive.
		return age >= 16;
	}

	static String[] getDataTypes(int num1, boolean bool1, long long1) {
//		Use Java to get the data type of the three input variables; and return a string representation of the data types of the three variables as an array.  Do NOT hard code the answers here.  Make sure to use Java to programmatically get the data types.
		String numType = ((Object) num1).getClass().getSimpleName();
		String boolType = ((Object) bool1).getClass().getSimpleName();
		String longType = ((Object) long1).getClass().getSimpleName();


		return new String[]{numType,boolType,longType};
	}

}