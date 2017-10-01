package CodeFighters;

public class FirstNotRepeatingCharacter {

    /*Given a string s, find and return the first instance of a
    non-repeating character in it. If there is no such character, return '_'.*/

    public static void main(String[] args) {
        String s = "abacabad";


        for (int i = 0; i < s.length(); i++) {
            String str1 = s.substring(0, i);
            String str2 = s.substring(i + 1, s.length());
            if (str1.contains(s.charAt(i) + "") || str2.contains(s.charAt(i) + "")) {
                System.out.println("Contains: " + s.charAt(i));
            } else {
                System.out.println("Does not Contain: " + s.charAt(i));
            }

        }
        System.out.println("****Second Approach****");
        //This approach is more efficient

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println("Does not Contain: " + s.charAt(i));

            } else {
                System.out.println("Contains: " + s.charAt(i));
            }

        }
    }
}
