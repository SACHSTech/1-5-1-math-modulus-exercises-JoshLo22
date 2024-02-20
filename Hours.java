class Hours extends ConsoleProgram {

  /**
  * A program Hours.java that lets you enter a number of hours, and that converts it to days and hours. For example, 111 hours = 4 days and 15 hours
  * @author:Josh Lo
  */
  
  public void run() {
    
    // Declare variables
    int intHours;
    int intDays;
    int intFinalHours;

    // Get variables
    intHours = readInt("Please enter amount of hours: ");

    // Calculate
    intDays = intHours / 24;
    intFinalHours = intHours % 24;

    // Show result
    System.out.println("It will be " + intDays + " days, and " + intFinalHours);
  }
}