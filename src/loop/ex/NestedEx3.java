package loop.ex;

public class NestedEx3 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for(int k = rows-i; k >=0; k--){
                System.out.print(" ");
            }


            for (int j = 1; j <= (2*i)+1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
