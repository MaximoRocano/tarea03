package ejercicio5;

public class Main5 {
    public static void main(String[] args)
    {

        Matriz mostrar = new Matriz();
        mostrar.setFila(3);
        mostrar.setColumna(3);
        mostrar.setFila2(3);
        mostrar.setColumna2(3);

        System.out.println("su matriz tiene: "+mostrar.getFila()+" filas");
        System.out.println("su matriz tiene: "+mostrar.getColumna()+" columnas");
        System.out.println("su segunda matriz tiene: "+mostrar.getFila()+" filas");
        System.out.println("su segunda matriz tiene: "+mostrar.getColumna()+" columnas");

        mostrar.mostrarMatriz();
        mostrar.sumarMatriz();
        mostrar.multiplicarMatriz();
    }
}
