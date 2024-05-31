package Unsorted;

import java.util.Arrays;

public class Java0312Array2 {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++; //배열 arr의 각 항을 비교해서 값이 같은 항의 개수를 count에 저장
                    fr[j] = visited; //왜 visited변수를 만들어서 fr[j]값을 저장할까?
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
            System.out.println(Arrays.toString(fr));
        }

        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
    }
}