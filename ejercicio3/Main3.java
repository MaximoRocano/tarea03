package ejercicio3;

public class Main3 {

    public static void main(String[] args)
    {


        CambioDeTemperatura2 cambio = new CambioDeTemperatura2();
        cambio.setGC(1);

        System.out.println("el numero en grados centigrados es: "+cambio.getGC());


        cambio.operacion();


    }
}
