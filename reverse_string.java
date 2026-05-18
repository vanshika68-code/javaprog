public class reverse_string {
    public static void main(String[] args) {
        String str = "madam";

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
        if (str.equals(rev)) {
            System.out.println("Palindrome ");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}