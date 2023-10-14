import java.util.Scanner;

public class PangramOrNot {
    public static boolean checkPangram(String str) {
        boolean[] mark = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if ('a' <= c && c <= 'z') {
                mark[c - 'a'] = true;
            }
        }

        for (boolean letterPresent : mark) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        if (checkPangram(str)) {
            System.out.println(str + " is a pangram.");
        } else {
            System.out.println(str + " is not a pangram.");
        }
        sc.close();
    }
}
