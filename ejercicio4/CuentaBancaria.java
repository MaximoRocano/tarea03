package ejercicio4;

public class CuentaBancaria {
    double saldo;
    double retiro;
    public void setSaldo(double saldoNum) {saldo = saldoNum;}
    public double getSaldo()
    {
        return saldo;
    }

    public void setRetiro(double retiroNum) {retiro = retiroNum;}
    public double getRetiro()
    {
        return retiro;
    }

    public void retirarSaldo()
    {
        double nuevoSaldo = getSaldo() - getRetiro();
        System.out.println("el nuevo saldo que tiene usted es ahora "+nuevoSaldo);
    }

}
