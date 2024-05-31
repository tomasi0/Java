package Java0326Example2;

public class InsertionSortExample {

    // Insertion 정렬의 알고리즘을 이해하고
    // 어떤 정렬상태가 주어졌을때 가장 빨리 정렬을 마무리할지 생각해봅시다!! = Best Case
    // 반대로 어떤 정렬 상태가 주어졌을때 가장 오래 걸릴까?? = Worst Case
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key; //좌우변이 같은 인덱스를 갖는데? 뭘 위해 작성된 코드인지?
            // 해답을 알았음. j가 1일때 while문은 지난 array[1]의 참조값은 이미 array[0]의 메모리를 가리키고있음
            // 그러나 일반자료형(int) key는 while문 이전의 array[1] 값을 복사해서 갖고있음 즉 key와 array[j](array[1])값이 달라졌음
            // 그래서 17줄의 코드 array[i+1]의 주소값에 key를 대입하는것은 유의미함
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}