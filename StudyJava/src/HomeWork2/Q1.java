package HomeWork2;


public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changeCase(str);
        System.out.println(result); // ChANgE cASe
        System.out.println();
    }

    public static String changeCase(String str) {
        // 여기 코드 작성 !!

        char[] cArray= str.toCharArray();

        for(int i=0; i< cArray.length; i++){
            if(Character.isLowerCase(cArray[i])){
                cArray[i] = Character.toUpperCase(cArray[i]);
            } else if (Character.isUpperCase(cArray[i])) {
                cArray[i] = Character.toLowerCase(cArray[i]);
            }
        }

        return String.valueOf(cArray);
    }
}