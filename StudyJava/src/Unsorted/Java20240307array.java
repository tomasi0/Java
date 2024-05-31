package Unsorted;

import java.util.Random;
import java.util.Scanner;

public class Java20240307array {
    public static void main(String[] args) {
        // 7. 아래 배열의 총합과 평균을 구하시오
       /* int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int sum = 0;
        for(int i=0; i< numberList.length; i++){
            sum = sum + numberList[i];
        }
        int average= sum/ numberList.length;
        System.out.println(sum + " " + average);*/

        // 8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        // 예) hello를 입력하면 olleh를 출력

        /*Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("아무 말이나 입력해보세요");
        str = sc.nextLine();
        System.out.println(str);*/

        //난수생성법. Random 숫자 만드는 법
        /*Random rd = new Random();
        int randNum = rd.nextInt(10)+1; //0부터 입력한 정수값 -1 범위에서 랜덤, +1을 붙이면 1부터 입력한 정수값 범위에서 랜덤
        System.out.println(randNum);*/

        //9.로또생성기
        Random rd = new Random();
        int randNum = rd.nextInt(45)+1;
        //System.out.println(randNum);

        int [] rottoArray = new
                int[6];
            for (int i = 0; i < rottoArray.length; i++){

                rottoArray[i]=randNum;

                System.out.print(rottoArray[i] + " ");
        }
    }
}
