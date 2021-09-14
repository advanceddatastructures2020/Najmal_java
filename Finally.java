 public class Finally
 {
 public static void main(String args[])
 {
 int num1=100;
 int num2=50;
 int num3=50;
 int result1;

 try
 {
 result1=num1/(num2-num3);
 System.out.println("Result1= "+ result1);
 }
 catch(ArithmeticException g)
 {
 System.out.println("Division by zero");
 }
 finally
 {
 System.out.println("This is final");
 }
 }
 }