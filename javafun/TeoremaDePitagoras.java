public class TeoremaDePitagoras{
    public double calcularHipotenusa(double catetoA, double catetoB){
        double resultado = 0.0;
        if(Math.abs(catetoA) > Math.abs(catetoB)){
            resultado = catetoA/catetoB;
            resultado = Math.sqrt((catetoA*catetoA+catetoB*catetoB));
        }
        return resultado;
    }
}