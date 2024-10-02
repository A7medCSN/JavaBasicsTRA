public class StandaloneIsReplacedWithISNot {
    public static void main(String[] args) {

        String str = "is is";
        String newStr = str.replaceAll("\\bis\\b", "is not");
        System.out.println(newStr);
    }
}
