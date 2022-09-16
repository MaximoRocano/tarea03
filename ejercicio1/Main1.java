package ejercicio1;

public class Main1 {

    public static void main(String args[])
    {

        EcuacionCuadratica2 ecuacion = new EcuacionCuadratica2();
        ecuacion.setA(1);
        ecuacion.setB(-2);
        ecuacion.setC(-24);

        System.out.println("Valor A: "+ecuacion.getA());
        System.out.println("Valor B: "+ecuacion.getB());
        System.out.println("Valor C: "+ecuacion.getC());

        ecuacion.discriminante();


    }
}