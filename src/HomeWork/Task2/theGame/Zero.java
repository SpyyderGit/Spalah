package HomeWork.Task2.theGame;

/**
 * Created by Jerald_PC on 15.12.2016.
 */
public class Zero {

    private void field(int x, int y, char ch) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == y && j == x) {
                    System.out.print(ch + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Zero zero = new Zero();
        zero.field(1, 2, 'O');
        zero.field(1, 2, 'X');

    }

}
