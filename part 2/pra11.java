public class pra11 {
    public static void main(String args[]) {
        String str = "CHARUSAT UNIVERSITY";

        int length = str.length();
        System.out.println("Length of the string: " + length);

        String replacedStr = str.replace('H', 'A');
        System.out.println("String after replacement: " + replacedStr);

        String lowerStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerStr);
    }
}
