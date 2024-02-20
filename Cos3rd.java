class Cos3rd extends ConsoleProgram {

  /**
  * Description This program will take to sides and and angle and find the missing side of the triangle
  * @author: Josh Lo
  */
  
  public void run() {
    
    // start coding here
    double side1= readDouble("What is the length of your first side: ");
    double side2= readDouble("What is the length of your second side: ");
    double angle1= readDouble("What is the length of your angle: ");
    double sideThree = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2)-2*side1*side2*Math.cos(Math.toRadians(angle1)));
    System.out.println("Your third side length will be "+sideThree);
  }
}