package ejercicio4;

public class Main4 {
    public static void main(String[] args)
    {

        CuentaBancaria retirar = new CuentaBancaria();
        retirar.setSaldo(10);
        retirar.setRetiro(1);

        System.out.println("el saldo disponible en su cuenta es: "+retirar.getSaldo());
        System.out.println("usted esta retirando de su cuenta: "+retirar.getRetiro());

        retirar.retirarSaldo();
    }
}
