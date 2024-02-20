class Minutes extends ConsoleProgram {

  /**
  * A program Minutes.java that lets you enter a number of minutes, and that will calculate the number of days, hours and minutes that represents.
  * @author:Josh Lo
  */
  
  public void run() {
    
    // Declare variables
    int intMins;
    int intDays;
    int intRemainMins;
    int intHours;
    int intFinalMins;

    // Get variables
    intMins = readInt("Enter the number of minutes: ");

    // Calculate
    intDays = intMins / 1440;
    intRemainMins = intMins % 1440;
    intHours = intRemainMins / 60;
    intFinalMins = intRemainMins % 60;

    // Show result
    System.out.println("That is about " + intdays + " days, " + intHours + "hours, and "+intFinalMins+ "minutes");
    
  }
}