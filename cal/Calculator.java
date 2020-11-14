// addition and subtraction interface
interface Add_Sub { 
    public void add(double FirstNumber, double SecondNumber); 
    public void subtract(double FirstNumber, double SecondNumber); 
} 
  
// multiplication and division interface
interface Mul_Div { 
    public void multiply(double FirstNumber, double SecondNumber); 
    public void divide(double FirstNumber, double SecondNumber); 
} 
  
// Calculator interface which extends 
interface Calculator extends Add_Sub, Mul_Div { 
    public void printResult(double result); 
} 
public class MyCalculator implements Calculator { 
  
    public void add(double FirstNumber, double SecondNumber) 
    { 
        double result = FirstNumber + SecondNumber; 
        printResult(result); 
    } 
    public void subtract(double FirstNumber, double SecondNumber) 
    { 
        double result = FirstNumber - SecondNumber; 
        printResult(result); 
    } 
    public void multiply(double FirstNumber, double SecondNumber) 
    { 
        double result = FirstNumber * SecondNumber; 
        printResult(result); 
    } 
    public void divide(double FirstNumber, double SecondNumber) 
    { 
        double result = FirstNumber / SecondNumber; 
        printResult(result); 
    } 
  
    // Implementing a method to print the result 
    public void printResult(double result) 
    { 
        System.out.println( 
            "The result is : " + result); 
    } 
    public static void main(String args[]) 
    { 
  
        // Creating the object of the calculator 
        MyCalculator cal = new MyCalculator(); 
        cal.add(7, 18); 
        cal.subtract(100, 15); 
        cal.multiply(2, 4); 
        cal.divide(12, 3); 
    } 
} 