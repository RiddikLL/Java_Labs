package Lab8;

import java.util.Scanner;

public class Lab8Tester
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input k = ");
        int k=in.nextInt();

        System.out.print("Input s = ");
        int s= in.nextInt();

        System.out.println("Result = "+ SumChecker(k,s));

    }
    static int SumChecker(int k, int s)
    {
        int startNumber=(int)Math.pow(10,k-1);
        int endNumber=(int)Math.pow(10,k)-1;

        int currentNumber=startNumber;
        int sumCoutr =0;
        while(currentNumber <= endNumber)
        {
            if(DigeitsSum(currentNumber)==s)
                sumCoutr++;
             currentNumber++;
        }
      return sumCoutr;

    }
    static int DigeitsSum(int number)
    {
        int sum=0;
        while(number>0)
        {
            sum+=number%10;
            number /=10;
        }
        return sum;
    }

}
