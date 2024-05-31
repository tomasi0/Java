package Unsorted;

import java.util.Arrays;

public class practice0305 {
    public static void main(String[] args) {
        //배열의 값 대입 방법1
        int[] array1 = new int[3];
        array1[0] = 3;
        array1[1] = 4;
        array1[2] = 5;
        System.out.println(array1[0]+ " " + array1[1] + " " + array1[2]);

        int[] array2;
        array2 = new int[3];
        array2[0] = 3;
        array2[1] = 4;
        array2[2] = 5;
        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);

        //배열의 값 대입 방법2
        int[] array3 = new int[]{3,4,5};
        System.out.println(array3[0]+ " " + array3[1] + " " + array3[2]);

        int[] array4;
        array4 = new int[]{3,4,5};
        System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);

        // 배열의 값 대입 방법3
        int[] array5 = {3, 4, 5};
        System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);

        // int[] array6;
        // array6 = {3, 4, 5}; //불가능
        // System.out.println(array6[0] + " " + array6[1] + " " + array[2]);

        //배열의 초기화
        //배열을 선언, 생성하고 입력값을 넣지 않은 경우, 자동으로 초기값이 입력됨
        int[] intList = new int[3];
        float[] floatList = new float[3];
        boolean[] boolList = new boolean[3];
        char[] charList = new char[3];
        String[] strList = new String[3];
        System.out.println(Arrays.toString(intList));
        System.out.println(Arrays.toString(floatList));
        System.out.println(Arrays.toString(boolList));
        System.out.println(Arrays.toString(charList));
        System.out.println(Arrays.toString(strList));
    }
}
