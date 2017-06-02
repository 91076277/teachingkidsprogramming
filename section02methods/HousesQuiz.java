package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends HousesQuizAdapter
{
  public void questions1Thru6()
  {
    // Question 1 
    //   small (recipe below) 
    small();
    //
    //   Question2
    //   medium (recipe below) 
    medium();
    //
    //   Question3
    //   large (recipe below) 
    large();
    //
    //   Question4
    //   moveTheLength (recipe below) 
    //   ------------- Recipe for moveTheLength 
    moveTheLength();
    //
    //   Question5
    //   turnTheCorner (recipe below) 
    //
    //   Question6
    //   drawASide (recipe below) 
    //   ------------- Recipe for drawASide 
    //      call moveTheLength and turnTheCorner
    moveTheLength();
    turnTheCorner();
    //   ------------- End of drawASide recipe
  }
  public void turnTheCorner()
  {
    //   ------------- Recipe for turnTheCorner 
    //      turn the Tortoise 1/3 of 360 degrees to the left
    Tortoise.turn(360 / 3);
    //   ------------- End of turnTheCorner recipe
  }
  public void moveTheLength()
  {
    //      move the Tortoise the current length
    Tortoise.move(length);
    //   ------------- End of moveTheLength recipe
  }
  public void large()
  {
    //   ------------- Recipe for large 
    //      set the current length to 63
    length = 63;
    //   ------------- End of large recipe
  }
  public void medium()
  {
    //   ------------- Recipe for medium 
    //      set the current length to 21
    length = 21;
    //   ------------- End of medium recipe
  }
  public void small()
  {
    //   ------------- Recipe for small 
    length = 7;
    //   ------------- End of small recipe
  }
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
