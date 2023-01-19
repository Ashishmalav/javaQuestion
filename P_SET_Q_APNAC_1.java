import java.util.Scanner;

public class P_SET_Q_APNAC_1
{
    public static  void main(String[]args)
  {
      Scanner sc= new Scanner(System.in);
      System.out.print("enter the length of the list :");
      int l=sc. nextInt();
      String list[]=new String[l];
      for(int i=0;i<l;i++)
      {
          System.out.print("enter the name of the student "+(i+1)+" : ");
            list[i]=sc.next();
      }
      for (int i=0;i<l;i++)
      {
          System.out.println((i+1)+"   "+list[i]);
      }
  }
}
