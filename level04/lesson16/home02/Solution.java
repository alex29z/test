package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length - i - 1; j++)
            {
                if (a[j] <= a[j+1])
                {
                    int c = a[j];
                    a[j] = a[j+1];
                    a[j+1] = c;
                }
            }

        }
        System.out.println(a[1]);
    }
}
