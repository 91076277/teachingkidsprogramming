package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Please enter an adverb.");
    String currentEdVerb = MessageBox.askForTextInput("Please enter a verb ending with '-ed'");
    String currentBodyPart = MessageBox.askForTextInput("Please enter an APPROPRIATE body part.");
    String currentStory = "Today I woke " + currentAdverb + ". Then I " + currentEdVerb + " my " + currentBodyPart
        + ". ";
    MessageBox.showMessage(currentStory);
  }
}