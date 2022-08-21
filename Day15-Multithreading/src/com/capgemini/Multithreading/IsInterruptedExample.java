package com.capgemini.Multithreading;
class Thread5 extends Thread
{
    public void run()
    {
       for(int i=1;i<=3;i++)
          {
             System.out.println("doing task "+i);
          }
    }
}
public class IsInterruptedExample
{
   public static void main(String args[])throws InterruptedException
   {
       Thread5 t5=new Thread5();
       t5.start();
       System.out.println("is thread interrupted "+t5.isInterrupted());
       t5.interrupt();
       System.out.println("is thread interrupted "+t5.isInterrupted());
   }
}