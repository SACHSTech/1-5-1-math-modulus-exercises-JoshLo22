class Circumference extends ConsoleProgram {

  /**
  * Description This program will find you the circumference
  * @author:Josh Lo
  */
  
  public void run() {
    
    // start coding here
     double radius = readDouble("Please enter the radius: ");
     double circumference = (radius * 2 * Math.PI);
     System.out.println("The circumference is: "+circumference);
  
  }
}