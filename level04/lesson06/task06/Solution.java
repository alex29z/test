package com.javarush.test.level04.lesson06.task06;

/* � 18-�� ����������
������ � ���������� ��� � �������. ���� ������� ������ 20 ������� ������� �� 18-�� ����������.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age > 20) System.out.println("� 18-�� ����������");

    }
}
