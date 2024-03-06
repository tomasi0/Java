public class Java20240304 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i= i+1) {
            System.out.println(i);
        }
        //무한루프
        //조건식이 false가 될 수 있는지 여부를 반드시 확인!!!
        /*for (int i=0; i >=0; i++) {
            System.out.println(i);
        }*/

        //for 문 기본 문법 구조
        int a;
        for (a=0; a<3; a++) {
            System.out.println(a + "");
        }
        System.out.println();

        for(int i=0; i<3; i++) {
            System.out.println(i + "");
        }

        for(int i =0; i<100; i++); {
            System.out.println(1+ "");
        }
        System.out.println();

        for(int i = 10; i >0; i--) {
            System.out.println(i+"");
        }
        System.out.println();

        for(int i=0; i<10; i += 2) {
            System.out.println(i+"");
        }
        System.out.println();

        for(int i=0, j= 0; i<10; i++, j++) {
            System.out.println(i + j + "");
        }
        System.out.println();
        
        // for 문의 특수한 형태(무한 루프)
        /*
        for(int i= 0; ; i++) {
            system.out.println(i + " ");
        }
        for(;;){
            system.out.println("무한루프")
        }
        */
        System.out.println();
        
        //무한루프 탈출
        for(int i=0; ; i++) {
            if(i>10) {
                break;
            }
            System.out.println(i + "");    
        }
        System.out.println("무한루프 탈출");

        //for문 변형하기
        int i= 0;
        for ( ; ; i++) {
            if (i<5) {
                System.out.print(i + "");
            }else {
                break;
            }

        }
    //멀티 조건식
        for (int n=0, m=0; n<5 || m<5; n++, m++){
            System.out.println(n + "_" + m + " ");
        }
        //while문
        int count =0; //초기식
        while (count < 5) {//조건식
            System.out.println(count+ " ");
            count++;//증감식
        }
      /*  //의도적인 무한루프에서 while문은 자주 쓰임
        while(true) {
            //무한루프
            //유저가 버튼을 클릭할때까지 대기
            //if (esc버튼 클릭)
            //  break;
        }*/

        //do ~ while 문
        int cnt = 0; //초기식
        do {
            System.out.print(cnt + " ");
            cnt++;
        }while (cnt < 5);
        //아래 while문과 비교하면,
        //반복문의 조건이 처음부터 false인 경우,
        //do~while 문은 실행코드가 1회 실행되는 반면, while문은 실행되지 않음!!
        int cnt2 = 5;
        while (cnt2 < 5) {
            System.out.println(cnt2 + "");
            cnt2++;
        }
        for (int I=0; I<3; I++) {
            for (int j=0; j<5; j++) {
                System.out.println("[I=" + I + ", j=" + j + "]");
            }



        }



    }
}
