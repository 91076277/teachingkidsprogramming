package org.teachingkidsprogramming.section03ifs.Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure_01
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One evening, you found a tortoise in your door step.");
    animateStartStory();
    String action = askAQuestion(
        "Do you want to 'bring' the smol tortoise into your home or pick up and 'throw' the poor, innocent tortoise away from you?");
    if ("bring".equalsIgnoreCase(action))
    {
      //          wakeUp (recipe below) --#2.1
      //          ------------- Recipe for wakeUp --#2.2
      String food = MessageBox
          .askForTextInput("You bring the tortoise into your home. Do you 'feed' it or 'eat' it?");
      if ("feed".equalsIgnoreCase(food))
      {
        MessageBox.showMessage("The turtle is nurished and happy. It is begining to love you.");
      }
      else if ("eat".equalsIgnoreCase(food))
      {
        MessageBox.showMessage(
            "You begin to boil the water, you psycotic human you. The turtle looks at you with pleading eyes.");
      }
      //          ------------- End of wakeUp recipe --#2.3
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      //      approachOoze (recipe below) --#4.1
      //      ------------- Recipe for approachOoze --#4.2
      //         Tell the user "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket." --#3
      //         Ask the user "Do you want to pour the ooze into the 'backyard' or 'toilet'?" --#7
      //         If they answer "toilet" --#8.1
      //            pourIntoToilet (recipe below) --#12.1
      //            ------------- Recipe for pourIntoToilet --#12.2
      //               Tell the user "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste." --#10
      //               Ask the user "Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?" --#11
      //               If they answer "yes" --#13.1
      //                    Tell the user "Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!" --#14
      //               Otherwise, if they answer "heck yes" --#13.2
      //                    Tell the user "Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!" --#15
      //               Otherwise, if they answer anything else --#13.3
      //                    endStory --#16
      //            ------------- End of pourIntoToilet recipe --#12.3
      //         Otherwise, if they answer "backyard" --#8.2
      //            pourIntoBackyard (recipe below) --#19.1
      //            ------------- Recipe for pourIntoBackyard --#19.2
      //                Tell the user "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water." --#17
      //                Ask the user "As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?" --#18
      //                If they answer "faint" --#20.1
      //                        Tell the user "You made a delicious soup! Yum! The end." --#21
      //                Otherwise, if they answer "scream" --#20.2
      //                    startStory --#22
      //                Otherwise, if they answer anything else --#20.3
      //                    endStory --#23
      //         ------------- End of pourIntoBackyard recipe --#19.3
      //         Otherwise, if they answer anything else --#8.3
      //            endStory --#9
      //      ------------- End of approachOoze recipe --#4.3
    }
    else
    {
      //      endStory (recipe below) --#6.1
      //      ------------- Recipe for endStory --#6.2
      //         Tell the user "You don't know how to read directions. You can't play this game. The end." --#5
      //      ------------- End of endStory recipe --#6.3
    }
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
