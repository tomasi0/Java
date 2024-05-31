package Unsorted;

public class Java20240305 {
    public static void main(String[] args) {
        //break == 제어문의 중괄호를 탈출시키는 키워드
        for (int i=0; i<10; i++) {
            System.out.println(i);
            if (i>5) {
                break;
            }
        }

        //2중 for문에서의 break 사용법
        for (int i= 0; i< 10; i++) {// 0부터 9까지 i를 1씩 증가
            for (int j=0; j < 10; j++) {// 0부터 9까지 j를 1씩 증가
                if (j == 3) {//만약 j == 3이 true라면
                    i=999999999; //매우 큰 수를 세팅해서 바깥 for문 탈출 //i는 999999999
                    break;
                }
                System.out.println(i + ","+ j);
            }
        }//????????? 왜 if문의 중괄호 안에 있는 break 가 for문의 중괄호를 탈출시키는걸까?

        // 바깥 for문까지 탈출하는 방법
        out:
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (j==3) {
                    break out;
                }
                System.out.println(i + "," + j);
            }
        }

        //continue 사용법
        for (int i=0; i<10; i++) {
            if(i % 2 == 1) {//홀수의 경우 아래 출력물을 실행하지 않음
                continue;
            }
            System.out.println(i);
        }

        //2중 for문에서의 continue
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j==3){
                    continue;//j가 3인 경우만 다음 줄의 sout이 실행이 안 됨.
                }
                System.out.println(i + "," + j);
            }

        }

        for (int i=0; i<5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break;
                }
                System.out.println(i + "," + j);
            }
        }
    }
}
