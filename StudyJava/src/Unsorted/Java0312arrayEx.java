package Unsorted;

public class Java0312arrayEx {
    public static void main(String[] args) {
        //아래 배열의 모든 값들을 다른 배열에 복사하기
        int[] intArray1 = {1,2,3,4,5};
        int[] intArray2= new int[5];
        for(int i= 0; i < intArray1.length; i++){
            intArray2[i] = intArray1[i];
        }

        for(int i= 0; i < intArray2.length; i++){
            System.out.print(intArray2[i]);
        }
    }

    //코드분석


}
