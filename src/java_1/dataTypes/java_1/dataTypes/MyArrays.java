package java_1.dataTypes;

import java.lang.reflect.Array;
import java.util.*;

class MyArrays {
    int[] nums = new int[]{10,23,3,4,5,2,1};
    String[] greetings = new String[]{"Hello","Howdy","Hallo","Hola","Bonjour","Ciao","أهلا و سهلا"};
    int[] bits = new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
    String[] colors = new String[]{"bluebird","yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","Matterhorn","Great White Lakes","torah","white bible","green quran", "red herring", "Black Sea"};

    void printNums() {
//        Programmatically print the nums array to the console.  Print each number on a new line.  The nums array is defined on this class.
        for(int i : nums)
            System.out.println(i);
    };

    void greet(String name) {
//        Randomly greet the person with a random greeting found in the greetings array.
//        For every greeting in the greetings array :
/*        ex : craig => greet() => "Hello Craig"
               "ABRAM" => greet() => "Hola Abram"
               "maTT => greet() => "أهلا و سهلا Matt"
 */
        Random random = new Random();
        int index = random.nextInt(greetings.length);

        System.out.println(greetings[index] +" " + name);

    };

    ArrayList<Boolean> bitsToBinaries(int[] bits) {
//        Programmatically convert the bit array of 1's and 0's into a binary array of true and false. return the 'converted' array.
//        ex : bitsToBinaries() => [false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false]
        ArrayList<Boolean> newArr = new ArrayList<>();
        for(int i : bits)
            newArr.add(i == 1);

        return newArr;
    };

    ArrayList<String> keepColors(String[] colors) {
//        In this class is an array called "colors".  Programmatically remove the elements that do NOT have a color associated with it.  Return the filtered color array of elements that have a color associated with it.
//        ex : keepColors() => ["bluebird","yellow bumblebee","black spider", "green monkey","pink","black bird","Great White Lakes","white bible","green quran", "red herring", "Black Sea"]
        String[] testStr = {"black", "blue","green","red","yellow","pink","white","brown","gray","orange","purple"};
        ArrayList<String> onlyColors = new ArrayList<>();
        for(String element:colors){
            if( Arrays.stream(testStr).anyMatch(element.toLowerCase()::contains))
                onlyColors.add(element);
        }
        return onlyColors;
    }

}







