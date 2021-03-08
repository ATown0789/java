package java_4.regex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Regex {

    private static final String bookText = "Books are the keys to knowledge.  I didn't like to read books as a child, but in college I started enjoying learning and reading books. You can borrows books from the library, or you can buy them from the bookstore. I'm not sure if I prefer paperback books or hardcover books.  I'm such a nerd that I even like textbooks.  With the advent of technology, you can even buy digital books, such as kindle-books, nook-books, or other e-books. My personal favorite book format are pdf-books, because I don't have to carry so many books around wherever I go.  All the books are on my ipad or laptop.  When I lived abroad, they would give books to students absolutely free.  Free books for a student of knowledge is like a kid in a candy store.  So wipe the dust off of your books, and remember the slogan from 'reading rainbow' : 'Take a look! It's in a book! Reading Rainbow!";
    private static final Set<String> TEKmentors = new HashSet(Arrays.asList("Craig Stockton","Marcelo Barbosa", "Mathew Choat", "Alex Allspaw", "Desaree Byers", "Abram Jablonsky", "Amir Yunas"));
    private static final String sleepy = "I felt sleepy because I saw the others were sleepy, and not because I actually was SLEEPY; but rather because I knew I should feel sleePY!. But in reality, I wasn't really esleepy, or am I fooling myself, and did I make myself sleepy?  \'Prayer is better than sleep\', as the saying goes in some faith traditions.  If you're sleepy and you know it, clap your hands.  Keep on trying to sleep and be sleepy until you actually become sleepy. You are getting sleepy... sleepy...  Or you can act like you're above sleep, like a famous rapper onece said, I never sleep, cuz' sleep is the cousin of death.";
    private static final String[] arrows = {"\u21FD", "\u26F7", "\u21FF", "\u21EF","\u21EC", "\u26F9","\u26FD","\u26D4","\u26A5","\u21FD","\u2190", "\u26A1","\u21BA","\u2196","\u2603","\u21FD"};

    static void explainPattern() {
        // What does the following pattern match? (\d){36} explain in a println() statement.
        System.out.println("The following pattern ('\\d'){35} matches : ...");
    }

    static int countWords(String str) {
			/*Count the number of words in the string.  A word has any alphanumeric character.
			wordCount("how are you?") => 3
			wordCount(" this     is my     spaced out       sentence ") => 6
			wordCount(" ") =>  0.
			*/
        return 0;
    }

    static int countBooks() {
        // Find all the occurences of any form of 'book' in the bookText class variable. use java_4.regex to match the occurences and store the count of books to an int.
        int bookCount = 0;
        return bookCount;
    }

    static String[] tmFirstNameBasis() {
        // Create a new array of the first names of the TEKmentors array defined as a class property.  Use Regex to only grab the first name of every TEKmentor in the TEKmentors set defined in this class.  Return an Array of first names.
        String[] firstNamesTMs = {};
        return firstNamesTMs;
    }

    static String beHappyNotSleepy() {
        /* for the static variable sleepy, replace every occurence of sleepy with the word 'happy'. Account for case.  Use java_4.regex to complete the task.
                SLEEPY => happy
                sleep => sleep
                sleepy => happy
                123sleepy => happy
         */

        String happy = sleepy;
        return happy;
    }

    static int findPhoneNumbers(String str) {
    // determine if the input string is a valid phone number.  If not, return 0.
    //   examples : (123)-234-3456, 123456789, 123 342 2222, (123)345-3333
        return 0;
    }


    static void printArrows() {
        for(String arr : arrows) {
            System.out.println(arr);
        }

        //You are looking for unicode arrow symbols in a string.  https://jrgraphix.net/r/Unicode/2190-21FF is a selection of unicode arrow symbols Match all the codes that are arrows in the arrows class field defined above, and then print them out to the console.  They should be printing out as the arrow images.
    }

    public static void main(String[] args) {
        printArrows();
    }
}

