package com.company;

public class Main {

    public static void main(String[] args) {
/*
	●	Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
●	Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого отрицательного числа и вывести его на экран
*/
        double n[] = {4.3, -16.7, 100.1, 20.6, 10.1, 5.2, 8.1, 3.5, 8.9, -2.1, -1.1, 1.9, 6.8, -5.5, 10.6};
        double result = 0;
        boolean s1 = false;
        int s2 = 0;
        for (double element : n)  {
            if (element<0) {
                s1= true;
            }
            else if (element>0 && s1 ) {
                result +=element;
                s2++;
                System.out.println(element); // те элементы, которые прошли проверку
            }

                /*result += element;*/

        }


        System.out.println("Среднее Арифметическое " + result/s2);

    }
}
