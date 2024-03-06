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

        /*int[] intArray2= new int[10];
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
        System.out.println(appleCount);*/

        //자바에서 입력값을 얻는 방법
        /*Scanner sc = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc.nextInt();
        if (inputNumber>=0 && inputNumber <=6){
            System.out.println(inputNumber);
        }else {
            System.out.println("잘못입력하셨습니다.");
        }*/

        /*//자바에서 문자열을 입력 받는 방법
        Scanner sc2 = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 : ");
        String inputStr = sc2.nextLine();
        System.out.println(inputStr);
        //4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력*/
       /* char[] Week = {'월','화','수','목','금','토','일'};
        Scanner scan = new Scanner(System.in);
        System.out.println("0~6까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();*/

        //5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // "입력된이름님 환영합니다"를 출력하고
        // 없으면 "회원가입해주세요"를 출력
        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner scan = new Scanner(System.in);
        System.out.println("0~6까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();
        if (num>=0 && num <=6){
            System.out.println(String[num]);
        }

    }
}
