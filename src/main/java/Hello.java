/*
Hello, set language in File ->Project Structure
 */
public class Hello {
  /**
   * @param args
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

    System.out.println("The length of the string is: "+ myString.length());

    boolean isAlien = false;
    if (isAlien == false)  {
      System.out.println("It is not an alien!!");
    }
    System.out.println();
    System.out.println("isAlien = " + isAlien);


    // keywords and variables
    int int2 = 25;

  }
}