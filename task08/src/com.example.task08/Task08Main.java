package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        int length= arr.length;;
        if(length==0) return 0;
        long mult=1;
        for(int i=0;i<length;i++){
            mult*=arr[i];
        }

        return mult;
    }

}