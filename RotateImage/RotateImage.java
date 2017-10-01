package CodeFighters;

public class RotateImage {
    /*
    * You are given an n x n 2D matrix that represents an image.
    * Rotate the image by 90 degrees (clockwise).
    * a = [[1, 2, 3],
           [4, 5, 6],
           [7, 8, 9]]

    rotateImage(a) = [[7, 4, 1],
                      [8, 5, 2],
                      [9, 6, 3]]
    * */

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int newArr[][] = new int[arr.length][arr.length];

        System.out.println("No. of rows and Columns: " + arr.length + "\n" + "Input is:");

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr.length; column++) {
                System.out.print(arr[row][column] + "\t");
            }
            System.out.println();
        }

        System.out.println("Output is:");
        int i =0, j=0;
        for (int column = 0; column <= arr.length-1; column++) {
            j=0;
              for (int row = arr.length-1; row >= 0; row--) {
                //System.out.println("Column Value" + "Row value" + column + "\t");
                System.out.print(arr[row][column] + "\t");
                newArr[i][j] = arr[row][column];
                j++;

            }
            System.out.println();
              i++;
        }

        System.out.println("New Array");
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr.length; column++) {
                System.out.print(newArr[row][column] + "\t");
            }
            System.out.println();
        }

    }
}
