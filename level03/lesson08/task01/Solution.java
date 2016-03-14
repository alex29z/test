package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream ssss = System.in;
        Reader isr = new InputStreamReader(ssss);
        BufferedReader br = new BufferedReader(isr);

        String sAge = br.readLine();
        String Name = br.readLine();
        int Age = Integer.parseInt(sAge);
        System.out.println(Name + " захватит мир через " + Age +" лет. Му-ха-ха!");


    }
}