import java.util.*;
public class Main {
  public static void main(String args[])
  {  
      int x;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
      x=sc.nextInt();
      for(int i=1;i<=10;i++)
      {
              System.out.println(i * x);
      }
      
  }
}