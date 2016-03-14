package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snum = reader.readLine();
        int num = Integer.parseInt(snum);
        if ( 1 <= num && num <= 999) System.out.println(chet(num) + " " + lenght(snum) + " число");
    }
    public static String chet(int x){
        String S;
        if (x%2 == 0) S = "четное";
        else S = "нечетное";
        return S;
    }
    public static String lenght(String a){
        String S = null;
        if (a.length() == 1) S ="однозначное";
        if (a.length() == 2) S ="двузначное";
        if (a.length() == 3) S ="трехзначное";
        return S;
    }
}
