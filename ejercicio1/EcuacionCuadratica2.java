package ejercicio1;

import java.lang.Math;

    public class EcuacionCuadratica2 {
        double a;
        double b;
        double c;
        double result1=0;
        double result2=0;
        public double discriminante()
        {

            double expresion;
            expresion = Math.pow(getB(), 2) - 4*getA()*getC();
            if (expresion > 0)
            {
                // Dos raices
                result1=(getB()+Math.sqrt(expresion))/2*getA();
                result2=(getB()-Math.sqrt(expresion))/2*getA();
                System.out.println(result1);
                System.out.println(result2);
            }
            else if (expresion == 0)
            {
                result1=(getB()+Math.sqrt(expresion))/2*getA();
                result2=(getB()-Math.sqrt(expresion))/2*getA();
                System.out.println(result1);
                System.out.println(result2);
            }
            else /*(expresion < 0) */
            {
                System.out.println("no tiene solucion real");
            }
            return 0;
        }
        public void setA(double numA)
        {
            a = numA;
        }
        public double getA()
        {
            return a;
        }
        public void setB(double numB)
        {
            b = numB;
        }
        public double getB()
        {
            return b;
        }
        public void setC(double numC)
        {
            c = numC;
        }
        public double getC()
        {
            return c;
        }

    }
