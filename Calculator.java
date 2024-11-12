import java.util.*;

 // Compiler version JDK 11.0.2

 public class calculator 
 {
   public static void main(String args[])
   { 
     Scanner sc = new Scanner(System.in);
    System.out.println("enter two number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println("enter your operator:(+,-,*,/,%)");
    char op = sc.next().charAt(0);
    switch (op)
    {
      case'+':System.out.println(a+b);
      break ;
      case'-':System.out.println(a-b);
      break ;
      case'*':System.out.println(a*b);
      break ;
      case'/':System.out.println(a/b);
      break ;
      case'%':System.out.println(a%b);
      break ;
      default:System.out.println("invalid input");
    }
    
    
   }
 }