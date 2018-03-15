package classes;

public class Equacao2Grau {
    
    
    //variable declaration 
    private int a;
    private int b;
    private int c;
    private int delta;
    
    //methods
    public String calcularRaizesDaEquacao() {
        String resultado;
        float x1;
        float x2;

        x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
        x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
        resultado = "Raíz x1: " + x1 + "\n" + "Raíz x2: " + x2;

        return resultado;
    }
    
    public void calcularDelta() {
        delta = (b * b) - 4 * a * c;
    }

    public String retornarTipoDeRaizes() {// test of roots of the equation
        String raizes;
        if (delta < 0) {
            raizes = "Essa equação não possui raízes reais.";
        } else if (delta > 0) {
            raizes = "Essa equação possui duas raízes reais.";
        } else {
            raizes = "Essa equação possui apenas uma raiz real.";
        }
        return raizes;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) throws Exception {
        if (a == 0) {
            throw new Exception("Coeficiente 'a' não pode ser zero."); //requirement validation to be a quadratic equation
        }
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
