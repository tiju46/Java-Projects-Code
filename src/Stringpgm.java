public class Stringpgm {

    static String name = "tiju";
    private static char index1;
    private static char befoeIndex;
    public static void stringCheck(){

        index1 = name.charAt(3);
        befoeIndex = (char) name.codePointBefore(3);
        System.out.println(index1);
        int ctr = name.codePointCount(1, 3);
        System.out.println(befoeIndex);
        System.out.println(ctr);

    }

    public static void main(String[] args) {
        stringCheck();
    }
}
