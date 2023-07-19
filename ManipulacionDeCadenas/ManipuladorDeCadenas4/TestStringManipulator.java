public class TestStringManipulator{
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(word); // olmundo
    }
}