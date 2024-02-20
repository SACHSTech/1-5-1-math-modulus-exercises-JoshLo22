class Power extends ConsoleProgram {

  /**
  * A program Power.java that let you enter two numbers a,b, and that prints out a^b
  * @author:Josh Lo
  */
  
  public void run() {
    
  // Declare variables
  double dblNumOne;
  double dblNumTwo;
  double dblFinal;

  // Get variables
  dblNumOne = readDouble("Enter a value for the base: ");
  dblNumTwo = readDouble("Please enter the power: ");

  // Calculate
  dblFinal = Math.pow(dblNumOne, dblNumTwo);

  // Show result
  System.out.println("The final value of the exponent is " + dblFinal);
    
  }
}