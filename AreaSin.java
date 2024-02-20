class AreaSin extends ConsoleProgram {

  /**
  * A program AreaSin.java that uses the Math.sin() function to calculate the area of a triangle, given two sides and the contained angle
  * @author: Josh Lo
  */
  
  public void run() {
    
    // Declare variables
    double dblSide1;
    double dblSide2;
    double dblAngle1;
    double dblArea;

    // Get variables
    dblSide1 = readDouble("Please insert the first side length: ");
    dblSide2 = readDouble("Please insert the second side length: ");
    dblAngle1 = readDouble("Please insert the first angle in radians: ");
  
    // Calculate
    dblArea = dblSide1 * dblSide2 * Math.sin(dblAngle1) / 2;
    
    // Show result
    System.out.println("The area of your shape is " + dblArea);
  }
}