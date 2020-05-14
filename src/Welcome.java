public class Welcome {
    public static void welcome(String[] board) {
        System.out.println("Welcome to 2 Player Tic Tac Toe.");
        System.out.println("--------------------------------");
        Display.display(board);
        System.out.println("X's will play first. Enter a slot number to place X in:");
    }
}
