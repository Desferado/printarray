import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {5,4,3,2,1,0};
        for (int i = array.length-1; i >= 0; i--){
            if (i == array.length - 1){
                System.out.print("[" + array[i] + ", ");
            } else if (i != 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + "]");
            }
        }
        System.out.println();
        int [] arrayNew = new int [6];
        for (int i = 0; i < arrayNew.length; i++){
            arrayNew[i] = array[array.length-1-i];
        }
        System.out.println(Arrays.toString(arrayNew));
    }
}