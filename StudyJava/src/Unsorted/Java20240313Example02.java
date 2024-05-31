package Unsorted;

public class Java20240313Example02 {
    public static void main(String[] args) {

        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;

        char[] cArray = string.toCharArray();
        //System.out.println(cArray);

        for(int i= 0; i<cArray.length; i++){
            if(cArray[i]!=' '){
                count = count+1;
            }
        }
        System.out.println(count);




    }
}
