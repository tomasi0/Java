public class Java20240305String {
    public static void main(String[] args) {
        //리터럴로 선언되는 값은 런타임 이전에 이미 메모리에 만들어짐
        String str1 = "start";
        String str2 = "start";
        String str3 = new String("start");
        System.out.println(str1==str2);
        //문자열의 '+' 연산
        String a1= "hello";
        String a2= "world";
        System.out.println(a1 + " " + a2);
        System.out.println(1+"hi"); //1hi
        System.out.println(1+2+"hi"); //3hi
        System.out.println("hi" +1 + 2); //hi12
        //
    }
}
