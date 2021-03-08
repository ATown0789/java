package java_1.collections;

import java.util.*;

public class CollectionsChallenges {

	public static void main(String[] args) {
//		Complete the code challenges for the following static methods I forgot to make a branch

		ArrayList<Integer> arrayList = new ArrayList<>(
				Arrays.asList(12, 41, 435, 76, 43, 12, 10, 34)
		);
		int[] array = {1,2,3,4,5,6,7};
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("hello1");
		arrayList1.add("hello1");
		arrayList1.add("hello1");
		arrayList1.add("hello2");
		arrayList1.add("hello3");
		arrayList1.add("hello4");
		arrayList1.add("hello5");
		arrayList1.add("hello5");
		arrayList1.add("hello4");
		arrayList1.add("hello3");

		Person anthony = new Person("Anthony",31);
		Person anthonyClone = new Person("Anthony Clone",31);
		Person yesica = new Person("Yesica",33);
		Person yesicaClone = new Person("Yesica Clone",33);
		Person eddison = new Person("Eddison",2);
		Person grumps = new Person("Grumps",61);

		Person [] personArr = {anthonyClone,anthony,yesica,eddison,grumps,yesicaClone};

		System.out.println(covidVaccineQueue(personArr));


	}

	static int findVal(int val, ArrayList<Integer> arrList) {
		//		find a value in the input array list.  return it if found.  If not, return 0.

		if(arrList.contains(val)) {
			return val;
		}

		else return 0;
	}

	static List convertArrToList(int[] array) {
//		convert the array to a list and return it.

		return Arrays.asList(array);
	}

	static Set<String> listToSet(List<String> states) {
//		convert a list of US states to a set.  return the set.
		Set<String> stateSet = new HashSet <>(states);
		return stateSet;
	}

	static int addToList(int x, ArrayList<Integer> numList) {
		// add the x input to the array list.  return the value if succcessfully added.
		int testNum = numList.size(); //I only added the testNum and if else because it said to return if successfully added
		numList.add(x);
		if(testNum < numList.size())
			return x;
		else
			return 0;
	}

	static void removeFromList(int x, ArrayList<Integer> numList) {
		// remove the input parameter value x from the numList.
		int indexNum = numList.indexOf(x);
		if(indexNum > -1)
			numList.remove(indexNum);
		else
			System.out.println("Number not found in ArrayList");
	}

	static void insertIntoList(int x, int i, ArrayList<Integer> numList) {
		// insert the the value x at index position i for the input numList.  If the index position is outside the bounds of the current numList, add it to the end of the array list.

		if (i +1 >= numList.size() || i < 0)
			numList.add(x);
		else
			numList.add(i,x);
	}

	static List<Integer> reverseNums(ArrayList<Integer> nums) {
		/*
		reverse the values of the nums list
		return the reversed array list.
		*/
		Collections.reverse(nums);
		return nums;
	}

	static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList, boolean mutate) {

/*		reverse the linked list.  If the mutate boolean is set to true, reverse a copy of the linked list without mutating the original list.  If mutate is false, reverse the original linkedList in place.
		example : ["red","orange","yellow","green","blue","indigo","violet"] => reverseLinkedList => [violet, indigo, blue, green, yellow, orange, red]
 */
		if(mutate) {
			LinkedList<String> listCopy = new LinkedList<String>();
			listCopy = (LinkedList)linkedList.clone();
			Collections.reverse(listCopy);
			return listCopy;
		}
		else {
			Collections.reverse(linkedList);
			return linkedList;
		}
	}

	static ArrayList<String> removeDuplicates(ArrayList<String> names) {
//		remove duplicates from the list of name strings.  return a new array list with the unique elements.
		HashSet<String> nameSet = new HashSet<String>();
		for(String name : names)
			nameSet.add(name);
		ArrayList<String> newList = new ArrayList<>();
		for(String name: nameSet)
			newList.add(name);
		return newList;
	}

	static class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}

	//Optional
	static Queue<Person> covidVaccineQueue(Person[] people) {
//		There is an Array of people looking to get the COVID-19 vaccine.  The vaccines are administered on a first-come, first-serve basis.  Sequence the order of people by age.  The most elderly people get placed first in the queue, with the youngest getting placed last in the queue.  Return the Queue of folks waiting to be vaccinated.
		ArrayList<Person> toBeSorted = new ArrayList<>(Arrays.asList(people)); //used ArrayList to sort
		List<Person> sorted = new LinkedList<>(); //cast to LinkedList to use queue

		sorted = quickSort(toBeSorted);

		Queue<Person> sortedQ = new LinkedList<>(sorted); //cast to queue

		return sortedQ;
	}


	//Stable Quick Sort (copied from https://www.geeksforgeeks.org/stable-quicksort/ and modified to take a Person object and to sort descending)

	// The code uses middle element as pivot.

	public static ArrayList<Person> quickSort(ArrayList<Person> people)
	{

		// Base case
		if(people.size() <= 1)
		{
			return people;
		}
		else
		{

			// Let us choose middle element a pivot
			int mid = people.size() / 2;
			Person pivot = people.get(mid);

			// key element is used to break the array
			// into 2 halves according to their values
			ArrayList<Person> smaller = new ArrayList<>();
			ArrayList<Person> greater = new ArrayList<>();

			// Put greater elements in greater list,
			// smaller elements in smaller list. Also,
			// compare positions to decide where to put.
			for(int ind = 0; ind < people.size(); ind++)
			{
				Person individual = people.get(ind);
				int val = individual.age;
				if( ind != mid )
				{
					if( val < pivot.age )
					{
						smaller.add(individual);
					}
					else if(val > pivot.age)
					{
						greater.add(individual);
					}
					else
					{

						// If value is same, then considering
						// position to decide the list.
						if(ind < mid)
						{
							greater.add(individual);
						}
						else
						{
							smaller.add(individual);
						}
					}
				}
			}

			ArrayList<Person> ans = new ArrayList<Person>();
			ArrayList<Person> sa1 = quickSort(smaller);
			ArrayList<Person> sa2 = quickSort(greater);

			// add all elements of greater list into ans list
			for(Person val2 : sa2)
				ans.add(val2);

			// add pivot element into ans list
			ans.add(pivot);

			// add all elements of smaller list into ans list
			for(Person val1 : sa1)
				ans.add(val1);

			// return ans list
			return ans;
		}
	}

// This code is contributed by Naresh Saharan


}
