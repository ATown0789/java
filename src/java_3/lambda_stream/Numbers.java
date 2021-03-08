package java_3.lambda_stream;

import java.util.Arrays;
import java.util.List;

class Numbers {

    private static final List<Integer> nums = Arrays.asList(10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500);

    static List<Integer> getNums() {
        return nums;
    }

    static int getNum(int i) {
        return nums.get(i);
    }


    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
        return false;
    }


    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        return false;
    }

    static boolean isPrime(int i) {
         //determine if the value at the index i is a prime number.  return true if yes, return false if no.
         return false;
    }

    static int added() {
        //add all the elements in the list.  return the sum.  
        return 0;
    }

    static int subtracted() {
        //subtract all the elements in the list. return the remainder.
        return 0;
    }

    static int multipled() {
        //multiply all the elements in the list. and return the product.
        return 0;
    }

    static int divided() {
        //multiply all the elements in the list. and return the product.
        return 0;
    }

    static int findMax() {
         //return the maximum value in the list.
        return 0;
    }

    static int findMin() {
        //return the minimum value in the list.
        return 0;
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
        return 0;
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.
        return 0;
    }

}
