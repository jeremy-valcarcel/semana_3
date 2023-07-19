public class StringManipulator{
    public String trimAndConcat(String primert, String segundot){
        String primertrim = primert.trim();
        String segundotrim = segundot.trim();
        return primertrim.concat(segundotrim);
    }
}