public class InvertedHalfpyramid {
  public static void main(String[] args) {
      int n=4;

      //outerloop
      for(int i =1;i<=n;i++){
        //inner loop for space
        for(int j =1;j<=n-i;j++){
          System.out.print((" "));
        }
        
          //innerloop for star print
          for(int k=1;k<=i;k++)
          {
            System.out.print("*");
          }
          System.out.println();
      }
  }
}
