package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int a4 = Integer.parseInt(reader.readLine());
        a1 = max(a1, a2);
        a3 = max(a3, a4);
        a1 = max(a1, a3);
        System.out.println(a1);
    }
    public static int max(int a, int b)
    {
        if (a > b) return a;
        else return b;
    }

}
