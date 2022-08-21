package com.capgemini.Multithreading;
class XYZ
{
   public synchronized void display()
     {
        System.out.println("Current thread " + Thread .currentThread().getName());

         for(int i = 0; i < 5 ; i++)
           {
              System.out.println(Thread.currentThread().getName() + " i -" +i);
              try
              {
                 Thread.sleep(50);
              }
              catch (InterruptedException e)
                {
                   e.printStackTrace();
                }

           }
     }
}
    class Valueof implements Runnable{
       Thread t;
       XYZ val;
       Valueof(XYZ val)
         {
            this.val = val;
            t = new Thread(this);
            t.start();
         }
         public void run()
           {
             val.display();
           }
         }
public class StaticWithoutSynchronizationExample{
      @SuppressWarnings("unused")
	public static void main(String[] args)
      {
      XYZ obj1 = new XYZ();
      XYZ obj2 = new XYZ();
      Valueof t1 = new Valueof(obj1);
      Valueof t2 = new Valueof(obj2);

      }
}

