package CodeFighters;

public class FirstDuplicate {

    /*Given an array a that contains only numbers in the range from 1 to a.length,
    * find the first duplicate number for which the second occurrence has the minimal index.
    * In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence
    * has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.*/

    public static void main(String[] args) {

        int arr[] = {2, 4, 3, 5, 1};

        //int arr[] = {2, 3, 3, 1, 5, 2};
        //int arr[] = {8, 4, 6, 2, 6, 4, 7, 9, 5, 8};
        //System.out.println(arr.length);
        for (int i = 1; i <= arr.length; i++) {
            int position = Math.abs(i) - 1;
            int value = Math.abs(arr[position]);
            if (arr[value-1] >= 0)
                arr[value-1] = -1 * arr[value-1];
            else {
                System.out.print(value + " ");
                break;
            }

        }
        System.out.println(-1);
        //return -1;


        System.out.println("Hello");
    }

}
