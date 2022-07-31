package Palindrome;

public class Palindrome {

    public static void main(String[] args) {
        String str = "Abcd dc ba";
        System.out.println(isPalindromeWord(str));
    }

    public static boolean isPalindromeWord(String str) {
        StringBuilder sb1 = new StringBuilder(str.toLowerCase());
        for (int i = 0; i < sb1.length(); i++) {
            if (Character.isWhitespace(sb1.charAt(i))) {
                sb1.deleteCharAt(i);
                i--;
            }
        }
        StringBuilder sb2 = new StringBuilder(sb1);
        sb2.reverse();
        System.out.println(sb1);
        System.out.println(sb2);
        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }
        return false;
    }
}
