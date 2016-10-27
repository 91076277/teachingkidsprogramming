package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What's your guess?");
      //         If the guess is correct --#4
      int answer = 42;
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!");
      }
      else if (guess < answer)
      {
        MessageBox.showMessage("Too low!");
      }
    }
    MessageBox.showMessage("You Lost!");
  }
}
