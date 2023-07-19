public class FizzBuzz {
    public String FizzBuzz(int numero) {
        if (numero % 5 == 0 && numero % 3 == 0) {
            return "fizzBuzz";
        }
        else if (numero % 3 == 0) {
            return "Fizz";
        }
        else if (numero % 5 == 0) {
            return "Buzz";
        }
        // return String.valueOf(numero);
        return Integer.toString(numero);
    }
}