package Java20240327;

public class Example2 {
    public static void main(String[] args) {

        // 문제 2. int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
        // num이 12345 이면 , ‘1+2+3+4+5’ 15 의 결과인 를 출력
        int num = 12345;
        int sum = 0;

        String sNum = Integer.toString(num);//integer 값을 String 형식으로 변수 sNum에 주소값을 저장
        char[] cArray = sNum.toCharArray();// sNum의 주소가 가리키는 값을 char배열로 바꾸고 char 배열 cArray의 주소값에 대입

        int[] iArray = new int[cArray.length];// 정수형 배열을 cArray의 크기만큼 선언

        for( int i=0 ; i < cArray.length; i++){
            iArray[i] = Character.getNumericValue(cArray[i]);
        }// cArray 배열에 getNumericValue매서드를 이용해서 char값을 int 값을 변경하여 iArray의 요소를 작성

        for( int i=0; i < iArray.length; i++){
            sum = sum + iArray[i];
        }// 배열의 모든 값을 더함



        System.out.println("sum="+sum);
    }
}