import java.util.Scanner;
class Calculator
{
        int addition(int a,int b){
       return a + b;
}
      int subtraction(int a, int b){
      return a-b;
}
      int multiplication(int a,int b){
      return a*b; 
}
      int division(int a, int b){
      return a/b;
}
       public static void main(String[] args)
{
       Calculator cl = new Calculator();
       String exitStatus;
do{
   System.out.println("press1.for addition");
   System.out.println("press2.for subtraction");
   System.out.println("press3.for Multiplication");
   System.out.println("press4.for Division");
   System.out.println("Enter firstNum:");
   Scanner sc = new Scanner(System.in);
   
   int firstNum = sc.nextInt();
   System.out.println("Enter secondNum:");
   int secondNum = sc.nextInt();
   System.out.println("Enter your choice:");
   String choice = sc.next();

   switch (choice)
{
   case"1":
   int sum = cl.addition(firstNum, secondNum);
   System.out.println("summation of the no is=" + sum);
   break;
   case"2":
   int sub = cl.subtraction(firstNum, secondNum);
   System.out.println("Subtraction of the no is=" + sub);
   break;
   case"3":
   int mul = cl.multiplication(firstNum, secondNum);
   System.out.println("Multiplication of the no is="+ mul);
   case"4":
   int div = cl.division(firstNum, secondNum);
   System.out.println("Division of the no is=" +div);
   break;
default:
   System.out.println("You have entered invalid choice");
}
   System.out.println("Press y to continue, n for exit");
   exitStatus = sc.next();
}
   while("y".equalsignoreCase(exitStatus));
   System.out.println("Calculator closed.");
}
}








