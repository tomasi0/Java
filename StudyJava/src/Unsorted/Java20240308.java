package Unsorted;

public class Java20240308 {
    public static void main(String[] args) {
        Students tom = new Students("Tom", 18, "Daejeon", "123456");
        Students steve = new Students("Steve", 25, "Seoul", "246810");
        Students paul = new Students();
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");
        tom.displayAll();
        steve.displayAll();
        paul.displayAll();
        System.out.println(tom.getPersonalNum());

        //메소드 호출
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList2 = {123,345,567,789,121};
        getSumAvg(numberList);
        getSumAvg(numberList2);

    }
    static void getSumAvg(int[] numberList) {
        // 7. 아래 배열의 총합과 평균을 출력

        int sum = 0;
        for (int i=0; i<numberList.length; i++) {
            sum = sum + numberList[i];
        }
        int average = sum / numberList.length;
        System.out.println(sum + " " + average);
    }
}