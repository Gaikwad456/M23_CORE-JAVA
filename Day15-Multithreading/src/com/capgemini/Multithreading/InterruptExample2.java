package com.capgemini.Multithreading;
class Thread4 extends Thread
{
   public void run()
   {
      try
      {
          Thread.sleep(1000);
          System.out.println("work");
      }
      catch(InterruptedException e)
      {
         System.out.println("Exception handled "+e);
      }
         System.out.println("thread is running");
   }
}
public class InterruptExample2
{
    public static void main(String args[])
    {
      Thread4 t4=new Thread4();
      t4.start();
      t4.interrupt();
    }

}