package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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
        label1:
        {
            if (a1 == a2)
            {
                System.out.print(a1 + " " + a2);
                if (a1 == a3)
                {
                    System.out.println(" " + a3);
                    break label1;
                }
            } else if (a1 == a3) System.out.println(a1 + " " + a3);
            if (a2 == a3) System.out.println(a2 + " " + a3);
        }

        //напишите тут ваш код

    }
}