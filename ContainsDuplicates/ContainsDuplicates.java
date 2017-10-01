package CodeFighters;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicates {

    //Given an array of integers, write a function that determines whether the array contains any duplicates.
    //Your function should return true if any element appears at least twice in the array,
    //and it should return false if every element is distinct.
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        //int arr[] = {};

        ContainsDuplicates cd = new ContainsDuplicates();
        if (cd.containsDuplicate(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //Approach 1: Using HashSet
    public boolean containsDuplicate(int arr[]) {
        HashSet<Integer> prevData = new HashSet<Integer>();
        int i = 0;
       // if(arr.length > 1) {
            //prevData.add(arr[0]);
            while (i != arr.length) {
                if (prevData.contains(arr[i])) {
                    return true;
                } else {
                    prevData.add(arr[i]);
                }
                i++;
            }
       // }
        return false;
    }

    //Approach 2: Sorting the array using inbuilt sort and then
    //comparing adjacent two elements
    boolean containsDuplicates(int[] a) {
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++){
            if(a[i]==a[i-1]){
                return true;
            }
        }
        return false;

    }
}
