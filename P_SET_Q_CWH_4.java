import java.util.Scanner;
public class P_SET_Q_CWH_4{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
////        Q no.1 solution (print star pattern
//          System.out.println("no of row in the pattern :" );
//          int n = Sc.nextInt();
//          for (int i = 1; i <= n; i++)
//          {
//              for (int j =n; j >= i; j--)
//              {
//                  System.out.print("*");
//              }
//              System.out.println();
//          }
////      Q no 2 solution(addition of the n even no )
//        System.out.print("how many even numbers addition you want  :");
//        int a = Sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i < a; i++) {
//            sum = sum+(2 * i);
//        }
//        System.out.print("sum of the first  " + a + " even number till is:  ");
//        System.out.println(sum);
//
////        Q no 2 with while loop
//        System.out.print("no addition of th even no :");
//        int b = Sc.nextInt();
//        int SUM = 0;
//        int i=0;
//        while ( i<b)
//        {
//                 SUM = SUM + (2 * i);
//                 i++;
//        }
//        System.out.print("sum of the first  " + b + " even number till is:  ");
//        System.out.println(SUM);

////        Q no 3(print a  table )
//        System.out.print(" enter a no whose table you want to print:");
//        int T=Sc.nextInt();
//        System.out.println("TABLE OF THE "+ T +" IS :");
//        for(int j=1;j<=10;j++)
//        {  int result=T*j;
//            System.out.println(T + " X " +j+"  =  "+result);
//        }
////        Q no 4( print table in reverce tabele)
//        System.out.print(" enter a no whose reverce  table you want to print:");
//        int R=Sc.nextInt();
//        System.out.println("TABLE OF THE "+ R +" IS :");
//        for(int K=10;K>=1;K--)
//        {  int result=R*K;
//            System.out.println(R + " X " +K+"  =  "+result);
//        }
////     Q no 5(factorial)
//        System.out.print(" enter a value whose factorial you want to get:");
//        int F= Sc.nextInt();
//        int f=1;
//        int factorial=1;
//        while(f<=F)
//        {
//            factorial*=f;
//           f++;
//        }
//        System.out.println(factorial);
////       Q no 6 (addition of table  result )
        System.out.print(" enter a no whose table you want to print:");
        int T=Sc.nextInt();
        System.out.println("TABLE OF THE "+ T +" IS :");
        int RESULT=0;
        for(int j=1;j<=10;j++)
        {  int result=T*j;
            System.out.println(T + " X " +j+"  =  "+result);
            RESULT=RESULT+(j*T);
        }
        System.out.println(RESULT);
    }
}

