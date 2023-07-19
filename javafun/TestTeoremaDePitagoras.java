public class TestTeoremaDePitagoras{
    public static void main(String[] args) {
        TeoremaDePitagoras calculador = new TeoremaDePitagoras();
        double resultado = calculador.calcularHipotenusa(6 , 5);
        
        System.out.println("El resultado es : " + resultado);
    }
}