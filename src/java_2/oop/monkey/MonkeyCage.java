package java_2.oop.monkey;

import java.util.List;

class MonkeyCage {

    private List<Monkey> monkeys;

    boolean areMonkeysSmiling(Monkey[] monkeys) {
    //We have an array of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.
        return true;
    }

    Monkey addMonkey(Monkey monkey) {
//        add a new monkey to the MonkeyCage
        return monkey;
    }

    void removeMonkey(Monkey monkey) {
//        remove a monkey from the MonkeyCage
    }

    class Monkey { //inner class.  DO NOT MOVE THIS CLASS
        String name;
        boolean smiling;

        public Monkey(String name, boolean smiling) {
            this.name = name;
            this.smiling = smiling;
        }
    }
}