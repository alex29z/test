package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println(zn(x)+ch(x)+"число");
    }
    public static String zn(int a)
    {
        String s = null;
        if (a < 0) s = "отрицательное ";
        else if (a == 0) s = "нулевое ";
             else if (a > 0) s = "положительное ";
        return s;
    }
    public static String ch(int a)
    {
        String s;
        if (a == 0) s = "";
        else if (a/2*2 == a) s = "четное ";
        else  s = "нечетное ";
        return s;
    }
}
