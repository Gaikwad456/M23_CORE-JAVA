package com.capgemini.Multithreading;

class test
{

    synchronized void printTable(int n) //synchronized Method
     {
        for(int i=1;i<=5;i++)
          {
            System.out.println(n*i);
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e)
              {
                 System.out.println(e);
              }
          }

      }

}
class Thread1 extends Thread
{
   test t;
   Thread1(test t)
     {
        this.t=t;
     }
     public void run()
       {
          t.printTable(5);
       }

}
class Thread2 extends Thread
{
    test t;
    Thread2(test t)
    {
       this.t=t;
    }
    public void run()
    {
       t.printTable(100);
    }

}
public class SynchronizationExample
{
   public static void main(String args[])

   {
    test obj = new test();//only one object
    Thread1 t1=new Thread1(obj);
    Thread2 t2=new Thread2(obj);
    t1.start();
    t2.start();

   }
}

