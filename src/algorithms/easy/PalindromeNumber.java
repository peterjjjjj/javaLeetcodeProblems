package algorithms.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        int length = str.length();


        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }


        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(101));
    }

}


