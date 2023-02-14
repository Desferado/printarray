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
    }
}