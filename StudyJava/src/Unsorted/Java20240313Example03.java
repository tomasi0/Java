package Unsorted;

import java.util.Scanner;

public class Java20240313Example03 {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};

        //int n = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("배열을 왼쪽으로 이동시킬 만큼의 정수를 입력하세요");
        int n = sc.nextInt();




        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int j, first;

            first = arr[0];  // 포인트 1
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;  // 포인트 2
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
