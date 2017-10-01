package CodeFighters;

import java.util.HashSet;

public class sumOfTwo {

//You have two integer arrays, a and b, and an integer target value v.
//Determine whether there is a pair of numbers,
//where one number is taken from a and the other from b,
//that can be added together to get a sum of v.
//Return true if such a pair exists, otherwise return false.

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {10, 20, 30, 40};

        int sum = 42;

        sumOfTwo st = new sumOfTwo();
        System.out.println(st.sumOfTwo(a, b, sum));

    }

    boolean sumOfTwo(int[] a, int[] b, int v) {

        HashSet<Integer> arrB = new HashSet<>();
        int i = 0;
        while (i < b.length) {
            arrB.add(b[i]);
            i++;
        }
        i = 0;
        while (i < a.length) {
            if (arrB.contains(v - a[i])) {
                return true;
            }
            i++;
        }
        return false;

    }
}
