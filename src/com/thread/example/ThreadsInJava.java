package com.thread.example;
//Defining first thread with task
//The task of this thread is to print the numbers from 0 to 1000 times
class Thread1 extends Thread
{
  @Override
  public void run()
  {
      for(int i = 0; i <= 10; i++)
      {
          System.out.println("Thread1");
      }
  }
}

//Defining second thread with task
//The task of this thread is to print the numbers from 1001 to 2000
class Thread2 extends Thread
{
  @Override
  public void run()
  {
      for(int i = 11; i<= 20; i++)
      {
          System.out.println("Thread2");
      }
  }
}

public class ThreadsInJava
{
  //Main Thread
  public static void main(String[] args)
  {
      //Creating first thread
      Thread1 t1 = new Thread1();
      t1.start();

      //Creating second thread
      Thread2 t2 = new Thread2();
      t2.start();
  }
}
