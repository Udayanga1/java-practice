public class Multithreading
{
  public static void main (String[] args)
  {
    MultithreadedThing myThing = new MultithreadedThing(1);
    MultithreadedThing myThing2 = new MultithreadedThing(2);
    MultithreadedThing myThing3 = new MultithreadedThing(3);

    // myThing.run(); // This will run the code in the main thread
    // myThing2.run(); // This will run the code in the main thread

    myThing.start();
    myThing2.start();
    myThing3.start();
  }
}