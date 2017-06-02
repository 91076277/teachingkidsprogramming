package org.teachingkidsprogramming.section09final;

public class FizzBuzz
{
  //   For the whole numbers from 1 to 100, print either that number, or, 
  //    If that number is divisible by 3, then print the word 'Fizz', 
  //    If that number is divisible by 5, then print the word 'Buzz', 
  //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'
  //
  //    NOTE: this is a kata (higher level instructions)
  //    part of the exercise is to translate into line-by-line English, THEN Java
  //if divisible by three, print out 'fizz
  public static void main(String[] args)
  {
    for (int i = 1; i <= 100; i++)
    {
      if (i % 3 == 0 && i % 5 == 0 == false)
      {
        System.out.println("Fizz");
      }
      else if (i % 5 == 0 && i % 3 == 0 == false)
      {
        System.out.println("Buzz");
      }
      else if (i % 3 == 0 && i % 5 == 0)
      {
        System.out.println("FizzBuzz");
      }
      else
      {
        System.out.println(i);
      }
    }
    // if divisible by five, print oit 'buzz'
    // if both, 'fizz buzz'
    //
    //    For more complete directions see this page
    //    https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
  }
}
