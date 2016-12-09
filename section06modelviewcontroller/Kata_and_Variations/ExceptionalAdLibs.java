package org.teachingkidsprogramming.section06modelviewcontroller.Kata_and_Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = asksAdverb();
    MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEdVerb();
    MessageBox.showMessage("The verb ending in '-ed' is " + edVerb);
  }
  public static String asksAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb?");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb.");
      adverb = asksAdverb();
    }
    return adverb;
  }
  public static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("What is the verb that ends in '-ed'?");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Please enter a verb that ends in '-ed'.");
      edVerb = askEdVerb();
    }
    return edVerb;
  }
}