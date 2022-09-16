package ejercicio5;

public class Matriz {
    double fila;
    double columna;

    public void setFila(double numFila) {fila = numFila;}
    public double getFila()
    {
        return fila;
    }
    public void setColumna(double numColumna) {columna = numColumna;}
    public double getColumna()
    {
        return columna;
    }
    double fila2;
    double columna2;
    public void setFila2(double numFila2) {fila2 = numFila2;}
    public double getFila2() {return fila2;}
    public void setColumna2(double numColumna2) {columna2 = numColumna2;}
    public double getColumna2()
    {
        return columna2;
    }

    int matriz [][]= {{1,2,3},{4,5,6},{7,8,9}};
    int matriz2 [][]= {{1,2,3},{4,5,6},{7,8,9}};

    public void  mostrarMatriz()
    {
        System.out.println("Matriz 1");
        for (int i=0;i<getFila();i++){
            for (int j=0;j<getColumna();j++){
                System.out.print(" [" +matriz[i][j]+"] ");
            }
            System.out.println("");
        }
        System.out.println("Matriz 2");
        for (int i=0;i<getFila2();i++){
            for (int j=0;j<getColumna2();j++){
                System.out.print(" [" +matriz2[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    public void  sumarMatriz()
    {
        int matrizSuma[][] = new int[3][3];
        System.out.println("la suma delas 2 matrices son: ");
        for (int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matrizSuma[i][j] = matriz[i][j] + matriz2[i][j];
            }

            for (int j = 0; j < matrizSuma.length; j++) {

                System.out.print(" [" + matrizSuma[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public void  multiplicarMatriz()
    {
        int matrizProducto[][] = new int[3][3];
        System.out.println("el producto de las 2 matrices son: ");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j< matriz2.length;j++){
                matrizProducto[i][j]=matriz[i][j]*matriz2[i][j];
            }

        for (int j=0;j< matrizProducto.length;j++){

            System.out.print(" ["+matrizProducto[i][j]+"]");
        }
            System.out.println("");
        }
    }
}

