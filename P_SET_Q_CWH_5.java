import java.util.Scanner;
public class P_SET_Q_CWH_5
{
    public static void main(String[] args)
    {
        Scanner Sc= new Scanner(System.in);
////Q no 1 solution (adddition of arry )
//        float [] digits={2.1f,2.2f,2.3f,2.4f,2.5f};
//        float sum=0;
//        for(int i=0;i< digits.length;i++)
//        {
//             sum =sum+digits[i];
//        }
//        System.out.println(sum);
////Q no 2
//        float [] Wights={2.1f,2.2f,2.3f,2.4f,2.5f};
//        boolean IN_THE_ARRAY=false;
//        System.out.print("enter a float that u want to chque :");
//        float num= Sc.nextFloat();
//        for (int i=0;i<=Wights.length;i++)
//        {
//            if(num==Wights[i])
//            {
//                System.out.println("this num is availiable in the array");
//            }
//            else if(num!=Wights[i])
//            {
//                System.out.println("this num is not availiavble in the array");
//            }
//        }
// Q no 3 solution (find the avrage of the wight of the given arrry)
//        float [] digits={2.1f,2.2f,2.3f,2.4f,2.5f};
//        float sum=0;
//        for(int k=0;k<digits.length;k++)
//        {
//           sum =sum + digits[k];
//        }
//        float avg=sum/digits.length;
//     System.out.println("sum of the wight is  "+sum+"  and the avrage of the all wight is: "+avg);

//Q no 4 solution (addition of two matrix order of (2x3)
//    int [][]mat1={{1,2,4},00
//                  {5,6,7}};
//    int [][]mat2 ={{3,1,2},
//                   {8,9,3}};
//    int [][]sum ={{0,0,0},
//                  {0,0,0,}};
//        for (int i=0;i< mat1.length;i++)
//        {
//            for (int j = 0; j < mat1[i].length; j++)
//            {
//                sum[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//    for (int i=0;i< mat1.length;i++)
//       {
//           for (int j = 0; j<mat1[i].length; j++)
//          {
//              System.out.print(sum[i][j]+" ");
//
//          }
//           System.out.println("");
//       }
////    Q np 5 solution( array revercing in array )

//        int arr[]={1,2,3,4,5,6};
//        int temp;
//        int l= arr.length;
//      //  int mid = Math.floorDiv(l,2);///////apan ye bhi kar sakte hai floorDiv lagane ki zarurat nahi hai///
//        int mid= l/2;
//        for(int i=0;i <=mid;i++)
//        {
//            temp = arr[i];
//            arr[i]= arr[l-1-i];
//            arr[l-1-i]= temp;
//        }
//        for (int i=0;i<l;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
        ////Q no 6 solution (maximum and the minimum value in the arry )
//     int arr[]= {1,2,3,9,5,6};
//      int min=arr.length,max=0;
//      for(int i=0;i<arr.length;i++)
//      {
//          if (arr[i]>max)
//          {
//            max=arr[i];
//          }
//          for(int j=0;j<arr.length;j++)
//          {
//              if (arr[j] < min)
//              {
//                  min = arr[j];
//              }
//          }
//      }
//        System.out.println("the maximum value in the array is "+max);
//        System.out.println("the minimum value in the array is "+min );
        ////Q no 7 SOLUTION (PRINT MARKS IN 3 SUBJECT  OF TWO STUDENT)
//        System.out.print("enter the no of student : ");
//        int  roll= Sc.nextInt();
//        System.out.print("enter the no of subject for the student :");
//        int  s=Sc.nextInt();
//        int[]stu=new int[roll];
//        int[]sub=new int[s];
//        for(int i=0;i<stu.length;i++)
//        {
//            for(int j=0;j<sub.length;j++)
//            {
//
//                System.out.print("enter the marks of student "+(i+1)+" in subj "+(j+1)+ " is :");
//                sub[j]=Sc.nextInt();
//            }
//        }
//        for(int i=0;i<stu.length;i++)
//        {
//
//            for(int j=0;j<sub.length;j++)
//            {
//
//                System.out.println(" the marks of student "+(i+1)+" in subj "+(j+1)+ " is :"+sub[j]);
//                //stu[i]=Sc.nextInt();
//            }
//        }
////Q no 8 solution (find indx value of a array by comparing )
//        System.out.print("enter the length of the array :");
//        int size = Sc.nextInt();
//        int[]num =new int[size];
//        for (int i=0;i<size;i++)
//        {
//            System.out.print("enter the value of the "+(i+1)+" no :");
//             num[i]=Sc.nextInt();
//        }
//        System.out.println("the enter value of  the array are as follow :");
//        for (int i=0;i<size;i++)
//        {
//            System.out.println(+num[i]);
//        }
//        System.out.println("enter the value of the X :");
//        int x=Sc.nextInt();
//        for (int i=0;i<size;i++)
//        {
//          if(num[i]==x)
//          {
//              System.out.println("the no is exist in the array and the value found at the index value of : "+i);
//          }
//
//        }
////Q no

    }
}
