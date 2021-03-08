package java_3.concurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Sync extends Thread {
    private List nums = new ArrayList<>();

    Sync(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random rand = new Random();

        for(int i=0; i<100; i++) {
            int randInt = rand.nextInt(100);
            this.nums.add(randInt);
        }
    }

    public List getNums() {
        return nums;
    }
}