package com.capgemini.Multithreading;

class Thread3 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(10000);
            System.out.println("work");
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException("Threadinterrupted"+e);
        }
    }
}
public class InterrupExample1
{
    public static void main(String args[])
    {
        Thread3 t3=new Thread3();
        t3.start();
        try
        {
            t3.interrupt();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled "+e);
        }
    }
}