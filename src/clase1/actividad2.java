package clase1;

import java.math.BigInteger;

public class actividad2 {
    public static void main(String[] args) {
        
        long nLong = 922333767547123L;
        long nLong2 = 594358394589345L;

        long productoLong = nLong * nLong2;
        System.out.println("Resultado del producto de longs: " + productoLong);

        BigInteger nBigInt = new BigInteger("922333126675757575573");
        BigInteger nBigInt2 = new BigInteger("9999984945834943582");

        BigInteger resultadoBigInt = nBigInt.multiply(nBigInt2);
        System.out.println("Resultado usando BigInteger: " + resultadoBigInt);

    }

/*long:

    Tipo de dato primitivo: long es un tipo de dato primitivo en Java que almacena enteros de 64 bits.
    Rango: Puede almacenar valores entre -2^63 y 2^63 - 1. Si necesitas trabajar con números fuera de este rango, long no será suficiente.
    Velocidad: Las operaciones con long son más rápidas que con BigInteger porque long es un tipo de dato primitivo y opera a nivel de hardware.
    BigInteger:

    Clase de Java: BigInteger es una clase en el paquete java.math que permite trabajar con números enteros de tamaño arbitrario.
    Sin límite de tamaño: A diferencia de long, BigInteger puede manejar números que son mucho más grandes que el rango de un long.
    Operaciones: Las operaciones con BigInteger son más lentas en comparación con long porque involucran más pasos a nivel de software, incluyendo la gestión de memoria y la manipulación de objetos*/
    
}
