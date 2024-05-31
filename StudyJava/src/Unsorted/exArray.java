package Unsorted;

import java.util.Scanner;

public class exArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("10개의 양의 정수를 입력하세요");

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }

        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (i < numbers.length-1) {
                continue;

            }
        }
    }
}
