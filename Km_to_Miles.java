
class Km_to_Miles extends ConsoleProgram {

  /**
  * A program Km_to_Miles.java  that lets you enter a distance in kilometers and that converts it into miles.
  * @author:Josh Lo
  */
  
  public void run() {
    
    // Declare variables
    double dblKm;
    double dblMiles;

    // Get variables
    dblKm = readDouble("Please enter kilometeres that you wish to convert: ");

    // Calculate
    dblMiles = dblKm * 0.621371;

    // Show result
    System.out.println("This is around " + dblMiles + " miles");
    
  }
}
