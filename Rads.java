class Rads extends ConsoleProgram {

  /**
  * Description THis program will turn degrees into radiance
  * @author:Josh Lo
  */
  
  public void run() {
    
    // start coding here
    double degrees = readDouble ("Please insert your degrees: ");
    double radians = Math.toRadians(degrees);
    System.out.println ("Your radians is "+radians);
    
  }
}