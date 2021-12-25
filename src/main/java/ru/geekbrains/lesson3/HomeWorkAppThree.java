package ru.geekbrains.lesson3;

public class HomeWorkAppThree {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        returnArr(5,3);
        arrMaxMin();

    }

    public static void invertArray() {
        System.out.println();
        System.out.println("Первое задание: ");
        int [] arr1 = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1 ){
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
            System.out.print(arr1[i] + " ");
        }}

    public static void fillArray() {
        System.out.println();
        System.out.println("Второе задание: ");
            int[] arr2 = new int[100];
            int b = 1;
            for (int a = 0; a < arr2.length; a++) {
                arr2[a] = b;
                b++;
                System.out.print(arr2[a] + " ");
            }}

    public static void changeArray() {
        System.out.println();
        System.out.println("Третье задание: ");
            int [] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int c = 0; c < arr3.length; c++) {
                if (arr3[c] < 6) arr3[c] *= 2;
                System.out.print(arr3[c] + " ");
            }}

    public static void fillDiagonal() {
        System.out.println();
        System.out.println("Четвертое задание: ");
        int[][] arr = new int[5][5];
        int d =1;;
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr.length; b++) {
                if (arr[a][a] == arr[b][b]) {
                    arr [a][b] = d;
                }
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }}

    public static int[] returnArr(int len, int initialValue) {
        System.out.println("Пятое Задание: ");
        int[] arr = new int[len];
        for (int a = 0; a < len; a++) {
            arr[a] = initialValue;
            System.out.print(arr[a] + " ");
        } return arr;
    }

    public static void arrMaxMin() {
        System.out.println("Шестое задание: ");
        int[] arr = new int[] {5,4,8,7,11,58,69,42,115,2,78};
        int max = arr[0];
        int min = arr[0];
        for (int a = 0; a < arr.length; a++) {
            if (max < arr[a]) max = arr[a];
            if (min > arr[a]) min = arr[a];
        }
        System.out.println("Max = " + max + " Min = " + min);
    }

        }






