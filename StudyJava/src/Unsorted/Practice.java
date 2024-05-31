package Unsorted;

public class Practice {
    public static void main(String[] args) {
    out:
        for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(i==3){
                if(j==2){
                 break out;
                }
            }
            System.out.println("breakLabel");
            }
        }
    }
}