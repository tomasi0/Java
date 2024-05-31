package Java0326Example2;

public class StrSumExample {

    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        double sum = 0;
        System.out.println(str.length());


        int i = Integer.parseInt(str);
        System.out.println(i);

        for(int k = 1; k < str.length(); k++){

            double result = Math.pow(10, str.length() -k);

            sum = sum + (i % result );

        }







        System.out.println("합계는 " + sum); // 15

        /*String str = "12345";
        int sum = 0;
        int i = Integer.parseInt(str);
        int sum = (i %10000);

        System.out.println("합계는 " + sum);*/

    }
}