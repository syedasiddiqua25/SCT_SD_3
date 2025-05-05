import java.util.Scanner;

public class Solver {
  private static int[][] board = new int[9][9];

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("\u001b[35;1m Welcome to the sudoku solver!\u001b[35;1m ");
    System.out.println("\u001b[36m Type initial values separated by spaces, \nwith zeros for blank spots.\u001b[36m ");
    
    for (int y = 0; y < 9; y++) {
      System.out.print("\u001b[37m  Enter row values: \u001b[37m ");
      for (int x = 0; x < 9; x++) {
        board[x][y] = keyboard.nextInt();
      }
      keyboard.nextLine();
    }

    System.out.println("Initial state:");
    printBoard();

    if (solve()) {
      System.out.println("Solved state:");
      printBoard();
    } else {
      System.out.println("No solution exists.");
    }
  }

  public static boolean solve() {
    int[] next = findOpenCell();
    if (next == null) return true;

    int x = next[0];
    int y = next[1];

    for (int num = 1; num <= 9; num++) {
      if (checkRow(num, x) && checkColumn(num, y) && checkBox(num, x, y)) {
        board[x][y] = num;
        if (solve()) return true;
        board[x][y] = 0; 
      }
    }

    return false;
  }

  public static boolean checkRow(int val, int x) {
    for (int i = 0; i < 9; i++) {
      if (board[x][i] == val) return false;
    }
    return true;
  }

  public static boolean checkColumn(int val, int y) {
    for (int i = 0; i < 9; i++) {
      if (board[i][y] == val) return false;
    }
    return true;
  }

  public static boolean checkBox(int val, int x, int y) {
    int i = (x / 3) * 3;
    int j = (y / 3) * 3;
    for (int row = i; row < i + 3; row++) {
      for (int col = j; col < j + 3; col++) {
        if (board[row][col] == val) return false;
      }
    }
    return true;
  }

  public static int[] findOpenCell() {
    for (int y = 0; y < 9; y++) {
      for (int x = 0; x < 9; x++) {
        if (board[x][y] == 0) {
          return new int[] { x, y };
        }
      }
    }
    return null;
  }

  public static void printBoard() {
    for (int y = 0; y < 9; y++) {
      if (y % 3 == 0) {
        System.out.println("+-------+-------+-------+");
      }
      for (int x = 0; x < 9; x++) {
        if (x % 3 == 0) System.out.print("| ");
        if (board[x][y] == 0)
          System.out.print("_ ");
        else
          System.out.print(board[x][y] + " ");
      }
      System.out.println("|");
    }
    System.out.println("+-------+-------+-------+");
  }
  
}
