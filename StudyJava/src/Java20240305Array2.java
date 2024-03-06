import java.util.Arrays;

public class Java20240305Array2 {
    public static void main(String[] args) {
        //기본 자료형의 복사 ==> 값 복사
        int a =3;
        int b =a;
        System.out.println(a+ " " +b);// 3, 3
        b = 5;
        System.out.println(a+ " " +b);// 3, 5
        
        //참조자료형의 복사 ==> 참조복사 또는 주소복사
        int[] intlist1 = {3, 4, 5};
        int[] intlist2 = intlist1;
        System.out.println(Arrays.toString(intlist2));
        intlist2[0] = 10;
        System.out.println(Arrays.toString(intlist2));
        System.out.println(Arrays.toString(intlist1));
        
        //배열과 for문의 사용
        //조건식에 배열의 개수(length)를 사용함
        //for (int i=0; i< intlist2.length; i++);
        //System.out.println(intlist2[i]);
        /*for (int i=0; i<3; i++){
            if (i==0) {
                System.out.print("[" + intlist2[i]);
            }else if (i==2) {
                System.out.print(", " + intlist2[i] + "]");
            }else{
                System.out.print(", " + intlist2[i]);
            }
        }*/

    }
}
