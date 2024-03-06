import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class arrayPractice0306 {
    public static void main(String[] args) {
        /*int[] intArray1= new int[3];
        for (int i=0; i<intArray1.length; i++) {
            intArray1[i] = i + 1;
            System.out.print(intArray1[i] +" ");
        }*/

        int[] intArray2= new int[10];
        int len = intArray2.length;//len선언이 for문 안에 있는 경우와 비교
        for (int i=0; i<intArray2.length; i++){
            intArray2[i]= len;
            len= len-1;

        }
        System.out.print(Arrays.toString(intArray2));

        int appleCount=0;
        String[] fruitList= {"배", "사과", "바나나", "딸기", "사과", "수박"};
                for(int i=0; i < fruitList.length; i++){
                    if(fruitList[i]=="사과"){
                        appleCount= appleCount+1;
                    }

                }
        System.out.println(appleCount);

        //자바에서 입력값을 얻는 방법
        Scanner sc = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc.nextInt();
        if (inputNumber>=0 && inputNumber <=6){
            System.out.println(inputNumber);
        }else {
            System.out.println("잘못입력하셨습니다.");
        }

    }
}
