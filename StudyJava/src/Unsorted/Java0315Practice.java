/*
public class Java0315Practice {
    public static void main(String[] args) {
        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        String str = "This is a really simple sentence";


        char[] cArray = str.toCharArray();

        int count = 0;
        int space = 0;
        for(int i= 0; i<cArray.length; i++){

            if(cArray[i]=='a'|'e'){
                count=count+1;
            }else if(cArray[i]==' '){
                space=space+1;
            }
        }

        System.out.println("모음의 개수:" + count);
        System.out.println("자음의 개수:" + (cArray.length - (space+ count)));
    }
}
*/
