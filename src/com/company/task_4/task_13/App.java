package com.company.task_4.task_13;

import  java.util.Arrays;

public class App {
    public static void main(String... args){
        int [] arraynesort = {1,2,5,8,9,0,10};
        System.out.println(Arrays.toString(arraynesort));
        bubble(arraynesort);
    }
    public  static  void bubble (int [] arraysort){
        int count;
        do {

            count=0;
            for (int index = 0; index < arraysort.length-1; index++) {
                if (arraysort[index] > arraysort[index+1]){
                    int numbers = arraysort[index];
                    arraysort[index] = arraysort[index+1];
                    arraysort[index+1] = numbers;
                    count++;
                }
            }
        }
        while (count> 0);
        System.out.println(Arrays.toString(arraysort));
    }

}