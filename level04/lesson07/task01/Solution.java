package com.javarush.test.level04.lesson07.task01;

/* ������ - ��������
������ � ���������� ����� �����. ������� �� ����� ��� ������-�������� ���������� ����:
�������������� ������ ����� - ���� ����� ������������� � ������,
�������������� �������� ����� - ���� ����� ������������� � ��������,
�������� ����� - ���� ����� ����� 0,
�������������� ������ ����� - ���� ����� ������������� � ������,
�������������� �������� ����� - ���� ����� ������������� � ��������.
������ ��� ����� 100:
������������� ������ �����
������ ��� ����� -51:
������������� �������� �����
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println(zn(x)+ch(x)+"�����");
    }
    public static String zn(int a)
    {
        String s = null;
        if (a < 0) s = "������������� ";
        else if (a == 0) s = "������� ";
             else if (a > 0) s = "������������� ";
        return s;
    }
    public static String ch(int a)
    {
        String s;
        if (a == 0) s = "";
        else if (a/2*2 == a) s = "������ ";
        else  s = "�������� ";
        return s;
    }
}
