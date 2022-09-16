package ejercicio2;

public class CanbioDeBase2 {
    int N;
    int Base;
    int Inv;
    int Numero;
    int Salida;
    public void getNum(int numN) {N = numN;}
    public int setNum() {return N;}
    public void getBase(int numBase)
    {
        Base = numBase;
    }
    public int setBase()
    {
        return Base;
    }
    public String operacion() {

        String Salida="";
        Numero= setNum();
        while (Numero>0)
        {
            Inv =(Numero % setBase());
            Numero = Numero / setBase();
            Salida= Inv+Salida;
        }
        System.out.println(Salida);
        return Salida;
    }

}
