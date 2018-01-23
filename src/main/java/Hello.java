/*
Hello, set language in File ->Project Structure
 */
public class Hello {
  /**
   * This is a class used for testing code from the class.
   *
   * @param args Standard parameter.
   */
  public static void main(String[] args) {
    System.out.println("Hello World");

    // the following line has a value that is too large
    // int largeInt = 2_344_987_998;
    int testInt = 2_333_237;

    // width of int = 32 bits
    // width of float = 32 bits
    // width of double 64 bits

    // char and boolean
    char myChar = 'T';
    char newChar = '3';
    char testCode = '\u2764';

    System.out.println("Test of unicode " + testCode);

    String myString = "Testing the string";

    System.out.println("The length of the string is: " + myString.length());

    boolean isAlien = false;
    if (isAlien == false) {
      System.out.println("It is not an alien!!");
    }
    System.out.println();
    System.out.println("isAlien = " + isAlien);


    // keywords and variables
    int int2 = 25;
    int int3 = 34;

    // statements whitespace and indenting

    //code blocks and If flow control
    int score = 5000;
    boolean gameOver = true;

    if (score < 5000 && score > 1000) {
      System.out.println("Your scroe was between 1000 and 5000");
    }

    calculateScore(true, 300, 3, 30);

    calculateScore("Jphn", 75);
    calcualteScore(75);

    switchStatements();
  }

  /**
   * This method calculates a score.
   *
   * @param gameOver
   * @param score
   * @param levelCompleted
   * @param bonus
   */
  public static void calculateScore(final boolean gameOver, final int score,
                                    final int levelCompleted, final int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
    }
  }

  /**
   * This is an example of method overloading.
   *
   * @param playerName
   * @param score
   */
  public static void calculateScore(String playerName, int score) {
    System.out.println("Player name is " + playerName + " with score" + score);
  }

  /**
   * Another example of method overloading.
   *
   * @param score
   */
  public static void calcualteScore(int score) {
    System.out.println("The score of the player is " + score);
  }

  // Section 6 Control Flow - switch, for, do ...while and while

  /**
   * Example of a switch statement.
   */
  public static void switchStatements() {
    System.out.println("switch statements");
    int switchValue = 1;
    switch (switchValue) {
      case 1:
        System.out.println(" Value was 1");
        break;
      case 2:
        System.out.println("Value was 2");
        break;
      default:
        System.out.println("Was not 1 or 2");
        break;
    }

    char charSwitch = 'A';
    switch (charSwitch) {
      case 'A':
        System.out.println("Value is A");
        break;
      case 'B':
        System.out.println("Value is B");
        break;
      case 'C':
        System.out.println("Value is C");
        break;
      case 'D':
        System.out.println("value is D");
        break;
      default:
        System.out.println("The char is unknown.");
    }

    // note using Strings in a switch statement are case-sensetive
    // change all incoming strings to lower case

  }


}