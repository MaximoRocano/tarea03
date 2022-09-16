package ejercicio2;

public class Main2 {
    public static void main(String args[])
    {


        CanbioDeBase2 cambio = new CanbioDeBase2();
        cambio.getNum(1000);
        cambio.getBase(8);


        System.out.println("el numero elegido: "+cambio.setNum());
        System.out.println("el cambio de base: "+cambio.setBase());


        cambio.operacion();


    }
}
