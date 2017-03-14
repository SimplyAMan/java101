package com.tasks3.fibonacci;

public class Fibonacci
{
    //Повертає число Фібоначчі за номером, нумерація почнеться з одиниці
    //якщо число не можливо вирахувати поверніть -1
    public long getNumber(int position){
        long result = 1;
        if (position < 1)
            result = -1;
        else if (position >= 1 && position < 3)
            result = 1;
        else {
            int [] arr = new int[position];
            arr[0] = arr[1] = 1;
            for (int i = 2; i < position; i++) {
                arr[i] = arr[i-1] + arr[i-2];
                result = arr[i];
            }
        }
        return result;
    }
}