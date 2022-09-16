package ejercicio3;

public class CambioDeTemperatura2 {
    double GC;

    public void setGC(double GCnum) {GC = GCnum;}
    public double getGC()
    {
        return GC;
    }

    public void operacion()
    {
        double F= (9/5)*getGC()+32;
        double K= getGC() +273;
        double R= (9/5)*getGC()+492;
        new String("el numero en grados centigrados es: "+GC+"convertidos a grados kelvin son"+K
                +"convertidos a grados Farenger son"+F+"convertidos a grados Rankine son"+R);
    }

}
