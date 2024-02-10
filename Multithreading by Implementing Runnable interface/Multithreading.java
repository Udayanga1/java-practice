public class Multithreading
{
  public static void main (String[] args)
  {
    MultithreadedThing myThing = new MultithreadedThing(1);
    MultithreadedThing myThing2 = new MultithreadedThing(2);
    MultithreadedThing myThing3 = new MultithreadedThing(3);
    Thread myThread = new Thread(myThing);
    Thread myThread2 = new Thread(myThing2);
    Thread myThread3 = new Thread(myThing3);

    myThread.start();
    myThread2.start();
    myThread3.start();
  }
}