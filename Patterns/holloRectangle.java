public class holloRectangle {
  public static void main(String[] args) {
      int n = 4;
      int m = 5;
      for (int i = 0; i <= n; i++) {
          for (int j = 0; j <= m; j++) {
              if (i == 0 || j == 0 || i == n  || j == m ) {
                  System.out.print("*");
              } else{
                System.err.print(" ");
              }
          }
          System.out.println();
      }
  }
} 