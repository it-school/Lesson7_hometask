package com.itschool;

public class Main {
    public static boolean isSimple(int n)
    {
        boolean result = false;
        int i = 2;

        if ((n % 2 == 1) || (n % 5 == 1))
        {
            for (; i < n / 2; i++)
                if (n % i == 0)
                    break;
        }
        if (i == n/2)
            result = true;

        return result;
    }

    public static boolean isDividesBy23569(int n)
    {
        /*
        boolean result = false;

        if ((n % 2 == 0) && (n % 3 == 0) && (n % 5 == 0) && (n % 6 == 0) && (n % 9 == 0))
            result = true;

        return result;
*/
        return ((n % 5 == 0) && (n % 6 == 0) && (n % 9 == 0))? true:false;
    }

    public static void main(String[] args)
    {
        int n = 114;

        System.out.println(n + " is " + (isSimple(n)?" simple":" NOT simple"));
        System.out.println(n + " is divides by 2, 3, 5, 6, 9: " + isDividesBy23569(1621));
    }
}
