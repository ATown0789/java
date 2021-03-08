package java_3.concurrency;

public class Main {
   
    public static void main(String[] args) {
         //run all of your threads from this main class.
        Sync syncThread = new Sync("sync thread");
        syncThread.start();
        System.out.println(syncThread.getNums());  //this prints out an empty list. write some code that will allow the data generated in the syncThread to show up here.
        /*
            -Create 5 sync threads
            -Allow the list of nums to be a shared resource amongst all of the threads.
            -Protect the List from thread interference using a thread blocking technique, such as synchronization or an Atomic data structure.
        */

        /*
            Kick off a Team Thread here.
            Set the name of the thead to be your agile team name.
        */
    }
}