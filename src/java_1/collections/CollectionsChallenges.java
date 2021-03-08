package java_1.collections;

import java.util.*;

public class CollectionsChallenges {

	public static void main(String[] args) {
//		Complete the code challenges for the following static methods
	}

	int findVal(int val, ArrayList<Integer> arrList) {
//		find a value in the input array list.  return it if found.  If not, return 0.
		return 0;
	}

	static List convertArrToList(Object[] array) {
//		convert the array to a list and return it.
		return null;
	}

	static Set<String> listToSet(List<String> states) {
//		convert a list of US states to a set.  return the set.
		return null;
	}

	static int addToList(int x, ArrayList<Integer> numList) {
		// add the x input to the array list.  return the value if succcessfully added.
		return x;
	}

	static void removeFromList(int x, ArrayList<Integer> numList) {
		// remove the input parameter value x from the numList.
	}

	static int insertIntoList(int x, int i, ArrayList<Integer> numList) {
		// insert the the value x at index position i for the input numList.  If the index position is outside the bounds of the current numList, add it to the end of the array list.
		return x;
	}

	static List<Integer> reverseNums(ArrayList<Integer> nums) {
		/*
		reverse the values of the nums list
		return the reversed array list.
		*/
		return null;
	}

	static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList, boolean mutate) {

/*		reverse the linked list.  If the mutate boolean is set to true, reverse a copy of the linked list without mutating the original list.  If mutate is false, reverse the original linkedList in place.
		example : ["red","orange","yellow","green","blue","indigo","violet"] => reverseLinkedList => [violet, indigo, blue, green, yellow, orange, red]
 */
		return linkedList;
	}

	static ArrayList<String> removeDuplicates(ArrayList<String> names) {
//		remove duplicates from the list of name strings.  return a new array list with the unique elements.
		return names;
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

		return null;
	}

}
