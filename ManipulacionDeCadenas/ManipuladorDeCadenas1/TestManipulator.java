public class TestManipulator{
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMundo 
    }
}