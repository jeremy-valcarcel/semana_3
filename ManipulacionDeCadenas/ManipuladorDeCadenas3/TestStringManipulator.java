public class TestStringManipulator{
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int a = manipulator.getIndexOrNull(word, subString);
        int b = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(a); // 2
        System.out.println(b); // -1


    }
}