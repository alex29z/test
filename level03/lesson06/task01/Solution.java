package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
      /*  String[] s = {"мама", "мыла", "раму"};
        for (int i=0; i<=2; i++){
            for (int k=0; k<=2; k++){
                for (int m=0; m<=2; m++){
                    if (i!=k && k!=m && i!=m) {
                        System.out.print(s[i]+s[k]+s[m]);
                        System.out.println();
                    }
                }
            }
        }
    }*/
        String a = "Мама", b = "Мыла", c = "Раму";
        System.out.println(a + b + c);
        System.out.println(a + c + b);
        System.out.println(b + c + a);
        System.out.println(b + a + c);
        System.out.println(c + b + a);
        System.out.println(c + a + b);
    }
}