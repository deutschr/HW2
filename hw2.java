import java.util.Scanner;

public class hw2
 {
  public static void main(String []args){
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the number you want to take the squareroot of: " );
      double number = keyboard.nextDouble();
      System.out.print("Please enter how much error will be allowed: ");
      double error = keyboard.nextDouble();
      double ans =calcSQRT(number,error,number);
      System.out.println("Your answer is " + ans);
  }  
      private static double calcSQRT(Double guess,Double error,Double number)
      {
        double newGuess = (0.5)*(guess + (number/guess));
        
        if ((Math.abs(Math.sqrt(number)-newGuess)) <= error)
        {
          return newGuess;
        }
        
       else
       {
         return calcSQRT(newGuess,error,number);
       }
       
 
 }
}

  
  
  
  
 

  