public class Main {
    public static void main(String[] args) {

        System.out.println(check("()"));
        System.out.println(check("(()()((())))"));
        System.out.println(check("(((())()"));
    }
    public static boolean check(String str) {
        int count = 0;
        char[] charArr = str.toCharArray();

        for (char c : charArr) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}