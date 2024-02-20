class FtoC extends ConsoleProgram {

  /**
  * A program FtoC.java that lets you enter a degree measure in Fahrenheit, and that prints the result in celsius degree measure
  * @author:Josh Lo
  */
  
  public void run() {
    
    // Declare variables
    int intTempFar;
    double dblTempFar;
    double dblTempCel;
    int intTempCel;

    // Get variables
    intTempFar = readInt("Insert the tempature in Farenhiet: ");

    // Calculate
    dblTempFar = (double)intTempFar;
    dblTempCel = (dblTempFar - 32) * 5 / 9;
    intTempCel = (int)dblTempCel;

    // Show result
    System.out.println("The tempature is " + intTempCel + "°C");
  }
}